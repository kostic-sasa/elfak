package nlp;

import java.io.Serializable;
import java.util.Properties;

import org.ejml.simple.SimpleMatrix;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.neural.rnn.RNNCoreAnnotations;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations.SentimentAnnotatedTree;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.util.CoreMap;

public class NLP implements Serializable {

	private static final long serialVersionUID = -6051415282640952865L;

	private StanfordCoreNLP pipeline;

	private static NLP instance = null;

	private NLP() {
		Properties props = new Properties();
		props.setProperty("annotators", "tokenize, ssplit, parse, sentiment");
//		props.setProperty("ner.useSUTime", "false"); // for Java 9 and newer.
		pipeline = new StanfordCoreNLP(props);
		System.out.println();
	}

	public static NLP getInstance() {
		if (instance == null) {
			instance = new NLP();
		}
		return instance;
	}

//	public static void init() {
//		Properties props = new Properties();
//		props.setProperty("annotators", "tokenize, ssplit, parse, sentiment");
//		pipeline = new StanfordCoreNLP(props);
//	}

	public String findSentiment(String tweet) {
		// TODO remove stopwords and @mentions

		int mainSentiment = 0;
		String sentimentType = null;
		if (tweet != null && tweet.length() > 0) { // TODO notify
			int longest = 0;
			Annotation annotation = pipeline.process(tweet);
			for (CoreMap sentence : annotation.get(CoreAnnotations.SentencesAnnotation.class)) {
				Tree tree = sentence.get(SentimentAnnotatedTree.class);
				int sentiment = RNNCoreAnnotations.getPredictedClass(tree);
				SimpleMatrix sentiment_new = RNNCoreAnnotations.getPredictions(tree);
				System.out.println("sentiment_new: " + sentiment_new);
				String partText = sentence.toString();
				if (partText.length() > longest) {
					mainSentiment = sentiment;
					longest = partText.length();
					sentimentType = sentence.get(SentimentCoreAnnotations.SentimentClass.class);
				}
			}
		}
		return sentimentType;
	}
}
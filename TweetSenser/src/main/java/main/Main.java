package main;

import java.util.List;

import com.stanford_nlp.SentimentAnalyzer.SentimentAnalyzer;
import com.stanford_nlp.model.SentimentResult;

import nlp.NLP;
import twitter.TweetCollector;

public class Main {

	public static void main(String[] args) {

		final String QUERY = "(@McDonalds cheeseburger) OR (#McDonalds cheeseburger) "
				+ "OR (McDonald's cheeseburger) OR (McDonalds cheeseburger)";

		TweetCollector tc = new TweetCollector();

//		List<String> tweetTexts = tc.search(QUERY);
//		 tc.startStreamListening();
		// tc.getUserTimeline();
//		tc.getTweetById(834810092113403904L);
//		tc.getTweetById(965954593476829184L);

		// ---------------------------------------------

//		SentimentAnalyzer sentimentAnalyzer = new SentimentAnalyzer();
//		sentimentAnalyzer.initialize();
//		for (String tweetText : tweetTexts) {
//			SentimentResult sentimentResult = sentimentAnalyzer.getSentimentResult(tweetText);
//			System.out.println("Text: " + tweetText);
//			System.out.println("\tSentiment Score: " + sentimentResult.getSentimentScore());
//			System.out.println("\tSentiment Type: " + sentimentResult.getSentimentType());
//			System.out.println("\tVery positive: " + sentimentResult.getSentimentClass().getVeryPositive() + "%");
//			System.out.println("\tPositive: " + sentimentResult.getSentimentClass().getPositive() + "%");
//			System.out.println("\tNeutral: " + sentimentResult.getSentimentClass().getNeutral() + "%");
//			System.out.println("\tNegative: " + sentimentResult.getSentimentClass().getNegative() + "%");
//			System.out.println("\tVery negative: " + sentimentResult.getSentimentClass().getVeryNegative() + "%");
//			break;
//		}

//		for (String tweetText : tweetTexts) {
//			System.out.println(tweetText + " : " + NLP.getInstance().findSentiment(tweetText));
//			break;
//		}
		
		NLP.getInstance().findSentiment("I'm sorry to just jump on this");
		System.out.println();

	}

}

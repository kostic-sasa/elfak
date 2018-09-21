package servlets.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TweetData implements Serializable {

	private static final long serialVersionUID = 7050684379761285395L;

	private List<String> tweetTexts;

	public TweetData() {
		tweetTexts = new ArrayList<>();
	}

	public TweetData(List<String> tweetTexts) {
		this.tweetTexts = tweetTexts;
	}

	public List<String> getTweetTexts() {
		return tweetTexts;
	}

	public void setTweetTexts(List<String> tweetTexts) {
		this.tweetTexts = tweetTexts;
	}

	@Override
	public String toString() {
		return "TweetData [tweetTexts=" + tweetTexts + "]";
	}
	
}

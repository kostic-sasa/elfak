package servlets.model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Model {

	private TweetData tweetData;
	private String tweetText;
	private String sentimentType;
	private String dateFrom;
	private String dateTo;

	private static Model instance = null;

	private Model() {
		tweetData = new TweetData();
		setTweetText("");
		sentimentType = "";

//		Date date = new Date();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String today = LocalDate.now().format(formatter);
		String yesterday = LocalDate.now().minusDays(1).format(formatter);
//		String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
//		String yesterday = new SimpleDateFormat("yyyy-mm-dd").format(new Date(System.currentTimeMillis() - 86400000));
		dateFrom = today;
		dateTo = yesterday;
	}

	public static Model getInstance() {
		if (instance == null) {
			instance = new Model();
		}
		return instance;
	}

	public TweetData getTweetData() {
		return tweetData;
	}

	public void setTweetData(TweetData tweetData) {
		this.tweetData = tweetData;
	}

	public String getSentimentType() {
		return sentimentType;
	}

	public void setSentimentType(String sentimentType) {
		this.sentimentType = sentimentType;
	}

	public String getTweetText() {
		return tweetText;
	}

	public void setTweetText(String tweetText) {
		this.tweetText = tweetText;
	}

	public String getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}

	public String getDateTo() {
		return dateTo;
	}

	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}

	@Override
	public String toString() {
		return "Model [tweetData=" + tweetData + ", tweetText=" + tweetText + ", sentimentType=" + sentimentType
				+ ", dateFrom=" + dateFrom + ", dateTo=" + dateTo + "]";
	}

}

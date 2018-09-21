package twitter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import servlets.model.Model;
import twitter4j.FilterQuery;
import twitter4j.MediaEntity;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.auth.AccessToken;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;
import utils.Utils;

public class TweetCollector {

	// TODO move to properties file
	private final static String CONSUMER_KEY = "kY48MH4Rt0CZVr4RjIbg355rA";
	private final static String CONSUMER_KEY_SECRET = "LIUU2FrEKPeJ5xxMFF5GGogsCJW1V8aTOWazIL0T5ljswvAaTF";
	private final static String ACCESS_TOKEN = "99522951-849ZzeuRZPvXVFIXStmWACc59DND2CUt3lGvwz79Z";
	private final static String ACCESS_TOKEN_SECRET = "YEE2JIbVesUSqHQBlNZNGETzMIlLtHAn919FaE3llp6NT";

	private final static String ENGLISH = "en"; // ISO 639-1 English
	private final static String SERBIAN = "sr"; // ISO 639-1 Serbian

//	private final static String STREAM_FILTER = "@McDonalds #McDonalds McDonald's McDonalds";
	private final static String STREAM_FILTER = "weather";

	private static Twitter twitter;

	static {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setTweetModeExtended(true); // za novi API
		cb.setIncludeExtAltTextEnabled(true); // isto
		Configuration conf = cb.build();

		twitter = new TwitterFactory(conf).getInstance();
		twitter.setOAuthConsumer(CONSUMER_KEY, CONSUMER_KEY_SECRET);
		AccessToken oathAccessToken = new AccessToken(ACCESS_TOKEN, ACCESS_TOKEN_SECRET);
		twitter.setOAuthAccessToken(oathAccessToken);
	}

	public List<String> search(String terms, String dateFrom, String dateTo) {
		String query_terms = terms; // TODO CSV terms...
		Query query = new Query(query_terms);
		query.setLang(ENGLISH);

//		Date date = new Date();
//		String modifiedDate = new SimpleDateFormat("yyyy-mm-dd").format(date);
//		modifiedDate = "2018-09-18"; // TODO add date param
		if (!Utils.isNullOrEmpty(dateFrom)) {
			query.setSince(dateFrom);
			Model.getInstance().setDateFrom(dateTo);
		}
//		if (!Utils.isNullOrEmpty(dateTo)) {
//			query.setUntil(dateTo);
//			Model.getInstance().setDateTo(dateTo);
//		}

		QueryResult result = null;
		List<Status> tweets = new ArrayList<Status>();
		List<String> tweetTexts = new ArrayList<String>();

		do {
			try {
				result = twitter.search(query);
				// tweets.addAll(result.getTweets());
				for (Status status : result.getTweets()) {
					/** get original tweet **/ // TODO calculate validity by retweets
					while (status.isRetweet()) {
						status = status.getRetweetedStatus();
					}
					tweets.add(status);
				}
			} catch (TwitterException e) {
				e.printStackTrace();
				break;
			}
		} while ((query = result.nextQuery()) != null);

		// TODO remove duplicates (maybe JaroWinkler)

		for (Status tweet : tweets) {
			tweetTexts.add(tweet.getText());
		}
		System.out.println(tweets.size() + " tweets total.");
//		System.out.println(tweetTexts.size() + " unique total.");
		System.out.println("-------------------");
		System.out.println("Tweet search finished.");

		return tweetTexts;
	}

	public void startStreamListening() {
		StatusListenerImpl listener = new StatusListenerImpl();
		TwitterStream twitterStream = new TwitterStreamFactory().getInstance();
		twitterStream.addListener(listener);
		// sample() method internally creates a thread which manipulates
		// TwitterStream and calls these adequate listener methods continuously.
		// twitterStream.sample();

		// private LiveTwStreamListener listener = null;

		// TODO find better way
		// List<String> filters =
		// XmlUtil.loadChildElements("common-track-terms",
		// Helper.getfsConfigFile());
		List<String> filters = new ArrayList<String>();
		filters.add(STREAM_FILTER);

		AccessToken accessToken = new AccessToken(ACCESS_TOKEN, ACCESS_TOKEN_SECRET);
		twitterStream.setOAuthConsumer(CONSUMER_KEY, CONSUMER_KEY_SECRET);
		twitterStream.setOAuthAccessToken(accessToken);

		try {
			Twitter twitter = new TwitterFactory().getInstance();
			twitter.setOAuthConsumer(CONSUMER_KEY, CONSUMER_KEY_SECRET);
			twitter.setOAuthAccessToken(accessToken);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		String[] filterArray = filters.toArray(new String[0]);

		String[] lang = { ENGLISH };
		FilterQuery fq = new FilterQuery();
		fq.track(filterArray);
//		fq.language(lang);
		twitterStream.filter(fq);
	}

	// public void stopStreamListening() {
	// if (twitterStream != null)
	// twitterStream.shutdown();
	// }

	public void getUserTimeline(/* String user */) {

		String user = "cavs";

		try {
			List<Status> statuses = twitter.getUserTimeline(user);

			System.out.println("Showing @" + user + "'s user timeline.");
			for (Status status : statuses) {
				status.getId();
				System.out.println("@" + status.getUser().getScreenName() + " - " + status.getText());
			}
		} catch (TwitterException te) {
			te.printStackTrace();
			System.out.println("Failed to get timeline: " + te.getMessage());
			System.exit(-1);
		}
	}

	public void getTweetById(long tweetId) {
		try {
//			Configuration configuration = twitter.getConfiguration();
//			configuration.isTweetModeExtended();

			Status status = twitter.showStatus(tweetId);
			System.out.println(status);
			System.out.println(status.getText());

			Map<String, Integer> medias = extractMedia(status);
			System.out.println(medias);

		} catch (TwitterException te) {
			te.printStackTrace();
			System.out.println("Failed to get tweetId: " + te.getMessage());
			System.exit(-1);
		}
	}

	private static Map<String, Integer> extractMedia(Status status) {

		final int PHOTO = 1;
		final int VIDEO = 2;

		Map<String, Integer> media_urls = new HashMap<String, Integer>();
		try {
			MediaEntity[] medias = status.getMediaEntities();
			for (int i = 0; i < medias.length; i++) {
				MediaEntity media = medias[i];
				if (media.getType().equals("photo")) {
					media_urls.put(media.getMediaURL(), PHOTO);
				} else if (media.getType().equals("video")) {
					media_urls.put(media.getMediaURL(), VIDEO);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return media_urls;
	}
}

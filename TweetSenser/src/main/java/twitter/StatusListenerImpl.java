package twitter;

import org.jooq.DSLContext;

import db.tables.records.StatusRecord;
import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import utils.Db;
import static db.Tables.STATUS;

public class StatusListenerImpl implements twitter4j.StatusListener {

	public void onStatus(Status status) {
		while (status.isRetweet()) {
			System.out.println("\t @" + status.getUser().getScreenName() + " - " + status.getText());
			status = status.getRetweetedStatus();
		}
		System.out.println("@" + status.getUser().getScreenName() + " - " + status.getText());
		
//		DSLContext db = Db.getDbContext();
//
//		// db.tables.pojos.Status dbStatus = new db.tables.pojos.Status();
//		StatusRecord statusRecord = db.newRecord(STATUS, status);
//		db.executeInsert(statusRecord);
	}

	public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {
		System.out.println("Got a status deletion notice id:" + statusDeletionNotice.getStatusId());
	}

	public void onTrackLimitationNotice(int numberOfLimitedStatuses) {
		System.out.println("Got track limitation notice:" + numberOfLimitedStatuses);
	}

	public void onScrubGeo(long userId, long upToStatusId) {
		System.out.println("Got scrub_geo event userId:" + userId + " upToStatusId:" + upToStatusId);
	}

	public void onStallWarning(StallWarning warning) {
		System.out.println("Got stall warning:" + warning);
	}

	public void onException(Exception ex) {
		ex.printStackTrace();
	}

}

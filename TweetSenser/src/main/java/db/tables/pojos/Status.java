/*
 * This file is generated by jOOQ.
*/
package db.tables.pojos;


import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Status implements Serializable {

    private static final long serialVersionUID = 1526434123;

    private Integer   id;
    private Integer   tweetId;
    private String    product;
    private String    subProduct;
    private Timestamp tweetDate;
    private String    tweetmsg;
    private String    tweetsource;
    private Byte      isTruncated;
    private Integer   inReplyToStatusId;
    private Integer   inReplyToUserId;
    private Byte      isFavorited;
    private Byte      isRetweeted;
    private Integer   favoriteCount;
    private String    inReplyToScreenName;
    private String    geoLocation;
    private String    place;
    private Integer   retweetCount;
    private Byte      isPossiblySensitive;
    private Byte      isoLanguageCode;
    private String    lang;
    private Byte      retweetedStatus;
    private String    hashtagEntities;
    private Integer   currentUserRetweetId;
    private Integer   userId;
    private String    userName;
    private String    screenName;
    private String    userLocation;
    private String    userDescription;
    private Byte      isContributorsEnabled;
    private String    profileImageUrl;
    private String    profileImageUrlHttp;
    private String    url;
    private Byte      isProtected;
    private Integer   followersCount;
    private Byte      twitterStatus;
    private Byte      profileUseBackgroundImage;
    private Integer   friendsCount;
    private Date      createdAt;
    private Integer   favouritesCount;
    private Integer   utcOffset;
    private String    timeZone;
    private Integer   statusesCount;
    private Byte      isGeoEnabled;
    private Byte      isVerified;
    private Byte      translator;
    private Integer   listedCount;
    private Byte      isFollowRequestSent;

    public Status() {}

    public Status(Status value) {
        this.id = value.id;
        this.tweetId = value.tweetId;
        this.product = value.product;
        this.subProduct = value.subProduct;
        this.tweetDate = value.tweetDate;
        this.tweetmsg = value.tweetmsg;
        this.tweetsource = value.tweetsource;
        this.isTruncated = value.isTruncated;
        this.inReplyToStatusId = value.inReplyToStatusId;
        this.inReplyToUserId = value.inReplyToUserId;
        this.isFavorited = value.isFavorited;
        this.isRetweeted = value.isRetweeted;
        this.favoriteCount = value.favoriteCount;
        this.inReplyToScreenName = value.inReplyToScreenName;
        this.geoLocation = value.geoLocation;
        this.place = value.place;
        this.retweetCount = value.retweetCount;
        this.isPossiblySensitive = value.isPossiblySensitive;
        this.isoLanguageCode = value.isoLanguageCode;
        this.lang = value.lang;
        this.retweetedStatus = value.retweetedStatus;
        this.hashtagEntities = value.hashtagEntities;
        this.currentUserRetweetId = value.currentUserRetweetId;
        this.userId = value.userId;
        this.userName = value.userName;
        this.screenName = value.screenName;
        this.userLocation = value.userLocation;
        this.userDescription = value.userDescription;
        this.isContributorsEnabled = value.isContributorsEnabled;
        this.profileImageUrl = value.profileImageUrl;
        this.profileImageUrlHttp = value.profileImageUrlHttp;
        this.url = value.url;
        this.isProtected = value.isProtected;
        this.followersCount = value.followersCount;
        this.twitterStatus = value.twitterStatus;
        this.profileUseBackgroundImage = value.profileUseBackgroundImage;
        this.friendsCount = value.friendsCount;
        this.createdAt = value.createdAt;
        this.favouritesCount = value.favouritesCount;
        this.utcOffset = value.utcOffset;
        this.timeZone = value.timeZone;
        this.statusesCount = value.statusesCount;
        this.isGeoEnabled = value.isGeoEnabled;
        this.isVerified = value.isVerified;
        this.translator = value.translator;
        this.listedCount = value.listedCount;
        this.isFollowRequestSent = value.isFollowRequestSent;
    }

    public Status(
        Integer   id,
        Integer   tweetId,
        String    product,
        String    subProduct,
        Timestamp tweetDate,
        String    tweetmsg,
        String    tweetsource,
        Byte      isTruncated,
        Integer   inReplyToStatusId,
        Integer   inReplyToUserId,
        Byte      isFavorited,
        Byte      isRetweeted,
        Integer   favoriteCount,
        String    inReplyToScreenName,
        String    geoLocation,
        String    place,
        Integer   retweetCount,
        Byte      isPossiblySensitive,
        Byte      isoLanguageCode,
        String    lang,
        Byte      retweetedStatus,
        String    hashtagEntities,
        Integer   currentUserRetweetId,
        Integer   userId,
        String    userName,
        String    screenName,
        String    userLocation,
        String    userDescription,
        Byte      isContributorsEnabled,
        String    profileImageUrl,
        String    profileImageUrlHttp,
        String    url,
        Byte      isProtected,
        Integer   followersCount,
        Byte      twitterStatus,
        Byte      profileUseBackgroundImage,
        Integer   friendsCount,
        Date      createdAt,
        Integer   favouritesCount,
        Integer   utcOffset,
        String    timeZone,
        Integer   statusesCount,
        Byte      isGeoEnabled,
        Byte      isVerified,
        Byte      translator,
        Integer   listedCount,
        Byte      isFollowRequestSent
    ) {
        this.id = id;
        this.tweetId = tweetId;
        this.product = product;
        this.subProduct = subProduct;
        this.tweetDate = tweetDate;
        this.tweetmsg = tweetmsg;
        this.tweetsource = tweetsource;
        this.isTruncated = isTruncated;
        this.inReplyToStatusId = inReplyToStatusId;
        this.inReplyToUserId = inReplyToUserId;
        this.isFavorited = isFavorited;
        this.isRetweeted = isRetweeted;
        this.favoriteCount = favoriteCount;
        this.inReplyToScreenName = inReplyToScreenName;
        this.geoLocation = geoLocation;
        this.place = place;
        this.retweetCount = retweetCount;
        this.isPossiblySensitive = isPossiblySensitive;
        this.isoLanguageCode = isoLanguageCode;
        this.lang = lang;
        this.retweetedStatus = retweetedStatus;
        this.hashtagEntities = hashtagEntities;
        this.currentUserRetweetId = currentUserRetweetId;
        this.userId = userId;
        this.userName = userName;
        this.screenName = screenName;
        this.userLocation = userLocation;
        this.userDescription = userDescription;
        this.isContributorsEnabled = isContributorsEnabled;
        this.profileImageUrl = profileImageUrl;
        this.profileImageUrlHttp = profileImageUrlHttp;
        this.url = url;
        this.isProtected = isProtected;
        this.followersCount = followersCount;
        this.twitterStatus = twitterStatus;
        this.profileUseBackgroundImage = profileUseBackgroundImage;
        this.friendsCount = friendsCount;
        this.createdAt = createdAt;
        this.favouritesCount = favouritesCount;
        this.utcOffset = utcOffset;
        this.timeZone = timeZone;
        this.statusesCount = statusesCount;
        this.isGeoEnabled = isGeoEnabled;
        this.isVerified = isVerified;
        this.translator = translator;
        this.listedCount = listedCount;
        this.isFollowRequestSent = isFollowRequestSent;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTweetId() {
        return this.tweetId;
    }

    public void setTweetId(Integer tweetId) {
        this.tweetId = tweetId;
    }

    public String getProduct() {
        return this.product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getSubProduct() {
        return this.subProduct;
    }

    public void setSubProduct(String subProduct) {
        this.subProduct = subProduct;
    }

    public Timestamp getTweetDate() {
        return this.tweetDate;
    }

    public void setTweetDate(Timestamp tweetDate) {
        this.tweetDate = tweetDate;
    }

    public String getTweetmsg() {
        return this.tweetmsg;
    }

    public void setTweetmsg(String tweetmsg) {
        this.tweetmsg = tweetmsg;
    }

    public String getTweetsource() {
        return this.tweetsource;
    }

    public void setTweetsource(String tweetsource) {
        this.tweetsource = tweetsource;
    }

    public Byte getIsTruncated() {
        return this.isTruncated;
    }

    public void setIsTruncated(Byte isTruncated) {
        this.isTruncated = isTruncated;
    }

    public Integer getInReplyToStatusId() {
        return this.inReplyToStatusId;
    }

    public void setInReplyToStatusId(Integer inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    public Integer getInReplyToUserId() {
        return this.inReplyToUserId;
    }

    public void setInReplyToUserId(Integer inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    public Byte getIsFavorited() {
        return this.isFavorited;
    }

    public void setIsFavorited(Byte isFavorited) {
        this.isFavorited = isFavorited;
    }

    public Byte getIsRetweeted() {
        return this.isRetweeted;
    }

    public void setIsRetweeted(Byte isRetweeted) {
        this.isRetweeted = isRetweeted;
    }

    public Integer getFavoriteCount() {
        return this.favoriteCount;
    }

    public void setFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public String getInReplyToScreenName() {
        return this.inReplyToScreenName;
    }

    public void setInReplyToScreenName(String inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    public String getGeoLocation() {
        return this.geoLocation;
    }

    public void setGeoLocation(String geoLocation) {
        this.geoLocation = geoLocation;
    }

    public String getPlace() {
        return this.place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Integer getRetweetCount() {
        return this.retweetCount;
    }

    public void setRetweetCount(Integer retweetCount) {
        this.retweetCount = retweetCount;
    }

    public Byte getIsPossiblySensitive() {
        return this.isPossiblySensitive;
    }

    public void setIsPossiblySensitive(Byte isPossiblySensitive) {
        this.isPossiblySensitive = isPossiblySensitive;
    }

    public Byte getIsoLanguageCode() {
        return this.isoLanguageCode;
    }

    public void setIsoLanguageCode(Byte isoLanguageCode) {
        this.isoLanguageCode = isoLanguageCode;
    }

    public String getLang() {
        return this.lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Byte getRetweetedStatus() {
        return this.retweetedStatus;
    }

    public void setRetweetedStatus(Byte retweetedStatus) {
        this.retweetedStatus = retweetedStatus;
    }

    public String getHashtagEntities() {
        return this.hashtagEntities;
    }

    public void setHashtagEntities(String hashtagEntities) {
        this.hashtagEntities = hashtagEntities;
    }

    public Integer getCurrentUserRetweetId() {
        return this.currentUserRetweetId;
    }

    public void setCurrentUserRetweetId(Integer currentUserRetweetId) {
        this.currentUserRetweetId = currentUserRetweetId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getScreenName() {
        return this.screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getUserLocation() {
        return this.userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public String getUserDescription() {
        return this.userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }

    public Byte getIsContributorsEnabled() {
        return this.isContributorsEnabled;
    }

    public void setIsContributorsEnabled(Byte isContributorsEnabled) {
        this.isContributorsEnabled = isContributorsEnabled;
    }

    public String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getProfileImageUrlHttp() {
        return this.profileImageUrlHttp;
    }

    public void setProfileImageUrlHttp(String profileImageUrlHttp) {
        this.profileImageUrlHttp = profileImageUrlHttp;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Byte getIsProtected() {
        return this.isProtected;
    }

    public void setIsProtected(Byte isProtected) {
        this.isProtected = isProtected;
    }

    public Integer getFollowersCount() {
        return this.followersCount;
    }

    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    public Byte getTwitterStatus() {
        return this.twitterStatus;
    }

    public void setTwitterStatus(Byte twitterStatus) {
        this.twitterStatus = twitterStatus;
    }

    public Byte getProfileUseBackgroundImage() {
        return this.profileUseBackgroundImage;
    }

    public void setProfileUseBackgroundImage(Byte profileUseBackgroundImage) {
        this.profileUseBackgroundImage = profileUseBackgroundImage;
    }

    public Integer getFriendsCount() {
        return this.friendsCount;
    }

    public void setFriendsCount(Integer friendsCount) {
        this.friendsCount = friendsCount;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getFavouritesCount() {
        return this.favouritesCount;
    }

    public void setFavouritesCount(Integer favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    public Integer getUtcOffset() {
        return this.utcOffset;
    }

    public void setUtcOffset(Integer utcOffset) {
        this.utcOffset = utcOffset;
    }

    public String getTimeZone() {
        return this.timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Integer getStatusesCount() {
        return this.statusesCount;
    }

    public void setStatusesCount(Integer statusesCount) {
        this.statusesCount = statusesCount;
    }

    public Byte getIsGeoEnabled() {
        return this.isGeoEnabled;
    }

    public void setIsGeoEnabled(Byte isGeoEnabled) {
        this.isGeoEnabled = isGeoEnabled;
    }

    public Byte getIsVerified() {
        return this.isVerified;
    }

    public void setIsVerified(Byte isVerified) {
        this.isVerified = isVerified;
    }

    public Byte getTranslator() {
        return this.translator;
    }

    public void setTranslator(Byte translator) {
        this.translator = translator;
    }

    public Integer getListedCount() {
        return this.listedCount;
    }

    public void setListedCount(Integer listedCount) {
        this.listedCount = listedCount;
    }

    public Byte getIsFollowRequestSent() {
        return this.isFollowRequestSent;
    }

    public void setIsFollowRequestSent(Byte isFollowRequestSent) {
        this.isFollowRequestSent = isFollowRequestSent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Status (");

        sb.append(id);
        sb.append(", ").append(tweetId);
        sb.append(", ").append(product);
        sb.append(", ").append(subProduct);
        sb.append(", ").append(tweetDate);
        sb.append(", ").append(tweetmsg);
        sb.append(", ").append(tweetsource);
        sb.append(", ").append(isTruncated);
        sb.append(", ").append(inReplyToStatusId);
        sb.append(", ").append(inReplyToUserId);
        sb.append(", ").append(isFavorited);
        sb.append(", ").append(isRetweeted);
        sb.append(", ").append(favoriteCount);
        sb.append(", ").append(inReplyToScreenName);
        sb.append(", ").append(geoLocation);
        sb.append(", ").append(place);
        sb.append(", ").append(retweetCount);
        sb.append(", ").append(isPossiblySensitive);
        sb.append(", ").append(isoLanguageCode);
        sb.append(", ").append(lang);
        sb.append(", ").append(retweetedStatus);
        sb.append(", ").append(hashtagEntities);
        sb.append(", ").append(currentUserRetweetId);
        sb.append(", ").append(userId);
        sb.append(", ").append(userName);
        sb.append(", ").append(screenName);
        sb.append(", ").append(userLocation);
        sb.append(", ").append(userDescription);
        sb.append(", ").append(isContributorsEnabled);
        sb.append(", ").append(profileImageUrl);
        sb.append(", ").append(profileImageUrlHttp);
        sb.append(", ").append(url);
        sb.append(", ").append(isProtected);
        sb.append(", ").append(followersCount);
        sb.append(", ").append(twitterStatus);
        sb.append(", ").append(profileUseBackgroundImage);
        sb.append(", ").append(friendsCount);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(favouritesCount);
        sb.append(", ").append(utcOffset);
        sb.append(", ").append(timeZone);
        sb.append(", ").append(statusesCount);
        sb.append(", ").append(isGeoEnabled);
        sb.append(", ").append(isVerified);
        sb.append(", ").append(translator);
        sb.append(", ").append(listedCount);
        sb.append(", ").append(isFollowRequestSent);

        sb.append(")");
        return sb.toString();
    }
}
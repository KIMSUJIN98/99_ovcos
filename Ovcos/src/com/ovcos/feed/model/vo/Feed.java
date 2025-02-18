package com.ovcos.feed.model.vo;

import java.sql.Date;

public class Feed {

	private int feedIndex;    //	피드번호
	private String feedDate;//	작성일자
	private String feedTitle;//	피드제목
	private String feedCnt;//	피드내용
	private int feedEval;//	별점
	private String feedPublicType;//피드공개여부
	private String feedPathNy;// 경로등록여부
	private String feedRprNy;//	피드신고여부
	private String feedRprDate; // 신고시간
	private double distance; // 거리
	private double startLat; // 시작 위도
	private double startLon;// 시작 경도
	private String feedDelNy;//	피드삭제여부
	private String MemId;//	회원 아이디
	private String path;//파일경로===changeName
	private String memName;//회원이름
	private String memNick;//회원닉네임
	private String originName;//파일원래이름
	private String feedRprId;
	private int count; //찜개수 
	private String imgPath;

	private int feedCommentNo; // 댓글 번호
	private String feedCommentContent; // 댓글 내용

	
	public Feed() {}
	
	public Feed(int feedIndex, int feedCommentNo, String memId, String feedCommentContent, String feedDate) {
		super();
		this.feedIndex = feedIndex;
		this.feedCommentNo = feedCommentNo;
		this.MemId = memId;
		this.feedCommentContent = feedCommentContent;
		this.feedDate = feedDate;
	}
	
	

	
	

	public Feed(int feedIndex, String feedDate, String feedTitle, String feedCnt, int feedEval, String feedPublicType,
			String feedPathNy, double distance, double startLat, double startLon, String memId, String path,
			String memName, String memNick, String originName, int count, String imgPath) {
		super();
		this.feedIndex = feedIndex;
		this.feedDate = feedDate;
		this.feedTitle = feedTitle;
		this.feedCnt = feedCnt;
		this.feedEval = feedEval;
		this.feedPublicType = feedPublicType;
		this.feedPathNy = feedPathNy;
		this.distance = distance;
		this.startLat = startLat;
		this.startLon = startLon;
		MemId = memId;
		this.path = path;
		this.memName = memName;
		this.memNick = memNick;
		this.originName = originName;
		this.count = count;
		this.imgPath = imgPath;
	}








	public Feed(int feedIndex, String feedDate, String feedTitle, String feedCnt, int feedEval, String feedPublicType,
			String feedPathNy, double distance, double startLat, double startLon, String memId, String path,
			String memName, String memNick, String originName, String imgPath) {
		super();
		this.feedIndex = feedIndex;
		this.feedDate = feedDate;
		this.feedTitle = feedTitle;
		this.feedCnt = feedCnt;
		this.feedEval = feedEval;
		this.feedPublicType = feedPublicType;
		this.feedPathNy = feedPathNy;
		this.distance = distance;
		this.startLat = startLat;
		this.startLon = startLon;
		MemId = memId;
		this.path = path;
		this.memName = memName;
		this.memNick = memNick;
		this.originName = originName;
		this.imgPath = imgPath;
	}






	public Feed(int feedIndex, String feedDate, String feedTitle, String feedCnt, int feedEval, String feedPublicType,
			String feedPathNy, String feedRprNy, String feedRprDate, double distance, double startLat, double startLon,
			String feedDelNy, String memId, String path, String memName, String memNick, String originName, int count) {
		super();
		this.feedIndex = feedIndex;
		this.feedDate = feedDate;
		this.feedTitle = feedTitle;
		this.feedCnt = feedCnt;
		this.feedEval = feedEval;
		this.feedPublicType = feedPublicType;
		this.feedPathNy = feedPathNy;
		this.feedRprNy = feedRprNy;
		this.feedRprDate = feedRprDate;
		this.distance = distance;
		this.startLat = startLat;
		this.startLon = startLon;
		this.feedDelNy = feedDelNy;
		MemId = memId;
		this.path = path;
		this.memName = memName;
		this.memNick = memNick;
		this.originName = originName;
		this.count = count;
	}


	


	public Feed(int feedIndex, String feedDate, String feedTitle, String feedCnt, int feedEval, String feedPublicType,
			String feedPathNy, double distance, double startLat, double startLon, String memId, String path,
			String memName, String memNick, String originName) {
		super();
		this.feedIndex = feedIndex;
		this.feedDate = feedDate;
		this.feedTitle = feedTitle;
		this.feedCnt = feedCnt;
		this.feedEval = feedEval;
		this.feedPublicType = feedPublicType;
		this.feedPathNy = feedPathNy;
		this.distance = distance;
		this.startLat = startLat;
		this.startLon = startLon;
		MemId = memId;
		this.path = path;
		this.memName = memName;
		this.memNick = memNick;
		this.originName = originName;
	}




	public Feed(int feedIndex, String feedDate, String feedTitle, String feedCnt, int feedEval, String feedPublicType,
			String feedPathNy, String feedRprNy, String feedRprDate, double distance, double startLat, double startLon,
			String feedDelNy, String memId, String path, String memName, String memNick, String originName) {
		super();
		this.feedIndex = feedIndex;
		this.feedDate = feedDate;
		this.feedTitle = feedTitle;
		this.feedCnt = feedCnt;
		this.feedEval = feedEval;
		this.feedPublicType = feedPublicType;
		this.feedPathNy = feedPathNy;
		this.feedRprNy = feedRprNy;
		this.feedRprDate = feedRprDate;
		this.distance = distance;
		this.startLat = startLat;
		this.startLon = startLon;
		this.feedDelNy = feedDelNy;
		this.MemId = memId;
		this.path = path;
		this.memName = memName;
		this.memNick = memNick;
		this.originName = originName;
	}




	public Feed(int feedIndex, String feedDate, String feedTitle, String feedCnt, int feedEval, double distance,
			double startLat, double startLon, String memId, String path, String memName, String memNick,
			String originName, String imgPath) {
		super();
		this.feedIndex = feedIndex;
		this.feedDate = feedDate;
		this.feedTitle = feedTitle;
		this.feedCnt = feedCnt;
		this.feedEval = feedEval;
		this.distance = distance;
		this.startLat = startLat;
		this.startLon = startLon;
		this.MemId = memId;
		this.path = path;
		this.memName = memName;
		this.memNick = memNick;
		this.originName = originName;
		this.imgPath = imgPath;
	}




	public Feed(int feedIndex, String feedDate, String feedTitle, String feedCnt, int feedEval, String feedPublicType,
			String feedPathNy, String feedRprNy, String feedRprDate, double distance, double startLat, double startLon,
			String feedDelNy, String memId, String path) {
		super();
		this.feedIndex = feedIndex;
		this.feedDate = feedDate;
		this.feedTitle = feedTitle;
		this.feedCnt = feedCnt;
		this.feedEval = feedEval;
		this.feedPublicType = feedPublicType;
		this.feedPathNy = feedPathNy;
		this.feedRprNy = feedRprNy;
		this.feedRprDate = feedRprDate;
		this.distance = distance;
		this.startLat = startLat;
		this.startLon = startLon;
		this.feedDelNy = feedDelNy;
		MemId = memId;
		this.path = path;
	}





	public Feed(int feedIndex, String feedDate, String feedTitle, String feedCnt, int feedEval, String feedPublicType,
			String feedPathNy, String feedRprNy, String feedRprDate, double distance, double startLat, double startLon,
			String feedDelNy, String memId) {
		super();
		this.feedIndex = feedIndex;
		this.feedDate = feedDate;
		this.feedTitle = feedTitle;
		this.feedCnt = feedCnt;
		this.feedEval = feedEval;
		this.feedPublicType = feedPublicType;
		this.feedPathNy = feedPathNy;
		this.feedRprNy = feedRprNy;
		this.feedRprDate = feedRprDate;
		this.distance = distance;
		this.startLat = startLat;
		this.startLon = startLon;
		this.feedDelNy = feedDelNy;
		MemId = memId;
	}

	
	



	public Feed(int feedIndex, String feedDate, String feedTitle, String feedCnt, int feedEval, double distance,
			double startLat, double startLon, String memId) {
		super();
		this.feedIndex = feedIndex;
		this.feedDate = feedDate;
		this.feedTitle = feedTitle;
		this.feedCnt = feedCnt;
		this.feedEval = feedEval;
		this.distance = distance;
		this.startLat = startLat;
		this.startLon = startLon;
		MemId = memId;
	}


	
	


	public Feed(int feedIndex, String feedDate, String feedTitle, String feedCnt, int feedEval, String feedPathNy,
			String feedRprDate, double distance, double startLat, double startLon, String memId) {
		super();
		this.feedIndex = feedIndex;
		this.feedDate = feedDate;
		this.feedTitle = feedTitle;
		this.feedCnt = feedCnt;
		this.feedEval = feedEval;
		this.feedPathNy = feedPathNy;
		this.feedRprDate = feedRprDate;
		this.distance = distance;
		this.startLat = startLat;
		this.startLon = startLon;
		MemId = memId;
	}
	



	public Feed(int feedIndex, String feedDate, String feedTitle, String feedCnt, int feedEval, double distance,
			double startLat, double startLon, String memId, String path, String memName, String memNick,
			String originName, int count, String imgPath) {
		super();
		this.feedIndex = feedIndex;
		this.feedDate = feedDate;
		this.feedTitle = feedTitle;
		this.feedCnt = feedCnt;
		this.feedEval = feedEval;
		this.distance = distance;
		this.startLat = startLat;
		this.startLon = startLon;
		MemId = memId;
		this.path = path;
		this.memName = memName;
		this.memNick = memNick;
		this.originName = originName;
		this.count = count;
		this.imgPath = imgPath;
	}
	
	
	
	
	
	


	public int getFeedCommentNo() {
		return feedCommentNo;
	}

	public void setFeedCommentNo(int feedCommentNo) {
		this.feedCommentNo = feedCommentNo;
	}

	public String getFeedCommentContent() {
		return feedCommentContent;
	}

	public void setFeedCommentContent(String feedCommentContent) {
		this.feedCommentContent = feedCommentContent;
	}

	
	
	
	
	
	
	public String getImgPath() {
		return imgPath;
	}




	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	


	public Feed(int feedIndex, String feedDate, String feedTitle, String feedCnt, int feedEval, String feedPublicType,
			String feedPathNy, String feedRprNy, String feedRprDate, double distance, double startLat, double startLon,
			String feedDelNy, String memId, String path, String memName, String memNick, String originName, int count,
			String feedRprId, String imgPath) {
		super();
		this.feedIndex = feedIndex;
		this.feedDate = feedDate;
		this.feedTitle = feedTitle;
		this.feedCnt = feedCnt;
		this.feedEval = feedEval;
		this.feedPublicType = feedPublicType;
		this.feedPathNy = feedPathNy;
		this.feedRprNy = feedRprNy;
		this.feedRprDate = feedRprDate;
		this.distance = distance;
		this.startLat = startLat;
		this.startLon = startLon;
		this.feedDelNy = feedDelNy;
		this.MemId = memId;
		this.path = path;
		this.memName = memName;
		this.memNick = memNick;
		this.originName = originName;
		this.count = count;
		this.feedRprId = feedRprId;
		this.imgPath = imgPath;
	}




	public int getFeedIndex() {
		return feedIndex;
	}




	public void setFeedIndex(int feedIndex) {
		this.feedIndex = feedIndex;
	}




	public String getFeedDate() {
		return feedDate;
	}




	public void setFeedDate(String feedDate) {
		this.feedDate = feedDate;
	}




	public String getFeedTitle() {
		return feedTitle;
	}




	public void setFeedTitle(String feedTitle) {
		this.feedTitle = feedTitle;
	}




	public String getFeedCnt() {
		return feedCnt;
	}




	public void setFeedCnt(String feedCnt) {
		this.feedCnt = feedCnt;
	}




	public int getFeedEval() {
		return feedEval;
	}




	public void setFeedEval(int feedEval) {
		this.feedEval = feedEval;
	}




	public String getFeedPublicType() {
		return feedPublicType;
	}




	public void setFeedPublicType(String feedPublicType) {
		this.feedPublicType = feedPublicType;
	}




	public String getFeedPathNy() {
		return feedPathNy;
	}




	public void setFeedPathNy(String feedPathNy) {
		this.feedPathNy = feedPathNy;
	}




	public String getFeedRprNy() {
		return feedRprNy;
	}




	public void setFeedRprNy(String feedRprNy) {
		this.feedRprNy = feedRprNy;
	}




	public String getFeedRprDate() {
		return feedRprDate;
	}




	public void setFeedRprDate(String feedRprDate) {
		this.feedRprDate = feedRprDate;
	}




	public double getDistance() {
		return distance;
	}




	public void setDistance(double distance) {
		this.distance = distance;
	}




	public double getStartLat() {
		return startLat;
	}




	public void setStartLat(double startLat) {
		this.startLat = startLat;
	}




	public double getStartLon() {
		return startLon;
	}




	public void setStartLon(double startLon) {
		this.startLon = startLon;
	}




	public String getFeedDelNy() {
		return feedDelNy;
	}




	public void setFeedDelNy(String feedDelNy) {
		this.feedDelNy = feedDelNy;
	}




	public String getMemId() {
		return MemId;
	}




	public void setMemId(String memId) {
		MemId = memId;
	}




	public String getPath() {
		return path;
	}




	public void setPath(String path) {
		this.path = path;
	}




	public String getMemName() {
		return memName;
	}




	public void setMemName(String memName) {
		this.memName = memName;
	}




	public String getMemNick() {
		return memNick;
	}




	public void setMemNick(String memNick) {
		this.memNick = memNick;
	}




	public String getOriginName() {
		return originName;
	}




	public void setOriginName(String originName) {
		this.originName = originName;
	}




	public int getCount() {
		return count;
	}




	public void setCount(int count) {
		this.count = count;
	}




	@Override
	public String toString() {
		return "Feed [feedIndex=" + feedIndex + ", feedDate=" + feedDate + ", feedTitle=" + feedTitle + ", feedCnt="
				+ feedCnt + ", feedEval=" + feedEval + ", feedPublicType=" + feedPublicType + ", feedPathNy="
				+ feedPathNy + ", feedRprNy=" + feedRprNy + ", feedRprDate=" + feedRprDate + ", distance=" + distance
				+ ", startLat=" + startLat + ", startLon=" + startLon + ", feedDelNy=" + feedDelNy + ", MemId=" + MemId
				+ ", path=" + path + ", memName=" + memName + ", memNick=" + memNick + ", originName=" + originName
				+ ", count=" + count + ", imgPath=" + imgPath + "]";
	}




	





	
	
	
	
	
}

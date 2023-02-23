package com.ovcos.challenge.model.vo;

import java.sql.Date;

public class Contest {
	private int contestNo;
	private String contestName;
	private Date contestDate;
	private String contestUrl;
	private String delStatus;
	
	public Contest() {}

	public Contest(int contestNo, String contestName, Date contestDate, String contestUrl, String delStatus) {
		super();
		this.contestNo = contestNo;
		this.contestName = contestName;
		this.contestDate = contestDate;
		this.contestUrl = contestUrl;
		this.delStatus = delStatus;
	}
	
	

	public Contest(String contestName, Date contestDate, String contestUrl) {
		super();
		this.contestName = contestName;
		this.contestDate = contestDate;
		this.contestUrl = contestUrl;
	}

	public int getContestNo() {
		return contestNo;
	}

	public void setContestNo(int contestNo) {
		this.contestNo = contestNo;
	}

	public String getContestName() {
		return contestName;
	}

	public void setContestName(String contestName) {
		this.contestName = contestName;
	}

	public Date getContestDate() {
		return contestDate;
	}

	public void setContestDate(Date contestDate) {
		this.contestDate = contestDate;
	}

	public String getContestUrl() {
		return contestUrl;
	}

	public void setContestUrl(String contestUrl) {
		this.contestUrl = contestUrl;
	}

	public String getDelStatus() {
		return delStatus;
	}

	public void setDelStatus(String delStatus) {
		this.delStatus = delStatus;
	}

	@Override
	public String toString() {
		return "Contest [contestNo=" + contestNo + ", contestName=" + contestName + ", contestDate=" + contestDate
				+ ", contestUrl=" + contestUrl + ", delStatus=" + delStatus + "]";
	}

	
	
}

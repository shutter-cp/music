/**
 * chenPeng
 * com.looc.music.bean
 * AdminMagazine.java
 * 创建人:chenpeng
 * 时间：2018年5月14日-上午8:51:34 
 * 2018陈鹏-版权所有
 */
package com.looc.music.bean;

/**
 * 
 * AdminMagazine
 * 创建人:chenPeng
 * 时间：2018年5月14日-上午8:51:34 
 * @version 1.0.0
 * 
 */
public class AdminMagazineBean {
	private Integer magazineID;
	private String title;
	private String musicID;
	private String commentTimes;
	private Integer weight;
	private Integer approval;
	public Integer getMagazineID() {
		return magazineID;
	}
	public void setMagazineID(Integer magazineID) {
		this.magazineID = magazineID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMusicID() {
		return musicID;
	}
	public void setMusicID(String musicID) {
		this.musicID = musicID;
	}
	public String getCommentTimes() {
		return commentTimes;
	}
	public void setCommentTimes(String commentTimes) {
		this.commentTimes = commentTimes;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Integer getApproval() {
		return approval;
	}
	public void setApproval(Integer approval) {
		this.approval = approval;
	}
	
}

/**
 * chenPeng
 * com.looc.music.bean
 * MagazineListBean.java
 * 创建人:chenpeng
 * 时间：2018年5月11日-下午10:48:29 
 * 2018陈鹏-版权所有
 */
package com.looc.music.bean;

/**
 * 
 * MagazineListBean
 * 创建人:chenPeng
 * 时间：2018年5月11日-下午10:48:29 
 * @version 1.0.0
 * 
 */
public class MagazineListBean {
	private String commentTime;
	private String magazineID;
	private String title;
	private String musicText;
	private String username;
	private String weight;
	private String img;
	
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(String commentTime) {
		this.commentTime = commentTime;
	}
	public String getMagazineID() {
		return magazineID;
	}
	public void setMagazineID(String magazineID) {
		this.magazineID = magazineID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMusicText() {
		return musicText;
	}
	public void setMusicText(String musicText) {
		this.musicText = musicText;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
}

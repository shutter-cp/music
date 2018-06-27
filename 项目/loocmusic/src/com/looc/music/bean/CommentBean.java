/**
 * chenPeng
 * com.looc.music.bean
 * Comment.java
 * 创建人:chenpeng
 * 时间：2018年5月12日-上午12:13:09 
 * 2018陈鹏-版权所有
 */
package com.looc.music.bean;

/**
 * 
 * Comment
 * 创建人:chenPeng
 * 时间：2018年5月12日-上午12:13:09 
 * @version 1.0.0
 * 
 */
public class CommentBean {
	private String username;
	private String img;
	private String commentTime;
	private String comment;
	private Integer userID;
	private Integer magazineID;
	
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public Integer getMagazineID() {
		return magazineID;
	}
	public void setMagazineID(Integer magazineID) {
		this.magazineID = magazineID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
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
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}

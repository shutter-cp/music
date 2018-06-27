/**
 * chenPeng
 * com.looc.music.bean
 * IndexBean.java
 * 创建人:chenpeng
 * 时间：2018年5月11日-下午1:03:37 
 * 2018陈鹏-版权所有
 */
package com.looc.music.bean;

/**
 * 
 * IndexBean
 * 创建人:chenPeng
 * 时间：2018年5月11日-下午1:03:37 
 * @version 1.0.0
 * 
 */
public class IndexMagazineBean {
	private Integer magazineID;
	private String title;
	private String username;
	private String img;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	private Integer weight;
	private String commentTime;
	
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
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public String getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(String commentTime) {
		this.commentTime = commentTime;
	}
	
	

}

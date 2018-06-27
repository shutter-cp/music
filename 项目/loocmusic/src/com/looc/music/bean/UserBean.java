/**
 * chenPeng
 * com.looc.music.bean
 * UserBean.java
 * 创建人:chenpeng
 * 时间：2018年5月12日-下午11:10:32 
 * 2018陈鹏-版权所有
 */
package com.looc.music.bean;

/**
 * 
 * UserBean
 * 创建人:chenPeng
 * 时间：2018年5月12日-下午11:10:32 
 * @version 1.0.0
 * 
 */
public class UserBean {
	private Integer userID;
	private Integer adm_userID;
	private String username;
	private Long  tel;
	private String email;
	private Integer lv;
	private String img;
	private Integer points;
	private String password;
	
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public Integer getAdm_userID() {
		return adm_userID;
	}
	public void setAdm_userID(Integer adm_userID) {
		this.adm_userID = adm_userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getTel() {
		return tel;
	}
	public void setTel(Long tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getLv() {
		return lv;
	}
	public void setLv(Integer lv) {
		this.lv = lv;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Integer getPoints() {
		return points;
	}
	public void setPoints(Integer points) {
		this.points = points;
	}
	
}

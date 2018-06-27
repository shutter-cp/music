/**
 * chenPeng
 * com.looc.music.bean
 * MusicBean.java
 * 创建人:chenpeng
 * 时间：2018年5月11日-下午8:45:45 
 * 2018陈鹏-版权所有
 */
package com.looc.music.bean;

/**
 * 
 * MusicBean
 * 创建人:chenPeng
 * 时间：2018年5月11日-下午8:45:45 
 * @version 1.0.0
 * 
 */
public class MusicBean {
	private String musicID;
	private String name;
	private String musicText;
	private Integer weight;
	public String getMusicID() {
		return musicID;
	}
	public void setMusicID(String musicID) {
		this.musicID = musicID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMusicText() {
		return musicText;
	}
	public void setMusicTextt(String musicText) {
		this.musicText = musicText;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	
}

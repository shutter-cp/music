/**
 * chenPeng
 * com.looc.music.service
 * VideoDo.java
 * 创建人:chenpeng
 * 时间：2018年5月11日-下午7:54:24 
 * 2018陈鹏-版权所有
 */
package com.looc.music.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.looc.music.bean.VideoBean;
import com.looc.music.dao.VideoDao;

/**
 * 
 * VideoDo
 * 创建人:chenPeng
 * 时间：2018年5月11日-下午7:54:24 
 * @version 1.0.0
 * 
 */
@Service
public class VideoDo {
	@Autowired
	private VideoDao videoDao;
	
	public VideoBean fondVideoDo(String musicID){
		return videoDao.fondVideo(musicID);
	}
}

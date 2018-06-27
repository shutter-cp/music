/**
 * chenPeng
 * com.looc.music.dao
 * VideoDao.java
 * 创建人:chenpeng
 * 时间：2018年5月11日-下午7:46:37 
 * 2018陈鹏-版权所有
 */
package com.looc.music.dao;

import com.looc.music.bean.VideoBean;

/**
 * 
 * VideoDao
 * 创建人:chenPeng
 * 时间：2018年5月11日-下午7:46:37 
 * @version 1.0.0
 * 
 */
public interface VideoDao {
	/**
	 * 得到音乐
	 * 方法名：fondVideo
	 * 创建人：chenPeng
	 * 时间：2018年5月11日-下午7:53:56 
	 * 手机:17673111810
	 * @param musciID
	 * @return VideoBean
	 * @exception 
	 * @since  1.0.0
	 */
	public VideoBean fondVideo(String musicID);
}

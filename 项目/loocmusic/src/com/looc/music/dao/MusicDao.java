/**
 * chenPeng
 * com.looc.music.dao
 * MusicDao.java
 * 创建人:chenpeng
 * 时间：2018年5月11日-下午8:47:29 
 * 2018陈鹏-版权所有
 */
package com.looc.music.dao;

import java.util.List;

import com.looc.music.bean.MusicBean;

/**
 * 
 * MusicDao
 * 创建人:chenPeng
 * 时间：2018年5月11日-下午8:47:29 
 * @version 1.0.0
 * 
 */
public interface MusicDao {
	/**
	 * 得到指定范围的音乐
	 * 方法名：fondMusic
	 * 创建人：chenPeng
	 * 时间：2018年5月11日-下午8:50:48 
	 * 手机:17673111810
	 * @param no
	 * @return List<MusicBean>
	 * @exception 
	 * @since  1.0.0
	 */
	public List<MusicBean> fondMusic();
	
	/**
	 * 点赞
	 * 方法名：addWeigth
	 * 创建人：chenPeng
	 * 时间：2018年5月13日-下午8:42:44 
	 * 手机:17673111810 void
	 * @param musicBean 
	 * @exception 
	 * @since  1.0.0
	 */
	public void addWeigth(MusicBean musicBean);
}

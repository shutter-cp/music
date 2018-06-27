/**
 * chenPeng
 * com.looc.music.bean
 * IndexMagazineDao.java
 * 创建人:chenpeng
 * 时间：2018年5月11日-下午1:30:31 
 * 2018陈鹏-版权所有
 */
package com.looc.music.dao;

import java.util.List;

import com.looc.music.bean.IndexMagazineBean;
import com.looc.music.bean.IndexMusicBean;

/**
 * 
 * IndexMagazineDao
 * 创建人:chenPeng
 * 时间：2018年5月11日-下午1:30:31 
 * @version 1.0.0
 * 
 */
public interface IndexDao {
	/**
	 * 得到index最新期刊
	 * 方法名：fondIndexMagazine
	 * 创建人：chenPeng
	 * 时间：2018年5月11日-下午6:53:01 
	 * 手机:17673111810
	 * @return List<IndexMagazineBean>
	 * @exception 
	 * @since  1.0.0
	 */
	public List<IndexMagazineBean> fondIndexMagazine();
	
	/**
	 * 得到最火的8个音乐
	 * 方法名：fondIndexMusic
	 * 创建人：chenPeng
	 * 时间：2018年5月11日-下午6:53:56 
	 * 手机:17673111810
	 * @return List<IndexMusicBean>
	 * @exception 
	 * @since  1.0.0
	 */
	public List<IndexMusicBean> fondIndexMusic();
}

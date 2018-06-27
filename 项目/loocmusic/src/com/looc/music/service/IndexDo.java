/**
 * chenPeng
 * com.looc.music.service
 * IndexDo.java
 * 创建人:chenpeng
 * 时间：2018年5月11日-下午5:34:11 
 * 2018陈鹏-版权所有
 */
package com.looc.music.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.looc.music.bean.IndexMagazineBean;
import com.looc.music.bean.IndexMusicBean;
import com.looc.music.dao.IndexDao;

/**
 * 
 * IndexDo
 * 创建人:chenPeng
 * 时间：2018年5月11日-下午5:34:11 
 * @version 1.0.0
 * 
 */

@Service
public class IndexDo {
	@Autowired
	private IndexDao indexDao;
	
	/**
	 * 得到首页的最新期刊
	 * 方法名：indexMagazineDo
	 * 创建人：chenPeng
	 * 时间：2018年5月11日-下午6:52:00 
	 * 手机:17673111810
	 * @return List<IndexMagazineBean>
	 * @exception 
	 * @since  1.0.0
	 */
	public List<IndexMagazineBean> indexMagazineDo(){
		return indexDao.fondIndexMagazine();
	}
	
	/**
	 * 得到8个火热音乐
	 * 方法名：indexxMusicDo
	 * 创建人：chenPeng
	 * 时间：2018年5月11日-下午6:54:52 
	 * 手机:17673111810
	 * @return List<IndexMusicBean>
	 * @exception 
	 * @since  1.0.0
	 */
	public List<IndexMusicBean> indexMusicDo(){
		return indexDao.fondIndexMusic();
	}
}

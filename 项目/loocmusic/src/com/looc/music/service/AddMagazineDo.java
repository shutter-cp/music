/**
 * chenPeng
 * com.looc.music.service
 * AddMagazineDo.java
 * 创建人:chenpeng
 * 时间：2018年5月15日-下午5:39:52 
 * 2018陈鹏-版权所有
 */
package com.looc.music.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.looc.music.bean.AddMagazienBean;
import com.looc.music.dao.AddMagazineDao;

/**
 * 
 * AddMagazineDo
 * 创建人:chenPeng
 * 时间：2018年5月15日-下午5:39:52 
 * @version 1.0.0
 * 
 */

@Service
public class AddMagazineDo {
	@Autowired
	private AddMagazineDao addMagazineDao;
	
	/**
	 * 写期刊
	 * 方法名：addMagazinedo
	 * 创建人：chenPeng
	 * 时间：2018年5月15日-下午5:41:25 
	 * 手机:17673111810 void
	 * @exception 
	 * @since  1.0.0
	 */
	public void addMagazinedo(AddMagazienBean addMagazienBean){
		addMagazineDao.addMagazineDao(addMagazienBean);
	}
	
	/**
	 * 写入音乐
	 * 方法名：addMmusicdo
	 * 创建人：chenPeng
	 * 时间：2018年5月15日-下午5:49:54 
	 * 手机:17673111810
	 * @param addMagazienBean void
	 * @exception 
	 * @since  1.0.0
	 */
	public void addMmusicdo(AddMagazienBean addMagazienBean){
		addMagazineDao.addMusicDao(addMagazienBean);
	}
}

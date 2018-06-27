/**
 * chenPeng
 * com.looc.music.service
 * MusicDo.java
 * 创建人:chenpeng
 * 时间：2018年5月11日-下午8:50:39 
 * 2018陈鹏-版权所有
 */
package com.looc.music.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.looc.music.bean.MusicBean;
import com.looc.music.dao.MusicDao;

/**
 * 
 * MusicDo
 * 创建人:chenPeng
 * 时间：2018年5月11日-下午8:50:39 
 * @version 1.0.0
 * 
 */
@Service
public class MusicDo {
	@Autowired
	private MusicDao musicDao;
	
	/**
	 * 执行找到指定范围音乐
	 * 方法名：fondMusic
	 * 创建人：chenPeng
	 * 时间：2018年5月11日-下午8:54:51 
	 * 手机:17673111810
	 * @param no
	 * @return List<MusicBean>
	 * @exception 
	 * @since  1.0.0
	 */
	public	List<MusicBean> fondMusic(){
		return musicDao.fondMusic();
	}
	
	public void addWeight(MusicBean musicBean){
		musicDao.addWeigth(musicBean);
	}
}

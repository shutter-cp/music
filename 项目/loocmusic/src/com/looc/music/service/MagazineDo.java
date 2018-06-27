/**
 * chenPeng
 * com.looc.music.service
 * MagazineDo.java
 * 创建人:chenpeng
 * 时间：2018年5月12日-上午12:23:42 
 * 2018陈鹏-版权所有
 */
package com.looc.music.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.looc.music.bean.CommentBean;
import com.looc.music.bean.MagazineBean;
import com.looc.music.dao.MagazineDao;

/**
 * 
 * MagazineDo
 * 创建人:chenPeng
 * 时间：2018年5月12日-上午12:23:42 
 * @version 1.0.0
 * 
 */
@Service
public class MagazineDo {
	
	@Autowired
	private MagazineDao magazineDao;
	
	/**
	 * 返回杂志
	 * 方法名：magazineDo
	 * 创建人：chenPeng
	 * 时间：2018年5月12日-上午12:27:12 
	 * 手机:17673111810
	 * @param no
	 * @return MagazineBean
	 * @exception 
	 * @since  1.0.0
	 */
	public MagazineBean magazineDo(int no){
		return magazineDao.fondMagazine(no);
	}
	
	/**
	 * 返回评论
	 * 方法名：commentDo
	 * 创建人：chenPeng
	 * 时间：2018年5月12日-上午12:28:55 
	 * 手机:17673111810
	 * @param no
	 * @return List<CommentBean>
	 * @exception 
	 * @since  1.0.0
	 */
	public List<CommentBean> commentDo(int no){
		return magazineDao.fondComment(no);
	}
}

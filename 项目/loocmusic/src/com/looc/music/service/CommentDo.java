/**
 * chenPeng
 * com.looc.music.service
 * CommentDo.java
 * 创建人:chenpeng
 * 时间：2018年5月13日-下午3:25:52 
 * 2018陈鹏-版权所有
 */
package com.looc.music.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.looc.music.bean.CommentBean;
import com.looc.music.dao.CommentDao;

/**
 * 
 * CommentDo
 * 创建人:chenPeng
 * 时间：2018年5月13日-下午3:25:52 
 * @version 1.0.0
 * 
 */
@Service
public class CommentDo {
	@Autowired
	private CommentDao commentDao;
	
	public String addCommentDo(CommentBean commentBean){
		commentDao.addComment(commentBean);
		return null;
	}
}

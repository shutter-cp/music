/**
 * chenPeng
 * com.looc.music.dao
 * CommentDao.java
 * 创建人:chenpeng
 * 时间：2018年5月13日-下午3:20:11 
 * 2018陈鹏-版权所有
 */
package com.looc.music.dao;

import com.looc.music.bean.CommentBean;

/**
 * 
 * CommentDao
 * 创建人:chenPeng
 * 时间：2018年5月13日-下午3:20:11 
 * @version 1.0.0
 * 
 */
public interface CommentDao {
	/**
	 * 写入评论
	 * 方法名：addComment
	 * 创建人：chenPeng
	 * 时间：2018年5月13日-下午3:20:44 
	 * 手机:17673111810 void
	 * @exception 
	 * @since  1.0.0
	 */
	public void addComment(CommentBean commetnBean);
}

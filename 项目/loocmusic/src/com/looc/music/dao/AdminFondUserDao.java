/**
 * chenPeng
 * com.looc.music.dao
 * AdminFond.java
 * 创建人:chenpeng
 * 时间：2018年5月14日-下午5:57:57 
 * 2018陈鹏-版权所有
 */
package com.looc.music.dao;

import java.util.List;

import com.looc.music.bean.UserBean;

/**
 * 
 * AdminFond
 * 创建人:chenPeng
 * 时间：2018年5月14日-下午5:57:57 
 * @version 1.0.0
 * 
 */
public interface AdminFondUserDao {
	/**
	 * 查询出自己的用户
	 * 方法名：fondUser
	 * 创建人：chenPeng
	 * 时间：2018年5月14日-下午5:59:50 
	 * 手机:17673111810
	 * @param no
	 * @return List<UserBean>
	 * @exception 
	 * @since  1.0.0
	 */
	public List<UserBean> fondUser(int no);
}

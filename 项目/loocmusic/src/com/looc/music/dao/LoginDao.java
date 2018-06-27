/**
 * chenPeng
 * com.looc.music.dao
 * LoginDao.java
 * 创建人:chenpeng
 * 时间：2018年5月12日-下午11:13:45 
 * 2018陈鹏-版权所有
 */
package com.looc.music.dao;

import com.looc.music.bean.UserBean;

/**
 * 
 * LoginDao
 * 创建人:chenPeng
 * 时间：2018年5月12日-下午11:13:45 
 * @version 1.0.0
 * 
 */
public interface LoginDao {
	/**
	 * 用户登陆
	 * 方法名：userLogin
	 * 创建人：chenPeng
	 * 时间：2018年5月12日-下午11:50:34 
	 * 手机:17673111810
	 * @return UserBean
	 * @exception 
	 * @since  1.0.0
	 */
	public UserBean userLogin(UserBean userBean);
	
	/**
	 * 作者登陆
	 * 方法名：authorLogin
	 * 创建人：chenPeng
	 * 时间：2018年5月14日-上午11:18:05 
	 * 手机:17673111810
	 * @param userBean
	 * @return UserBean
	 * @exception 
	 * @since  1.0.0
	 */
	public UserBean authorLogin(UserBean userBean);
	
	/**
	 * 管理员登陆
	 * 方法名：adminLogin
	 * 创建人：chenPeng
	 * 时间：2018年5月14日-上午11:23:36 
	 * 手机:17673111810
	 * @param userBean
	 * @return UserBean
	 * @exception 
	 * @since  1.0.0
	 */
	public UserBean adminLogin(UserBean userBean);
	
	/**
	 * 用户注册
	 * 方法名：userAdd
	 * 创建人：chenPeng
	 * 时间：2018年5月13日-上午1:16:39 
	 * 手机:17673111810
	 * @param userBean void
	 * @exception 
	 * @since  1.0.0
	 */
	public void userAdd(UserBean userBean);
}

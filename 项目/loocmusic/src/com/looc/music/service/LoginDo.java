/**
 * chenPeng
 * com.looc.music.service
 * loginDo.java
 * 创建人:chenpeng
 * 时间：2018年5月11日-上午11:26:38 
 * 2018陈鹏-版权所有
 */
package com.looc.music.service;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import com.looc.music.bean.UserBean;
import com.looc.music.core.JudgeCore;
import com.looc.music.dao.LoginDao;

/**
 * 
 * loginDo
 * 创建人:chenPeng
 * 时间：2018年5月11日-上午11:26:38 
 * @version 1.0.0
 * 
 */
@Service
public class LoginDo {
	@Autowired
	private LoginDao loginDao;
	@Autowired
	private HttpServletRequest re;
	/**
	 * 用户登陆
	 * 方法名：logins
	 * 创建人：chenPeng
	 * 时间：2018年5月12日-下午11:51:06 
	 * 手机:17673111810
	 * @return boolean
	 * @exception 
	 * @since  1.0.0
	 */
	public boolean logins(UserBean userBean){
		UserBean user = new UserBean();
		user = loginDao.userLogin(userBean);
		if(user!=null){
			re.getSession().setAttribute("user", user);
			return true;
		}
		return false;
	}
	
	/**
	 * 作者登陆
	 * 方法名：authorLogin
	 * 创建人：chenPeng
	 * 时间：2018年5月14日-上午11:16:46 
	 * 手机:17673111810
	 * @param userBean
	 * @return boolean
	 * @exception 
	 * @since  1.0.0
	 */
	public boolean authorLogin(UserBean userBean){
		UserBean authors = new UserBean();
		authors = loginDao.authorLogin(userBean);
		if(authors!=null){
			re.getSession().setAttribute("authors", authors);
			return true;
		}
		return false;
	}
	
	/**
	 * 管理员登陆
	 * 方法名：adminLogin
	 * 创建人：chenPeng
	 * 时间：2018年5月14日-上午11:21:49 
	 * 手机:17673111810
	 * @param userBean
	 * @return boolean
	 * @exception 
	 * @since  1.0.0
	 */
	public boolean adminLogin(UserBean userBean){
		UserBean admins = new UserBean();
		admins = loginDao.adminLogin(userBean);
		if(admins!=null){
			re.getSession().setAttribute("admins", admins);
			return true;
		}
		return false;
	}
	
	/**
	 * 执行登出
	 * 方法名：loginOut
	 * 创建人：chenPeng
	 * 时间：2018年5月19日-上午12:28:41 
	 * 手机:17673111810 void
	 * @exception 
	 * @since  1.0.0
	 */
	public void loginOut(){
		re.getSession().setAttribute("user", null);
	}
	
	/**
	 * 注册
	 * 方法名：addUser
	 * 创建人：chenPeng
	 * 时间：2018年5月13日-上午2:22:48 
	 * 手机:17673111810
	 * @param userBean
	 * @return boolean
	 * @exception 
	 * @since  1.0.0
	 */
	public String addUser(UserBean userBean){
		JudgeCore judgeCore = new JudgeCore();
		if(!judgeCore.judgeEmail(userBean.getEmail())||
				judgeCore.judgeLogin(userBean.getUsername(), userBean.getPassword())
				){
			return "false";
		}
		/**
		 * 捕获重名
		 */
		try {
			loginDao.userAdd(userBean);
		} catch (DuplicateKeyException e) {
			// TODO: handle exception
			System.out.println("用户名重复");
			return "error";
		}
		return "true";
	}
	
}

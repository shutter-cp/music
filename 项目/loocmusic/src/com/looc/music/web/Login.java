/**
 * chenPeng
 * com.looc.music.web
 * login.java
 * 创建人:chenpeng
 * 时间：2018年5月11日-上午11:24:50 
 * 2018陈鹏-版权所有
 */
package com.looc.music.web;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.looc.music.bean.UserBean;
import com.looc.music.core.JudgeCore;
import com.looc.music.service.IndexDo;
import com.looc.music.service.LoginDo;

/**
 * 
 * login
 * 创建人:chenPeng
 * 时间：2018年5月11日-上午11:24:50 
 * @version 1.0.0
 * 
 */
@Controller
public class Login {
	@Autowired
	private LoginDo loginDo;
	@Autowired
	private IndexDo indexDo;
	
	/**
	 * 跳转登陆
	 * 方法名：login
	 * 创建人：chenPeng
	 * 时间：2018年5月12日-下午10:01:09 
	 * 手机:17673111810
	 * @return ModelAndView
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping("/login")
	public ModelAndView login(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}
	
	/**
	 * 管理员登陆跳转
	 * 方法名：adminLogin
	 * 创建人：chenPeng
	 * 时间：2018年5月14日-上午10:57:33 
	 * 手机:17673111810
	 * @return ModelAndView
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping("/adminlogin")
	public ModelAndView adminLogin(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("adminlogin");
		return modelAndView;
	}
	
	/**
	 * 作者登陆跳转
	 * 方法名：adminLogin
	 * 创建人：chenPeng
	 * 时间：2018年5月14日-上午10:57:33 
	 * 手机:17673111810
	 * @return ModelAndView
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping("/authorlogin")
	public ModelAndView authorLogin(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("authorlogin");
		return modelAndView;
	}
	
	/**
	 * 作者登陆执行
	 * 方法名：authorLogined
	 * 创建人：chenPeng
	 * 时间：2018年5月14日-上午11:18:52 
	 * 手机:17673111810
	 * @param request
	 * @return String
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping(method=RequestMethod.POST,value="/authorlogined")
	@ResponseBody
	public String authorLogined(HttpServletRequest request){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserBean userBean = new UserBean();
		userBean.setUsername(username);
		userBean.setPassword(password);
		if(loginDo.authorLogin(userBean)){
			return "success";
		}
		return "fail";
	}
	
	/**
	 * 管理员登陆
	 * 方法名：adminLogined
	 * 创建人：chenPeng
	 * 时间：2018年5月14日-上午11:19:59 
	 * 手机:17673111810
	 * @param request
	 * @return String
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping(method=RequestMethod.POST,value="/adminLogined")
	@ResponseBody
	public String adminLogined(HttpServletRequest request){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserBean userBean = new UserBean();
		userBean.setUsername(username);
		userBean.setPassword(password);
		if(loginDo.adminLogin(userBean)){
			return "success";
		}
		return "fail";
	}
	
	/**
	 * 登出
	 * 方法名：loginOut
	 * 创建人：chenPeng
	 * 时间：2018年5月19日-上午12:27:34 
	 * 手机:17673111810
	 * @return ModelAndView
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping("/loginOut")
	public ModelAndView loginOut(){
		ModelAndView modelAndView = new ModelAndView();
		loginDo.loginOut();
		modelAndView.addObject("magazine", indexDo.indexMagazineDo());
		modelAndView.addObject("music", indexDo.indexMusicDo());
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	/**
	 * login
	 * 方法名：logined
	 * 创建人：chenPeng
	 * 时间：2018年5月13日-上午2:24:26 
	 * 手机:17673111810
	 * @param request
	 * @return String
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping(method=RequestMethod.POST,value="/logined")
	@ResponseBody
	public String logined(HttpServletRequest request){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserBean userBean = new UserBean();
		userBean.setUsername(username);
		userBean.setPassword(password);
		if(loginDo.logins(userBean)){
			return "success";
		}
		return "fail";
	}
	
	/**
	 * 注册
	 * 方法名：logined
	 * 创建人：chenPeng
	 * 时间：2018年5月13日-上午2:24:44 
	 * 手机:17673111810
	 * @param request
	 * @return String
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping(method=RequestMethod.POST,value="/added")
	@ResponseBody
	public String added(HttpServletRequest request){
		JudgeCore judgeCore = new JudgeCore();
 		Random random = new Random();
		String username = null;
		username = request.getParameter("username");
		String password = null;
		password = request.getParameter("password");
		String email = null;
		email = request.getParameter("email");
		String tels = null;
		tels = request.getParameter("tel");
		
		if(!judgeCore.judgeEmail(email)||
				judgeCore.judgeLogin(username, password)||
					!judgeCore.judgePhone(tels)){
			return "false";
		}
		Long tel = null;
		tel = Long.parseLong(tels);
		UserBean userBean = new UserBean();
		userBean.setUsername(username);
		userBean.setPassword(password);
		userBean.setEmail(email);
		userBean.setTel(tel);
		userBean.setAdm_userID(1);
		userBean.setImg("user_"+(random.nextInt(10)+1)+".jpg");
		userBean.setLv(1);
		userBean.setPoints(0);
		return loginDo.addUser(userBean);
	}
}

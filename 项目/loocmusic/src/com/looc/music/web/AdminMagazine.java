/**
 * chenPeng
 * com.looc.music.service
 * AdminMagazine.java
 * 创建人:chenpeng
 * 时间：2018年5月14日-上午9:14:47 
 * 2018陈鹏-版权所有
 */
package com.looc.music.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.looc.music.bean.AdminMagazineBean;
import com.looc.music.bean.UserBean;
import com.looc.music.service.AddMagazineDo;
import com.looc.music.service.AdminFondUserListDo;
import com.looc.music.service.AdminMagazineDo;

/**
 * 
 * AdminMagazine
 * 创建人:chenPeng
 * 时间：2018年5月14日-上午9:14:47 
 * @version 1.0.0
 * 
 */
@Controller
public class AdminMagazine {
	@Autowired
	private HttpServletRequest re;
	@Autowired
	private AdminMagazineDo adminMagazineDo; 
	@Autowired
	private AdminFondUserListDo adminFondUser;
	
	/**
	 * 作者跳转
	 * 方法名：authorFondMagazineList
	 * 创建人：chenPeng
	 * 时间：2018年5月14日-上午9:21:41 
	 * 手机:17673111810
	 * @return ModelAndView
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping("/admin/author")
	public ModelAndView authorFondMagazineList(){
		ModelAndView andView = new ModelAndView();
		//从session中取得数据
		UserBean user = (UserBean) re.getSession().getAttribute("authors");
		
		List<AdminMagazineBean> authorMagazineList = 
				adminMagazineDo.authorFondMagazineDo(user.getUsername());
		andView.addObject("authorMagazineList", authorMagazineList);
		andView.setViewName("admin/author");
		return andView;
	}
	
	/**
	 * 管理员跳转
	 * 方法名：adminFondMagazineList
	 * 创建人：chenPeng
	 * 时间：2018年5月14日-上午9:23:40 
	 * 手机:17673111810
	 * @return ModelAndView
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping("/admin/admin")
	public ModelAndView adminFondMagazineList(){
		ModelAndView andView = new ModelAndView();
		UserBean user = (UserBean) re.getSession().getAttribute("admins");
		
		List<AdminMagazineBean> adminMagazineList = 
				adminMagazineDo.adminFondMagazienDo();
		
		List<UserBean> users = adminFondUser.adminFondUserList(user.getUserID());
		andView.addObject("adminMagazineList", adminMagazineList);
		andView.addObject("users", users);
		andView.setViewName("admin/admin");
		return andView;
	}
	
	/**
	 * 开关off
	 * 方法名：offapproval
	 * 创建人：chenPeng
	 * 时间：2018年5月14日-下午5:48:50 
	 * 手机:17673111810
	 * @param request
	 * @return String
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping(method=RequestMethod.POST,value="/offapproval")
	@ResponseBody
	public String offapproval(HttpServletRequest request){
		String magazineID = request.getParameter("magazineID");
		adminMagazineDo.offapproval(Integer.valueOf(magazineID));
		return "success";
	}
	
	/**
	 * 开关on
	 * 方法名：onapproval
	 * 创建人：chenPeng
	 * 时间：2018年5月14日-下午5:49:06 
	 * 手机:17673111810
	 * @param request
	 * @return String
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping(method=RequestMethod.POST,value="/onapproval")
	@ResponseBody
	public String onapproval(HttpServletRequest request){
		String magazineID = request.getParameter("magazineID");
		adminMagazineDo.onapproval(Integer.valueOf(magazineID));
		return "success";
	}
	
	/**
	 * 管理员绝对删除文章
	 * 方法名：AdminDelet
	 * 创建人：chenPeng
	 * 时间：2018年6月21日-下午12:30:44 
	 * 手机:17673111810
	 * @return ModelAndView
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping("admin/admin/delet/{magazineID}")
	public ModelAndView AdminDelet(@PathVariable("magazineID")Integer magazineID){
		adminMagazineDo.adminDeletDo(magazineID);
		return new ModelAndView("redirect:/admin/admin");
	}
	
}

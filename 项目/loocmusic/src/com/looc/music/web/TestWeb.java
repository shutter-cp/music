/**
 * chenPeng
 * com.looc.music.web
 * TestWeb.java
 * 创建人:chenpeng
 * 时间：2018年5月2日-下午10:02:54 
 * 2018陈鹏-版权所有
 */
package com.looc.music.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.looc.music.dao.TestDao;

/**
 * 
 * 
 * TestWeb
 * 创建人:chenPeng
 * 时间：2018年5月11日-上午11:25:06 
 * @version 1.0.0
 *
 */
@Controller
public class TestWeb {
	@Autowired
	private TestDao testDao;
	
	@RequestMapping("/test")
	public ModelAndView test(){
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("1111");
		modelAndView.setViewName("indexd");
		modelAndView.addObject("biao",testDao.TestB());
		return modelAndView;
	}
	
	/*@RequestMapping("/authordo")
	public ModelAndView authordo(@RequestParam MultipartFile[] upFile,@RequestParam("magazineText")String aaa,HttpSession se) 
			throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		String path = se.getServletContext().getRealPath("/img");
		String filename = "";
		System.out.println(path);
		System.out.println(aaa);
		for (MultipartFile multipartFile : upFile) {
			System.out.println(multipartFile.getOriginalFilename());
			filename = multipartFile.getOriginalFilename();
			File file = new File(path,filename);
			multipartFile.transferTo(file);
		}
		
		
		modelAndView.setViewName("admin/author");
		return modelAndView;
	}*/
	
	/*
	@RequestMapping(method=RequestMethod.POST,value="/upData")
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
	}*/
	
//	@RequestMapping("/admin/admin")
//	public ModelAndView tests(){
//		ModelAndView modelAndView = new ModelAndView();
//		System.out.println("1111");
//		modelAndView.setViewName("admin/admin");
//		return modelAndView;
//	}
//	@RequestMapping("/admin/author")
//	public ModelAndView test1(){
//		ModelAndView modelAndView = new ModelAndView();
//		System.out.println("1111");
//		modelAndView.setViewName("admin/author");
//		return modelAndView;
//	}
//	@RequestMapping("/video")
//	public ModelAndView testss(){
//		ModelAndView modelAndView = new ModelAndView();
//		System.out.println("1111");
//		modelAndView.setViewName("video");
//		return modelAndView;
//	}
//	@RequestMapping("/index")
//	public ModelAndView tests1(){
//		ModelAndView modelAndView = new ModelAndView();
//		System.out.println("1111");
//		modelAndView.setViewName("index");
//		return modelAndView;
//	}
//	@RequestMapping("/magazine")
//	public ModelAndView tests2(){
//		ModelAndView modelAndView = new ModelAndView();
//		System.out.println("1111");
//		modelAndView.setViewName("magazine");
//		return modelAndView;
//	}
//	@RequestMapping("/magazinelist")
//	public ModelAndView tests3(){
//		ModelAndView modelAndView = new ModelAndView();
//		System.out.println("1111");
//		modelAndView.setViewName("magazinelist");
//		return modelAndView;
//	}
//	@RequestMapping("/music")
//	public ModelAndView tests4(){
//		ModelAndView modelAndView = new ModelAndView();
//		System.out.println("1111");
//		modelAndView.setViewName("music");
//		return modelAndView;
//	}
//	@RequestMapping("/musicstyle")
//	public ModelAndView tests5(){
//		ModelAndView modelAndView = new ModelAndView();
//		System.out.println("1111");
//		modelAndView.setViewName("musicstyle");
//		return modelAndView;
//	}
//	@RequestMapping("/login")
//	public ModelAndView tests6(){
//		ModelAndView modelAndView = new ModelAndView();
//		System.out.println("1111");
//		modelAndView.setViewName("login");
//		return modelAndView;
//	}
}

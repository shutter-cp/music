/**
 * chenPeng
 * com.looc.music.web
 * Index.java
 * 创建人:chenpeng
 * 时间：2018年5月11日-下午12:26:25 
 * 2018陈鹏-版权所有
 */
package com.looc.music.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.looc.music.service.IndexDo;

/**
 * 
 * Index
 * 创建人:chenPeng
 * 时间：2018年5月11日-下午12:26:25 
 * @version 1.0.0
 * 
 */
@Controller
public class Index {
	@Autowired
	private IndexDo indexDo;
	
	/**
	 * 
	 * (这里用一句话描述这个方法的作用)
	 * 方法名：index
	 * 创建人：chenPeng
	 * 时间：2018年5月11日-下午12:32:45 
	 * 手机:17673111810
	 * @return ModelAndView
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping("/index")
	public ModelAndView index(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		modelAndView.addObject("magazine", indexDo.indexMagazineDo());
		modelAndView.addObject("music", indexDo.indexMusicDo());
		return modelAndView;
	}
}

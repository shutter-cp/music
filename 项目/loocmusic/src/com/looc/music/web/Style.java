/**
 * chenPeng
 * com.looc.music.web
 * Style.java
 * 创建人:chenpeng
 * 时间：2018年5月12日-下午2:17:22 
 * 2018陈鹏-版权所有
 */
package com.looc.music.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * Style
 * 创建人:chenPeng
 * 时间：2018年5月12日-下午2:17:22 
 * @version 1.0.0
 * 
 */
@Controller
public class Style {
	@RequestMapping("/style")
	public ModelAndView style(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("musicstyle");
		return modelAndView;
	}
}

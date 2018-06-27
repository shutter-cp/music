/**
 * chenPeng
 * com.looc.music.web
 * Magazine.java
 * 创建人:chenpeng
 * 时间：2018年5月12日-上午12:29:23 
 * 2018陈鹏-版权所有
 */
package com.looc.music.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.looc.music.service.MagazineDo;

/**
 * 
 * Magazine
 * 创建人:chenPeng
 * 时间：2018年5月12日-上午12:29:23 
 * @version 1.0.0
 * 
 */
@Controller
public class Magazine {
	@Autowired
	private MagazineDo zineDo;
	
	@RequestMapping("magazine/{no}")
	public ModelAndView magazine(@PathVariable("no")int no){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("magazine", zineDo.magazineDo(no));
		modelAndView.addObject("commentList", zineDo.commentDo(no));
		modelAndView.setViewName("magazine");
		return modelAndView;
	}
}

/**
 * chenPeng
 * com.looc.music.web
 * Video.java
 * 创建人:chenpeng
 * 时间：2018年5月11日-下午7:58:37 
 * 2018陈鹏-版权所有
 */
package com.looc.music.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.looc.music.service.VideoDo;

/**
 * 
 * Video
 * 创建人:chenPeng
 * 时间：2018年5月11日-下午7:58:37 
 * @version 1.0.0
 * 
 */
@Controller
public class Video {
	@Autowired
	private VideoDo videoDo;
	/**
	 * 动过musicID得到music对象
	 * 方法名：fondVideo
	 * 创建人：chenPeng
	 * 时间：2018年5月11日-下午8:07:47 
	 * 手机:17673111810
	 * @param musicID
	 * @return ModelAndView
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping("/video/{musicID}")
	public ModelAndView fondVideo(@PathVariable("musicID")String musicID){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("video", videoDo.fondVideoDo(musicID));
		modelAndView.setViewName("video");
		return modelAndView;
	}
}

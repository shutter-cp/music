/**
 * chenPeng
 * com.looc.music.web
 * Music.java
 * 创建人:chenpeng
 * 时间：2018年5月11日-下午8:54:41 
 * 2018陈鹏-版权所有
 */
package com.looc.music.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.looc.music.bean.MusicBean;
import com.looc.music.service.IndexDo;
import com.looc.music.service.MusicDo;

/**
 * 
 * Music
 * 创建人:chenPeng
 * 时间：2018年5月11日-下午8:54:41 
 * @version 1.0.0
 * 
 */
@Controller
public class Music {
	@Autowired
	private MusicDo musicDo;
	@Autowired
	private IndexDo indexDo;
	
	/**
	 * 跳转到music页面 放入 音乐与magazine
	 * 方法名：fondMusic
	 * 创建人：chenPeng
	 * 时间：2018年5月11日-下午10:02:34 
	 * 手机:17673111810
	 * @return ModelAndView
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping("/music")
	public ModelAndView fondMusic(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("musicList", musicDo.fondMusic());
		modelAndView.addObject("magazineList", indexDo.indexMagazineDo());
		modelAndView.setViewName("music");
		return modelAndView;
	}
	
	/**
	 * 点赞
	 * 方法名：addWeight
	 * 创建人：chenPeng
	 * 时间：2018年5月13日-下午10:16:01 
	 * 手机:17673111810
	 * @param re
	 * @return String
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping(method=RequestMethod.POST,value="/addweight")
	@ResponseBody
	public String addWeight(HttpServletRequest re){
		if(re.getSession().getAttribute("name")==null){
			return "fail";
		}
		MusicBean musicBean = new MusicBean();
		Integer weight = null;
		String musicID = null;
		weight = Integer.valueOf(re.getParameter("weight"));
		musicID = re.getParameter("musicID");
		musicBean.setMusicID(musicID);
		musicBean.setWeight(++weight);
		musicDo.addWeight(musicBean);
		return "success";
	}
}

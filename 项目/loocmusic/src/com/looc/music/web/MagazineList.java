/**
 * chenPeng
 * com.looc.music.web
 * MagazineList.java
 * 创建人:chenpeng
 * 时间：2018年5月11日-下午10:57:28 
 * 2018陈鹏-版权所有
 */
package com.looc.music.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.looc.music.service.IndexDo;
import com.looc.music.service.MagazineListDo;

/**
 * 
 * MagazineList
 * 创建人:chenPeng
 * 时间：2018年5月11日-下午10:57:28 
 * @version 1.0.0
 * 
 */
@Controller
public class MagazineList {
	@Autowired
	private MagazineListDo magazineListDo;
	@Autowired
	private IndexDo indexDo;
	
	/**
	 * 查询出杂志
	 * 方法名：magazineList
	 * 创建人：chenPeng
	 * 时间：2018年5月13日-下午6:41:37 
	 * 手机:17673111810
	 * @return ModelAndView
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping("/magazinelist")
	public ModelAndView magazineList(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("magazineLists", magazineListDo.fondMagazineList());
		modelAndView.addObject("magazineList", indexDo.indexMagazineDo());
		modelAndView.setViewName("magazinelist");
		return modelAndView;
	}
	
	/**
	 * 按编号查询
	 * 方法名：magazine
	 * 创建人：chenPeng
	 * 时间：2018年5月13日-下午6:42:20 
	 * 手机:17673111810
	 * @param no
	 * @return ModelAndView
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping("stylemagazine/{no}")
	public ModelAndView magazine(@PathVariable("no")int no){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("magazineLists", magazineListDo.fondStyleMagazinList(no));
		modelAndView.addObject("magazineList", indexDo.indexMagazineDo());
		modelAndView.setViewName("magazinelist");
		return modelAndView;
	}
	
	/**
	 * 模糊查詢
	 * 方法名：fondNameMagazine
	 * 创建人：chenPeng
	 * 时间：2018年5月13日-下午7:35:32 
	 * 手机:17673111810
	 * @param re
	 * @return ModelAndView
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping(method=RequestMethod.POST,value="/fond")
	@ResponseBody
	public ModelAndView fondNameMagazine(HttpServletRequest re){
		ModelAndView modelAndView = new ModelAndView();
		String string = "%"+re.getParameter("string")+"%";
		modelAndView.setViewName("magazinelist");
		modelAndView.addObject("magazineList", indexDo.indexMagazineDo());
		modelAndView.addObject("magazineLists", 
					magazineListDo.fondNameMagazineList(string));
		return modelAndView;
	}
}

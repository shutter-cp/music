/**
 * chenPeng
 * com.looc.music.web
 * AdminUpMagazine.java
 * 创建人:chenpeng
 * 时间：2018年5月15日-下午1:13:21 
 * 2018陈鹏-版权所有
 */
package com.looc.music.web;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.looc.music.bean.AddMagazienBean;
import com.looc.music.bean.AdminMagazineBean;
import com.looc.music.bean.UserBean;
import com.looc.music.service.AddMagazineDo;
import com.looc.music.service.AdminMagazineDo;

/**
 * 
 * AdminUpMagazine
 * 创建人:chenPeng
 * 时间：2018年5月15日-下午1:13:21 
 * @version 1.0.0
 * 
 */
@Controller
public class AdminUpMagazine {
	@Autowired
	private AdminMagazineDo adminMagazineDo;
	
	@Autowired
	private AddMagazineDo addMagazineDo;
	/**
	 * 写博客
	 * 方法名：authordo
	 * 创建人：chenPeng
	 * 时间：2018年5月15日-下午1:13:58 
	 * 手机:17673111810
	 * @param upFile
	 * @param aaa
	 * @param se
	 * @return
	 * @throws Exception ModelAndView
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping("/authordo")
	public ModelAndView authordo(
					@RequestParam MultipartFile[] upFile,
					@RequestParam("magazineText")String magazineText,
					@RequestParam("title")String title,
					@RequestParam("musicID")String musicID,
					@RequestParam("name")String name,
					@RequestParam("musicText")String musicText,
					@RequestParam("musicStyle")String musicStyle,
					HttpSession se
						)throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		/**
		 * 得到路径
		 */
		String path = se.getServletContext().getRealPath("/img");
		String musicPath = se.getServletContext().getRealPath("/music");
		
		System.out.println("=================================");
		
		/**
		 * 先行判断
		 */
		for (MultipartFile multipartFile : upFile) {
			if(multipartFile.getSize()<=0){
				modelAndView.setViewName("error");
				return modelAndView;
			}
		}
		
		/**
		 * 判断文件是否正确
		 */
		if(!upFile[0].getOriginalFilename().endsWith(".jpg")||
				!upFile[1].getOriginalFilename().endsWith(".jpg")||
					!upFile[2].getOriginalFilename().endsWith(".mp3")){
			modelAndView.setViewName("error");
			return modelAndView;
		}
		
		/**
		 * 得到名字  multipartFile.getOriginalFilename();
		 */
		UserBean user = (UserBean) se.getAttribute("authors");
		
		
		/**
		 * 将文件放入数据库
		 */
		String musicImgName = "";
		String magazineImgName = "";
		String musicName = "";
		
		musicImgName = "music_"+musicID+".jpg";
		File musicImg = new File(path+"\\music",musicImgName);
		upFile[0].transferTo(musicImg);
		
		magazineImgName = "magazine_"+title+".jpg";
		File magazineImg = new File(path+"\\magazine",magazineImgName);
		upFile[1].transferTo(magazineImg);
		
		musicName = "music_"+musicID+".mp3";
		File music = new File(musicPath,musicName);
		upFile[2].transferTo(music);

		
		/**
		 * 放入bean
		 */
		AddMagazienBean addMagazienBean = new AddMagazienBean();
		addMagazienBean.setMagazineImg(magazineImgName);
		addMagazienBean.setMagazineText(magazineText);
		addMagazienBean.setMagazineTitle(title);
		addMagazienBean.setMusicID(musicID);
		addMagazienBean.setMusicImg(musicImgName);
		addMagazienBean.setMusicSrc(musicName);
		addMagazienBean.setMusicText(musicText);
		addMagazienBean.setName(name);
		addMagazienBean.setStyleName(Integer.valueOf(musicStyle));
		addMagazienBean.setUserID(user.getUserID());
		
		/**
		 * 写入
		 */
		addMagazineDo.addMmusicdo(addMagazienBean);
		addMagazineDo.addMagazinedo(addMagazienBean);
		/**
		 * 返回
		 */
		List<AdminMagazineBean> authorMagazineList = 
				adminMagazineDo.authorFondMagazineDo(user.getUsername());
		modelAndView.addObject("authorMagazineList", authorMagazineList);
		modelAndView.setViewName("admin/author");
		return modelAndView;
	}
}

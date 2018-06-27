/**
 * chenPeng
 * com.looc.music.web
 * Comment.java
 * 创建人:chenpeng
 * 时间：2018年5月13日-下午3:28:04 
 * 2018陈鹏-版权所有
 */
package com.looc.music.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.looc.music.bean.CommentBean;
import com.looc.music.service.CommentDo;

/**
 * 
 * Comment
 * 创建人:chenPeng
 * 时间：2018年5月13日-下午3:28:04 
 * @version 1.0.0
 * 
 */
@Controller
public class Comment {
	@Autowired
	private CommentDo commentDo;
	/**
	 * 写评论
	 * 方法名：comment
	 * 创建人：chenPeng
	 * 时间：2018年5月13日-下午3:30:11 
	 * 手机:17673111810
	 * @return String
	 * @exception 
	 * @since  1.0.0
	 */
	@RequestMapping(method=RequestMethod.POST,value="/comment")
	@ResponseBody
	public String comment(HttpServletRequest re){
		CommentBean commentBean = new CommentBean();
		commentBean.setComment(re.getParameter("comment"));
		commentBean.setMagazineID(Integer.valueOf(re.getParameter("magazineID")));
		commentBean.setUserID(Integer.valueOf(re.getParameter("userID")));
		commentDo.addCommentDo(commentBean);
		return "success";
	}
}

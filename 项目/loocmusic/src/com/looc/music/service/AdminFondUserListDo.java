/**
 * chenPeng
 * com.looc.music.service
 * AdminFondUserList.java
 * 创建人:chenpeng
 * 时间：2018年5月14日-下午7:32:34 
 * 2018陈鹏-版权所有
 */
package com.looc.music.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.looc.music.bean.UserBean;
import com.looc.music.dao.AdminFondUserDao;

/**
 * 
 * AdminFondUserList
 * 创建人:chenPeng
 * 时间：2018年5月14日-下午7:32:34 
 * @version 1.0.0
 * 
 */


@Service
public class AdminFondUserListDo {
	@Autowired
	private AdminFondUserDao adminFondUserDa;
	
	/**
	 * 根据号码查询出自己的user
	 * 方法名：adminFondUserList
	 * 创建人：chenPeng
	 * 时间：2018年5月14日-下午7:38:57 
	 * 手机:17673111810
	 * @param no
	 * @return List<UserBean>
	 * @exception 
	 * @since  1.0.0
	 */
	public List<UserBean> adminFondUserList(int no){
		return adminFondUserDa.fondUser(no);
	}
}

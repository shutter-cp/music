/**
 * chenPeng
 * com.looc.music.service
 * AdminMagazineDo.java
 * 创建人:chenpeng
 * 时间：2018年5月14日-上午9:10:42 
 * 2018陈鹏-版权所有
 */
package com.looc.music.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.looc.music.bean.AdminMagazineBean;
import com.looc.music.dao.AdminMagazineDao;

/**
 * 
 * AdminMagazineDo
 * 创建人:chenPeng
 * 时间：2018年5月14日-上午9:10:42 
 * @version 1.0.0
 * 
 */
@Service
public class AdminMagazineDo {
	@Autowired
	private AdminMagazineDao adminMagazineDao;
	
	/**
	 * 作者查询杂志
	 * 方法名：authorFondMagazineDo
	 * 创建人：chenPeng
	 * 时间：2018年5月14日-上午9:12:40 
	 * 手机:17673111810
	 * @param username
	 * @return List<AdminMagazineBean>
	 * @exception 
	 * @since  1.0.0
	 */
	public List<AdminMagazineBean> 
		authorFondMagazineDo(String username){
		return adminMagazineDao.authorFondMagazineList(username);
	}
	
	/**
	 * 管理员查询
	 * 方法名：adminFondMagazienDo
	 * 创建人：chenPeng
	 * 时间：2018年5月14日-上午9:14:14 
	 * 手机:17673111810
	 * @return List<AdminMagazineBean>
	 * @exception 
	 * @since  1.0.0
	 */
	public List<AdminMagazineBean> adminFondMagazienDo(){
		return adminMagazineDao.adminFondMagazineList();
	}
	
	/**
	 * 杂志开放状态管理
	 * 方法名：onapproval
	 * 创建人：chenPeng
	 * 时间：2018年5月14日-下午5:18:04 
	 * 手机:17673111810
	 * @param on void
	 * @exception 
	 * @since  1.0.0
	 */
	public void onapproval(int no){
		adminMagazineDao.onapproval(no);
	}
	public void offapproval(int no){
		adminMagazineDao.offapproval(no);
	}
	
	/**
	 * 执行绝对删除
	 * 方法名：adminDeletDo
	 * 创建人：chenPeng
	 * 时间：2018年6月21日-下午12:53:44 
	 * 手机:17673111810
	 * @param magazineID void
	 * @exception 
	 * @since  1.0.0
	 */
	public void adminDeletDo(int magazineID){
		adminMagazineDao.adminDelet(magazineID);
	}
}

/**
 * chenPeng
 * com.looc.music.dao
 * AdminMagazine.java
 * 创建人:chenpeng
 * 时间：2018年5月14日-上午8:57:18 
 * 2018陈鹏-版权所有
 */
package com.looc.music.dao;

import java.util.List;

import com.looc.music.bean.AdminMagazineBean;

/**
 * 
 * AdminMagazine
 * 创建人:chenPeng
 * 时间：2018年5月14日-上午8:57:18 
 * @version 1.0.0
 * 
 */
public interface AdminMagazineDao {
	/**
	 * 作者查询
	 * 方法名：authorFondMagazineList
	 * 创建人：chenPeng
	 * 时间：2018年5月14日-上午8:59:45 
	 * 手机:17673111810
	 * @return List<AdminMagazineBean>
	 * @exception 
	 * @since  1.0.0
	 */
	public List<AdminMagazineBean> authorFondMagazineList(String username);
	
	/**
	 * 管理员查询
	 * 方法名：adminFondMagazineList
	 * 创建人：chenPeng
	 * 时间：2018年5月14日-上午9:00:47 
	 * 手机:17673111810
	 * @return List<AdminMagazineBean>
	 * @exception 
	 * @since  1.0.0
	 */
	public List<AdminMagazineBean> adminFondMagazineList();
	
	/**
	 * 修改开放状态
	 * 方法名：offapproval
	 * 创建人：chenPeng
	 * 时间：2018年5月14日-下午5:10:13 
	 * 手机:17673111810
	 * @param temp void
	 * @exception 
	 * @since  1.0.0
	 */
	public void offapproval(int no);
	public void onapproval(int no);
	
	/**
	 * 删除
	 * 方法名：adminDelet
	 * 创建人：chenPeng
	 * 时间：2018年6月21日-下午12:58:02 
	 * 手机:17673111810
	 * @param magazinID void
	 * @exception 
	 * @since  1.0.0
	 */
	public void adminDelet(int magazineID);
}

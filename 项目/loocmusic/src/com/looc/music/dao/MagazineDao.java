/**
 * chenPeng
 * com.looc.music.dao
 * MagazineDao.java
 * 创建人:chenpeng
 * 时间：2018年5月11日-下午10:51:47 
 * 2018陈鹏-版权所有
 */
package com.looc.music.dao;

import java.util.List;

import com.looc.music.bean.CommentBean;
import com.looc.music.bean.MagazineBean;
import com.looc.music.bean.MagazineListBean;

/**
 * 
 * MagazineDao
 * 创建人:chenPeng
 * 时间：2018年5月11日-下午10:51:47 
 * @version 1.0.0
 * 
 */
public interface MagazineDao {
	/**
	 * 查询出杂志列表
	 * 方法名：fondMagazineList
	 * 创建人：chenPeng
	 * 时间：2018年5月11日-下午10:53:00 
	 * 手机:17673111810
	 * @return List<MagazineListBean>
	 * @exception 
	 * @since  1.0.0
	 */
	public List<MagazineListBean> fondMagazineList();
	
	/**
	 * 查询到单本杂志
	 * 方法名：fondMagazine
	 * 创建人：chenPeng
	 * 时间：2018年5月12日-上午12:20:41 
	 * 手机:17673111810
	 * @return MagazineBean
	 * @exception 
	 * @since  1.0.0
	 */
	public MagazineBean fondMagazine(int no);
	
	/**
	 * 查询到评论
	 * 方法名：fondComment
	 * 创建人：chenPeng
	 * 时间：2018年5月12日-上午12:22:04 
	 * 手机:17673111810
	 * @param no
	 * @return CommentBean
	 * @exception 
	 * @since  1.0.0
	 */
	public List<CommentBean> fondComment(int no);
	
	/**
	 * 按风格查找杂志
	 * 方法名：fondStyleMagazine
	 * 创建人：chenPeng
	 * 时间：2018年5月13日-下午5:08:32 
	 * 手机:17673111810
	 * @param no
	 * @return List<MagazineListBean>
	 * @exception 
	 * @since  1.0.0
	 */
	public List<MagazineListBean> fondStyleMagazine(int no);
	
	/**
	 * 模糊查询
	 * 方法名：fondNameMagazine
	 * 创建人：chenPeng
	 * 时间：2018年5月13日-下午6:17:00 
	 * 手机:17673111810
	 * @param string
	 * @return List<MagazineListBean>
	 * @exception 
	 * @since  1.0.0
	 */
	public List<MagazineListBean> fondNameMagazine(String string);
}

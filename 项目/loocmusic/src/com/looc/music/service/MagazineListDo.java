/**
 * chenPeng
 * com.looc.music.service
 * MagazineListDO.java
 * 创建人:chenpeng
 * 时间：2018年5月11日-下午10:54:20 
 * 2018陈鹏-版权所有
 */
package com.looc.music.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.looc.music.bean.MagazineListBean;
import com.looc.music.dao.MagazineDao;

/**
 * 
 * MagazineListDO
 * 创建人:chenPeng
 * 时间：2018年5月11日-下午10:54:20 
 * @version 1.0.0
 * 
 */
@Service
public class MagazineListDo {
	@Autowired
	private MagazineDao magazineDao;
	
	/**
	 * 得到前几的杂志
	 * 方法名：fondMagazineList
	 * 创建人：chenPeng
	 * 时间：2018年5月13日-下午5:10:02 
	 * 手机:17673111810
	 * @return List<MagazineListBean>
	 * @exception 
	 * @since  1.0.0
	 */
	public List<MagazineListBean> fondMagazineList(){
		return magazineDao.fondMagazineList();
	}
	
	/**
	 * 得到指定风格的杂志
	 * 方法名：fondStyleMagazinList
	 * 创建人：chenPeng
	 * 时间：2018年5月13日-下午5:12:26 
	 * 手机:17673111810
	 * @param no
	 * @return List<MagazineListBean>
	 * @exception 
	 * @since  1.0.0
	 */
	public List<MagazineListBean> fondStyleMagazinList(int no){
		return magazineDao.fondStyleMagazine(no);
	}
	
	/**
	 * 模糊查询
	 * 创建人：chenPeng
	 * 时间：2018年5月13日-下午6:19:04 
	 * 手机:17673111810
	 * @param string
	 * @return List<MagazineListBean>
	 * @exception 
	 * @since  1.0.0
	 */
	public List<MagazineListBean> fondNameMagazineList(String string){
		return magazineDao.fondNameMagazine(string);
	}
}

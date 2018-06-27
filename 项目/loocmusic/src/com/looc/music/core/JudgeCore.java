/**
 * chenPeng
 * com.looc.music.core
 * JudgeCore.java
 * 创建人:chenpeng
 * 时间：2018年5月13日-上午1:36:45 
 * 2018陈鹏-版权所有
 */
package com.looc.music.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * JudgeCore
 * 创建人:chenPeng
 * 时间：2018年5月13日-上午1:36:45 
 * @version 1.0.0
 * 
 */
public class JudgeCore {
	/**
	 * 判断空 空返回true
	 * 方法名：judgeNull
	 * 创建人：chenPeng
	 * 时间：2018年5月13日-上午1:50:20 
	 * 手机:17673111810
	 * @param string
	 * @return boolean
	 * @exception 
	 * @since  1.0.0
	 */
	public static boolean judgeNull(String string){
		return (string.equals("")||string==null);
	}
	/**
	 * 判断用户名和密码是否为空
	 * 方法名：loginJudge
	 * 创建人：chenPeng
	 * 时间：2018年5月13日-上午1:43:03 
	 * 手机:17673111810
	 * @param username
	 * @param password
	 * @return boolean
	 * @exception 
	 * @since  1.0.0
	 */
	public boolean judgeLogin(String username,String password){
		if(judgeNull(username)||judgeNull(password)){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		JudgeCore j = new JudgeCore();
		System.out.println(j.judgeLogin("s", "s"));
	}
	/**
	 * 邮箱判断
	 * 方法名：emailJudge
	 * 创建人：chenPeng
	 * 时间：2018年5月13日-上午1:54:30 
	 * 手机:17673111810
	 * @param email
	 * @return boolean
	 * @exception 
	 * @since  1.0.0
	 */
	public boolean judgeEmail(String email){
		if(judgeNull(email)||
				!email.endsWith(".com")||
					(email.indexOf("@")==0)){
			return false;
		}
		return true;
	}
	
	/**
	 * 判断手机号码
	 * 方法名：judgePhone
	 * 创建人：chenPeng
	 * 时间：2018年5月13日-上午2:07:32 
	 * 手机:17673111810
	 * @param phone
	 * @return boolean
	 * @exception 
	 * @since  1.0.0
	 */
	public boolean judgePhone(String phone){
		Pattern pattern = Pattern.compile("[0-9]*");
		Matcher isNum = pattern.matcher(phone);
		if(!isNum.matches()||phone.length()!=11||judgeNull(phone)){
			return false;
		}
		return true;
	}
	public boolean judgePhone(Long phone){
		if(phone.toString().length()!=11){
			return false;
		}
		return true;
	}
	
}

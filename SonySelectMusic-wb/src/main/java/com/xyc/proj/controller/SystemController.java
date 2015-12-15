/**
 * All rights, including trade secret rights, reserved.
 */
package com.xyc.proj.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.xyc.proj.entity.ProcessItem;
import com.xyc.proj.entity.SysUser;
import com.xyc.proj.global.Constants;

/**
 * 系统管理
 * @author xieyunchao
 *
 */
@Controller
public class SystemController {
	
	 @RequestMapping("/server/doLogin")
	 public String doLogin(
	            @RequestParam(value = "code", required = false) String code,
	            HttpSession session,Model model) {
		 SysUser su=(SysUser)Constants.userMap.get(code);
		 session.setAttribute("user", su);
		 model.addAttribute("user", su);
		 if(session.getAttribute("process")==null) {
			 session.setAttribute("process", new ProcessItem());
		 }
		 
		 return "forward:/server/index.html?userName="+su.getUserName();
	 }
	 

	 @RequestMapping("/server/index.html")
	 public String index(
			 @RequestParam(value = "userName", required =false) String userName   ,
	            Model model, HttpSession session) {
		 session.setAttribute("taskCount", getTask(userName,session));
		 return "server/index";
	 }
	 
	 @RequestMapping("/login.html")
	 public String loginInit(
	            Model model, HttpSession session) {
		 
		 return "login";
	 }
	 
	 @RequestMapping("/server/queryUser.html")
	 public String queryUser(
	            HttpSession session,Model model) {
		 return "server/queryUser";
	 }
	 
	 @RequestMapping("/server/sysuserAddInit.html")
	 public String sysuserAddInit(
	            HttpSession session,Model model) {
		 return "server/sysuserAdd";
	 }
	 
	 @RequestMapping("/server/queryRole.html")
	 public String queryRole(
	            HttpSession session,Model model) {
		 return "server/queryRole";
	 }
	 
	 @RequestMapping("/server/roleAddInit.html")
	 public String roleAddInit(
	            HttpSession session,Model model) {
		 return "server/roleAdd";
	 }
	 
	 @RequestMapping("/server/authAssign.html")
	 public String authAssign(
	            HttpSession session,Model model) {
		 return "server/authAssign";
	 }
	 
	 @RequestMapping("/server/queryDivision.html")
	 public String queryDivision(
	            HttpSession session,Model model) {
		 return "server/queryDivision";
	 }
	 
	 @RequestMapping("/server/addDivisionInit.html")
	 public String addDivisionInit(
	            HttpSession session,Model model) {
		 return "server/divisionAdd";
	 }
	 
	 @RequestMapping("/server/teamQuery.html")
	 public String teamQuery(
	            HttpSession session,Model model) {
		 return "server/teamQuery";
	 }
	 
	 @RequestMapping("/server/teamAddInit.html")
	 public String teamAddInit(
	            HttpSession session,Model model) {
		 return "server/teamAdd";
	 }

	 //查询代办任务数量 
	 private int getTask(String userName,HttpSession session) {
		 ProcessItem p=(ProcessItem)session.getAttribute("process");
		 if(p==null)return 0;
		 if(userName.equals(p.getActor())) {
			 return 1;
		 }
		 return 0;
	 }
	 
	 
}

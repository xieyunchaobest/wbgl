/**
 * All rights, including trade secret rights, reserved.
 */
package com.xyc.proj.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		 session.setMaxInactiveInterval(3600);
		 return "redirect:/server/index.html";
	 }
	 

	 @RequestMapping("/server/index.html")
	 public String index(
	            @RequestParam(value = "code", required = false) String code,
	            Model model, HttpSession session) {
		 SysUser su=(SysUser)session.getAttribute("user");
		 
		 model.addAttribute("user", su);
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

}

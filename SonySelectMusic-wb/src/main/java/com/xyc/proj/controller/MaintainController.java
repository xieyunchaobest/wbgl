/**
 * All rights, including trade secret rights, reserved.
 */
package com.xyc.proj.controller;

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
public class MaintainController {
	
	 @RequestMapping("/server/maintainTaskQuery.html")
	 public String maintainTaskQuery(
	            HttpSession session,Model model) {
		 return "server/maintainTaskQuery";
	 }
	 
	 
	 @RequestMapping("/server/maintainTaskAddInit.html")
	 public String maintainTaskAddInit(
	            HttpSession session,Model model) {
		 return "server/maintainTaskAdd";
	 }
	 
	 @RequestMapping("/server/maintainTask4ItemList.html")
	 public String maintainTask4ItemList(
	            HttpSession session,Model model) {
		 return "server/maintainTask4ItemList";
	 }
	 
	 
	 @RequestMapping("/server/maintainItemQuery.html")
	 public String maintainItemQuery(
	            HttpSession session,Model model) {
		 return "server/maintainItemQuery";
	 }
	 
	 @RequestMapping("/server/maintainItemAddInit.html")
	 public String maintainItemAddInit(
	            HttpSession session,Model model) {
		 return "server/maintainItemAdd";
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}

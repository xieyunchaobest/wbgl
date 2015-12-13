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
public class ConfigController {
	
	 @RequestMapping("/server/processConfig.html")
	 public String processConfig(
	            @RequestParam(value = "code", required = false) String code,
	            HttpSession session,Model model) {
		 return "server/processConfig";
	 }
	 
	 
	 @RequestMapping("/server/processDuringConfig.html")
	 public String processDuring(
	            HttpSession session,Model model) {
		 return "server/processDuringConfig";
	 }
	 

	 @RequestMapping("/server/processDuringAddInit.html")
	 public String processDuringAddInit(
	            HttpSession session,Model model) {
		 return "server/processDuringAdd";
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}

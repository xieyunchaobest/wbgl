/**
 * All rights, including trade secret rights, reserved.
 */
package com.xyc.proj.controller;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.http.HttpSession;

import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.xyc.proj.entity.ProcessItem;
import com.xyc.proj.entity.SysUser;
import com.xyc.proj.global.CharacterEncodingFilter;
import com.xyc.proj.utility.StringUtil;

/**
 * 系统管理
 * @author xieyunchao
 *
 */
@Controller
public class StatisticController {
	
	 @RequestMapping("/server/leveloneItemStatistic.html")
	 public String maintainTaskQuery(
	            HttpSession session,Model model) {
		 return "server/leveloneItemStatistic";
	 }
	 @RequestMapping("/server/areastatistic.html")
	 public String areastatistic(
	            HttpSession session,Model model) {
		 return "server/areastatistic";
	 }
	 
	 
	
	 
}

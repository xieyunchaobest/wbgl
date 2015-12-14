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
	            HttpSession session,Model model,
	            @RequestParam(value = "userName", required = true) String userName
			 ) {
		 model.addAttribute("userName", userName);
		 return "server/maintainItemQuery";
	 }
	 
	 @RequestMapping("/server/maintainItemAddInit.html")
	 public String maintainItemAddInit(
	            HttpSession session,Model model,
	            @RequestParam(value = "userName", required = true) String userName   
			 ) {
		 model.addAttribute("userName", userName);
		 return "server/maintainItemAdd";
	 }
	 
	 @RequestMapping("/server/todoTask.html")
	 public String todoTask(
	            HttpSession session,Model model,
	            @RequestParam(value = "userName", required = true) String userName   
			 ) {
		 model.addAttribute("userName", userName);
		 return "server/todoTask";
	 }
	 
	 @ResponseBody
	 @RequestMapping("/server/maintainItemSave.html")
	 public String maintainItemSave(
	            HttpSession session,Model model,@ModelAttribute("p") ProcessItem process,
	            @RequestParam(value = "userName", required = true) String userName   ) {
		 String res="S";
		 try {
			 updateProcess(process);
			 session.setAttribute("process", process);
		 }catch(Exception e) {
			 res="F";
		 }
		 return res;
	 }
	  
	 
	 private void updateProcess(ProcessItem p) {
		 String currentNode=p.getCurrentNodeName();
		 if(StringUtil.isBlank(currentNode)) {
			 p.setCurrentNodeName("统一接单");
			 p.setActor("DDS");
			 p.setWgyj("物业管家A");
		 }else if("统一接单".equals(currentNode)){
			 p.setCurrentNodeName("现场看擦");
			 p.setActor("区域负责人A");
		 }else if ("现场看擦".equals(currentNode)) {
			 p.setCurrentNodeName("制定维修方案");
			 p.setActor("区域负责人A");
		 }
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 @Bean
		public FilterRegistrationBean encodingFilter() {
			FilterRegistrationBean registration = new FilterRegistrationBean();
			registration.setFilter(new CharacterEncodingFilter());
			registration.setDispatcherTypes(EnumSet.allOf(DispatcherType.class));
			return registration;
		}
	 
}

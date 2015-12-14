package com.xyc.proj.global;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import com.xyc.proj.entity.SysUser;
import com.xyc.proj.utility.Properties;

public class ApplicationStartup implements ApplicationListener<ContextRefreshedEvent> {
 
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
    	Properties prop =event.getApplicationContext().getBean(Properties.class);
    	 Constants.userMap=initUsers();
    	 Constants.processNameList=initProcessNameList();
    }
   
    private Map initUsers() {
		 SysUser su1=new SysUser();
		 su1.setId(1l);
		 su1.setUserName("WYGJ");
		 su1.setStaffName("物业管家A");
		 
		 SysUser su2=new SysUser();
		 su2.setId(2l);
		 su2.setUserName("DDS");
		 su2.setStaffName("调度室A");
		 
		 SysUser su3=new SysUser();
		 su3.setId(3l);
		 su3.setUserName("QYFZR");
		 su3.setStaffName("区域负责人A");
		 
		 SysUser su4=new SysUser();
		 su4.setId(4l);
		 su4.setUserName("WBBJL");
		 su4.setStaffName("维保部经理");
		 
		 SysUser su5=new SysUser();
		 su5.setId(5l);
		 su5.setUserName("WXFZR");
		 su5.setStaffName("维修负责人A");
		 
		 SysUser su6=new SysUser();
		 su6.setId(6l);
		 su6.setUserName("BLY");
		 su6.setStaffName("备料员A");
		 
		 Map  userMap=new HashMap();
		 userMap.put("WYGJ", su1);
		 userMap.put("DDS", su2);
		 userMap.put("QYFZR", su3);
		 userMap.put("WBBJL", su4);
		 userMap.put("WXFZR", su5);
		 userMap.put("BLY", su6);
		 
		 return userMap;
	 }
    
    public List initProcessNameList() {
    	List list=new ArrayList();
    	String m1="开始";
    	String m2="统一接单";
    	String m3="现场看擦";
    	String m4="制定维修方案";
    	
    	list.add(m1);
    	list.add(m2);
    	list.add(m3);
    	list.add(m4);
    	
    	
    	return list;
    }
    
}
package com.xyc.proj.service;

import java.util.List;
import java.util.Map;

import com.xyc.proj.entity.Worker;
import com.xyc.proj.utility.PageView;

public interface ServerService {
	List findWorkList(Map pm);
	
	public PageView getWorkPage(Map m) ;
	
	public Worker getWorker(Long workerId);
	
	public void deleteWorker(String workIds);
	
	public PageView getOrderPageView(Map m);
	
	public void dispatchOrder(String orderIds,Long ayiId); 
	
	public List findByCodeAndPassword(String code,String pwd);
	public List findStore();
	
	public PageView getCommunityPage(Map parm);
	
	public PageView getClientUserPage(Map parm);

}

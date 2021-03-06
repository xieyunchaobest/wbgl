package com.xyc.proj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.xyc.proj.entity.UserAuthCode;



public interface UserCodeRepository extends JpaRepository<UserAuthCode, Long> {

	@Query("select u from UserAuthCode u where u.mobileNo = ?1 and authCode=?2 order by createdTime desc") 
	List findUserByMobileAndAuthCode(String mobileNo,String authCode);
}

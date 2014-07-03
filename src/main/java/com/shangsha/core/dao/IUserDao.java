package com.shangsha.core.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shangsha.core.entity.UserEntity;

@Repository
public interface IUserDao {
	
	public List<UserEntity> query();
	
}

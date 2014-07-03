package com.shangsha.core.dao;

import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.shangsha.core.BaseTestCase;
import com.shangsha.core.entity.UserEntity;

public class IUserDaoTest extends BaseTestCase{

	@Autowired
	private IUserDao userDao;
	
	@Test
	public void testBean(){
		assertNotNull(userDao);
	}
	
	@Test
	public void testQuery(){
		List<UserEntity> list = userDao.query();
		System.out.println(list.get(0).getUserName());
	}
}

package com.shangsha.core;
/**   
* @Title: BaseTestCase.java 
* @Description: 测试基类  
* @author 你的名字   
* @date 2014-7-1 上午11:02:12 
* @version V1.0   
*/


import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
* @ClassName: GameControllerTestCase 
* @Description: 测试基类 
* @author hugh
* @date 2014-7-1 上午11:02:12 
*  
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
abstract public class BaseTestCase {

}

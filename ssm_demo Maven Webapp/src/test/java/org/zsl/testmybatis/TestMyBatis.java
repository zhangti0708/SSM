package org.zsl.testmybatis;
 
import javax.annotation.Resource;
 
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
 
import com.alibaba.fastjson.JSON;
import com.cn.hnust.bean.InputParamBean;
import com.cn.hnust.bean.OutputResultBean;
import com.cn.hnust.entity.User;
import com.cn.hnust.service.UserService;
 
@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:conf/spring-mybatis.xml"})
 
public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
//	private ApplicationContext ac = null;
	@Resource
	private UserService userService = null;
 
//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) ac.getBean("userService");
//	}
 
	@Test
	public void test1() {
		InputParamBean baen = new InputParamBean();
		baen.setUser_id(1);
		OutputResultBean result = userService.getUserByid(baen);
		System.out.println(result.getResult());
	   // logger.info("值："+user.getName());
		logger.info(JSON.toJSONString(result));
	}
	
	@Test
	public void test2() {
		InputParamBean baen = new InputParamBean();
		baen.setUser_name("李四");
		baen.setUser_password("a123456");
		baen.setUser_code("lisi");
		baen.setUser_type("1");
		OutputResultBean result = userService.saveUser(baen);
		System.out.println(result.getResult());
	   // logger.info("值："+user.getName());
		logger.info(JSON.toJSONString(result));
	}
	
	@Test
	public void test3() {
		InputParamBean baen = new InputParamBean();
		baen.setUser_id(2);
		OutputResultBean result = userService.rmoverUser(baen);
		System.out.println(result.getResult());
	   // logger.info("值："+user.getName());
		logger.info(JSON.toJSONString(result));
	}
	
	@Test
	public void test4() {
		InputParamBean baen = new InputParamBean();
		baen.setUser_id(3);
		baen.setUser_name("张三");
		baen.setUser_password("a123456");
		baen.setUser_code("zhangsan");
		baen.setUser_type("1");
		OutputResultBean result = userService.changeUser(baen);
		System.out.println(result.getResult());
	   // logger.info("值："+user.getName());
		logger.info(JSON.toJSONString(result));
	}
}


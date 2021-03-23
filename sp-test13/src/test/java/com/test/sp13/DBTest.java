package com.test.sp13;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class DBTest {
	@Autowired
	@Qualifier("dmds")
	private DriverManagerDataSource dmds;
	
	@Test
	public void test(){
		Connection con = null;
		try {
			con = dmds.getConnection();
		}catch(Exception e) {
			e.printStackTrace();
		}
		assertNotNull(con);
	}

}

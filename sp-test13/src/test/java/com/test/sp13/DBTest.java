package com.test.sp13;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DBTest {
	
	@Test
	public void test(){
		DriverManagerDataSource dm = new DriverManagerDataSource();
		dm.setDriverClassName("oracle.jdbc.OracleDriver");
		dm.setUrl("jdbc:oracle:thin:@localhost:1521/xe");
		dm.setUsername("jtest");
		dm.setPassword("ezen1234");
		
		//assertNotNull(dm);
		
		Connection con = null;
		
		try {
			con = dm.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		assertNotNull(con);
	}

}

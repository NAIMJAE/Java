package com.myshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.myshop.db.DBHelper;
import com.myshop.db.SQL;
import com.myshop.dto.CustomerDTO;

public class CustomerDAO extends DBHelper{
	
	// 싱글톤
	private static CustomerDAO instance = new CustomerDAO();
	public static CustomerDAO getInstance() {
		return instance;
	}
	private CustomerDAO() {}
	
	// CRUD 매서드
	public void insertCustomer(CustomerDTO dto) {
		
		try {
			// 1,2 단계
			conn = getConnection();
			// 3단계
			psmt = conn.prepareStatement(SQL.INSERT_CUSTOMER);
			psmt.setString(1, dto.getCustId());
			psmt.setString(2, dto.getName());
			psmt.setString(3, dto.getHp());
			psmt.setString(4, dto.getAddr());
			
			// 4단계
			psmt.executeUpdate();
			
			// 5단계
			// 6단계
			Close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public CustomerDTO selectCustomer(String custId) {

		CustomerDTO customer = new CustomerDTO();
		
		try {
			// 1,2 단계
			conn = getConnection();
			
			// 3단계
			psmt = conn.prepareStatement(SQL.SELECT_CUSTOMER);
			psmt.setString(1, custId);
			
			// 4단계
			rs = psmt.executeQuery();
			
			// 5단계
			if(rs.next()) {
				customer = new CustomerDTO();
				customer.setCustId(rs.getString(1));
				customer.setName(rs.getString(2));
				customer.setHp(rs.getString(3));
				customer.setAddr(rs.getString(4));
				customer.setRdate(rs.getString(5));
			}
			
			// 6단계
			Close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return customer;
	}
	
	public List<CustomerDTO> selectCustomers() {
		
		try {
			// 1단계, 2단계
			// 3단계
			// 4단계
			// 5단계
			// 6단계
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void updateCustomer(CustomerDTO dto) {
		
		try {
			// 1단계, 2단계
			// 3단계
			// 4단계
			// 5단계
			// 6단계
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void deleteCustomer(String custId) {
		
		try {
			// 1단계, 2단계
			// 3단계
			// 4단계
			// 5단계
			// 6단계
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

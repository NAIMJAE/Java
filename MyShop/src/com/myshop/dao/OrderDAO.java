package com.myshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.myshop.db.DBHelper;
import com.myshop.db.SQL;
import com.myshop.dto.OrderDTO;

public class OrderDAO extends DBHelper{

	// 싱글톤
	private static OrderDAO instance = new OrderDAO();
	public static OrderDAO getInstance() {
		return instance;
	}
	private OrderDAO() {}
	
	// CRUD 메서드
	public void insertOrder(OrderDTO dto) {
		
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
	
	public OrderDTO selectOrder(int orderNo) {

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
	
	public List<OrderDTO> selectOrders(String custId) {

		List<OrderDTO> orders = new ArrayList<OrderDTO>();
		
		try {
			// 1단계, 2단계
			conn = getConnection();
			
			// 3단계
			psmt = conn.prepareStatement(SQL.SELECT_ORDERS);
			psmt.setString(1, custId);
			// 4단계
			rs = psmt.executeQuery();
			
			// 5단계
			while(rs.next()) {
				
				OrderDTO order = new OrderDTO();
				
				order.setOrderNo(rs.getInt(1));
				order.setOrderId(rs.getString(2));
				order.setOrderProduct(rs.getInt(3));
				order.setOrderCount(rs.getInt(4));
				order.setOrderDate(rs.getString(5));
				
				order.setProdName(rs.getString(6));
				order.setPrice(rs.getInt(7));
				order.setCompany(rs.getString(8));
				
				orders.add(order);
			}
			// 6단계
			Close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return orders;
	}
	
	public void updateOrder(OrderDTO dto) {

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
	
	public void deleteOrder(int orderNo) {

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

package com.myshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.myshop.db.DBHelper;
import com.myshop.dto.ProductDTO;

public class ProductDAO extends DBHelper{

	// 싱글톤
	private static ProductDAO instance = new ProductDAO();
	public static ProductDAO getInstance() {
		return instance;
	}
	private ProductDAO() {}
	
	// CRUD 메서드
	public void insertProduct(ProductDTO dto) {

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
	
	public ProductDTO selectProduct(int ProdNo) {

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

	public List<ProductDTO> selectProducts() {

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
	
	public void updateProduct(ProductDTO dto) {

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
	
	public void deleteProduct() {

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

package com.myshop.db;

public class SQL {
	
	// CUSTOMER
	public static final String INSERT_CUSTOMER = "INSERT INTO `Customer` SET"
												+ " `custId`=?,"
												+ " `name`=?,"
												+ " `hp`=?,"
												+ " `addr`=?,"
												+ " `rdate`=NOW()";
	public static final String SELECT_CUSTOMER = "SELECT * FROM `Customer` WHERE `custId`=?";
	public static final String SELECT_CUSTOMERS = "";
	public static final String UPDATE_CUSTOMER = "";
	public static final String DELETE_CUSTOMER = "";
	// ORDER
	public static final String INSERT_ORDER = "";
	public static final String SELECT_ORDER = "";
	public static final String SELECT_ORDERS = "SELECT a.*, `prodName`, `price`, `company` "
												+ "FROM `Order` AS A "
												+ "JOIN `Product` AS B "
												+ "ON A.`orderProduct` = B.`prodNo` "
												+ "WHERE `orderId`=? "
												+ "ORDER BY `orderDate` DESC";
	public static final String UPDATE_ORDER = "";
	public static final String DELETE_ORDER = "";
	// PRODUCT
	public static final String INSERT_PRODUCT = "";
	public static final String SELECT_PRODUCT = "";
	public static final String SELECT_PRODUCTS = "";
	public static final String UPDATE_PRODUCT = "";
	public static final String DELETE_PRODUCT = "";
}

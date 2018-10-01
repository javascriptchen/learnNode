package com.heima.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.heima.utils.C3P0Utils02;

/**
 * 转账Dao，主要是用来操作数据库
 * 
 * 我们案例中只涉及到修改操作
 * 
 * @author chenchen
 *
 */
public class AccountDao {
	// 1.转账出去
	// jack 转出去 1000
	public void fromAccount(String fromName, double money) throws SQLException {
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils02.getDataSource());
		// 2.执行减钱操作
		qr.update("update account set money=money-? where name=?", money, fromName);
	}

	public void toAccount(String toName, double money) throws SQLException {
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils02.getDataSource());
		// 2.执行减钱操作
		qr.update("update account set money=money+? where name=?", money, toName);
	}
}

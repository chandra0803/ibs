package com.ibsplc.TailogIntegration;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DelegatingDataSource;

import com.mysql.jdbc.Connection;

public class AbstractDataSource extends DelegatingDataSource {
	  public AbstractDataSource(DataSource delegate) {
	    super(delegate);
	  }
	  @Override
	  public Connection getConnection() throws SQLException {
	    return (Connection) super.getConnection();
	  }
	}

package com.tinat.tinatREST;

import javax.sql.DataSource;

public class PageDatabaseAbstractionObject {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public Page getPage(int pageNumber){
		Page newPage = new Page(pageNumber);
		return null;
		
	}
	
}

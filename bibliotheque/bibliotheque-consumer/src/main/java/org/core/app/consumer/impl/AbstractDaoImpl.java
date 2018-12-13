package org.core.app.consumer.impl;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

public abstract class AbstractDaoImpl {
	@Inject
	@Named("DataSourceBiblio")
	private static DataSource dataSource;
	
	protected DataSource getDataSource() {
		return dataSource;
	}
	
	public static void setDataSource(DataSource dataSource) {
        AbstractDaoImpl.dataSource = dataSource;
    }

}

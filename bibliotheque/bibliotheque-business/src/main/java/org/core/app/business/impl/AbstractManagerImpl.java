package org.core.app.business.impl;

import org.core.app.consumer.impl.DaoFactoryImpl;

public abstract class AbstractManagerImpl {
	
	private static DaoFactoryImpl daoFactory;
	
	protected static DaoFactoryImpl getDaoFactory() {
		return daoFactory;
	}
	
	public static void setDaoFactory(DaoFactoryImpl daoFactory) {
		AbstractManagerImpl.daoFactory=daoFactory;
	}

}

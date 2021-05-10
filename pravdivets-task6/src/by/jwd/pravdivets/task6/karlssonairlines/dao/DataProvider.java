package by.jwd.pravdivets.task6.karlssonairlines.dao;

import by.jwd.pravdivets.task6.karlssonairlines.exception.DaoException;

public class DataProvider implements PlanesDataLoader  {
	
	//singleton
	
	private DataProvider() {
	}

	private static DataProvider instance;

	public static synchronized DataProvider getInstance() {
		if (instance == null) {
			return new DataProvider();
		} else {
			return instance;
		}
	}
	
	
	@Override
	public String loadData() throws DaoException {
		
		try {
			return Reader.readFile();
		} catch (DaoException e) {
			throw new DaoException(e);
		}
	}

}

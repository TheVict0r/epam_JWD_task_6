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
	public String loadData(String source) throws DaoException {
	
		if (source == null) {
			throw new DaoException("The source was not provided");
		}
		
		try {
			return Reader.readFile(source);
		} catch (DaoException e) {
			throw new DaoException(e);
		}
	}

}

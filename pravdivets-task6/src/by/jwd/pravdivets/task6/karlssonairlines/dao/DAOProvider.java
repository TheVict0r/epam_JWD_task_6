package by.jwd.pravdivets.task6.karlssonairlines.dao;

import by.jwd.pravdivets.task6.karlssonairlines.dao.impl.FileDataLoader;

public class DAOProvider {
	
	//singleton
	
	private static DAOProvider instance;
	private PlanesDataLoader loader = new FileDataLoader();
	
	private DAOProvider() {
	}

	public static synchronized DAOProvider getInstance() {
		if (instance == null) {
			return new DAOProvider();
		} else {
			return instance;
		}
	}

	public PlanesDataLoader getLoader() {
		return loader;
	}

	public void setLoader(PlanesDataLoader loader) {
		this.loader = loader;
	}
	
	


}

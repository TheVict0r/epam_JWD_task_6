package by.jwd.pravdivets.task6.karlssonairlines.dao;

import by.jwd.pravdivets.task6.karlssonairlines.dao.impl.FileDataLoader;

public class DataProvider {
	
	//singleton
	
	private static DataProvider instance;
	private PlanesDataLoader loader = new FileDataLoader();
	
	private DataProvider() {
	}

	public static synchronized DataProvider getInstance() {
		if (instance == null) {
			return new DataProvider();
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

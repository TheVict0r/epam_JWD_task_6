package by.jwd.pravdivets.task6.karlssonairlines.dao.impl;

import by.jwd.pravdivets.task6.karlssonairlines.dao.PlanesDataLoader;
import by.jwd.pravdivets.task6.karlssonairlines.dao.FileReader;
import by.jwd.pravdivets.task6.karlssonairlines.exception.DaoException;

public class FileDataLoader implements PlanesDataLoader{

	@Override
	public String loadData(String source) throws DaoException {
		if (source == null) {
			throw new DaoException("The source is not provided");
		}

		try {
			return FileReader.readFile(source);
		} catch (DaoException e) {
			throw new DaoException(e);
		}
	}

}

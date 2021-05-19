package by.jwd.pravdivets.task6.karlssonairlines.dao.impl;

import by.jwd.pravdivets.task6.karlssonairlines.dao.PlanesDataLoader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import by.jwd.pravdivets.task6.karlssonairlines.exception.DaoException;

public class FileDataLoader implements PlanesDataLoader {

	@SuppressWarnings("resource")
	@Override
	public String loadData(String source) throws DaoException {
		if (source == null) {
			throw new DaoException("The source was not provided");
		}
		
		File file = new File(source);

		StringBuilder builder = new StringBuilder();

		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			throw new DaoException("The data file not found", e);
		}

		while (scanner.hasNext()) {
			builder.append(scanner.nextLine());
		}

		String result = new String(builder);

		return result;
	}

}

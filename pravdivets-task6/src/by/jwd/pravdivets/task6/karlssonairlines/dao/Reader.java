package by.jwd.pravdivets.task6.karlssonairlines.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import by.jwd.pravdivets.task6.karlssonairlines.exception.DaoException;

public class Reader {

	@SuppressWarnings("resource")
	public static String readFile() throws DaoException  {

		File file = new File("./src/by/jwd/pravdivets/task6/karlssonairlines/dao/resources/planes.txt");

		StringBuilder builder = new StringBuilder();

		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			throw new DaoException("Data file not found", e);
		}

		while (scanner.hasNext()) {
			builder.append(scanner.nextLine());
		}

		String result = new String(builder);

		return result;

	}
}


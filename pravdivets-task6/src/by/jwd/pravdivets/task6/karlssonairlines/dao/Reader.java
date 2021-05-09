package by.jwd.pravdivets.task6.karlssonairlines.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {

	public static String readFile() throws FileNotFoundException {

		File file = new File("./src/by/jwd/pravdivets/task6/karlssonairlines/dao/resources/planes.txt");

		StringBuilder builder = new StringBuilder();

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(file);

		while (scanner.hasNext()) {
			builder.append(scanner.nextLine());
		}
		
		String result = new String(builder);
		
		return result;

	}
}


package ru.itis.info.app;

import ru.itis.info.utils.Informator;
import com.beust.jcommander.JCommander;

public class Program {
	public static void main(String[] args) {
		
		Arguments arguments = new Arguments();

		JCommander
				.newBuilder()
				.addObject(arguments)
				.build()
				.parse(args);

		Informator informator = new Informator();
		informator.getInfo(arguments.path);
	}
}
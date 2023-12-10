package main.ch8ex1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class Main {

	private static Logger logger = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {

		SpringApplication.run(Main.class, args);

		System.out.println();
		logger.info("Main application has started.");
		logger.info("Open a browser and access web pages stored in your resources file.");
	}

}

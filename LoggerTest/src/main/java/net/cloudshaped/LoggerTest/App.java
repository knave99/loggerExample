package net.cloudshaped.LoggerTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 * 
 */
public class App {
	
	static final Logger logger = LoggerFactory.getLogger(App.class);
	
	private String[] input;
	
	public App(String[] args) {
		logger.trace("Initializing this near pointless app.");
		input = args;
	}
	
	public String writeOut() {
		StringBuilder sb = new StringBuilder();
		for (String x : input) {
			logger.debug("appending " + x);
			sb.append(x + "\n");
		}
		return sb.toString();
	}
	
	
	
	public static void main(String[] args) {
		App a1 = new App(args);
		logger.info(a1.writeOut());
		logger.error("ending now!");
	}
}

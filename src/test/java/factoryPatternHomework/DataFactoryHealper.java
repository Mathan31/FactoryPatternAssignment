package factoryPatternHomework;

import java.util.logging.Logger;

public class DataFactoryHealper {
	public static final Logger logger = Logger.getLogger(DataFactoryHealper.class.getName());
	
	public static void openFile() {
		logger.info("Open the File...");
	}
	
	public static void closeFile() {
		logger.info("Close the File...");
	}

}

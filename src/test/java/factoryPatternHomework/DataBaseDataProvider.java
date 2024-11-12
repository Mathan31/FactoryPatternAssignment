package factoryPatternHomework;

import java.util.logging.Logger;

public class DataBaseDataProvider implements DataFactory{

	public static final Logger logger = Logger.getLogger(DataBaseDataProvider.class.getName());
	
	@Override
	public void readData() {
		logger.info("Reading Data from Database");
	}

}

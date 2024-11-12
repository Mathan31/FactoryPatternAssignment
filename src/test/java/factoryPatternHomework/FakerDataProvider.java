package factoryPatternHomework;

import java.util.logging.Logger;

public class FakerDataProvider implements DataFactory{

	public static final Logger logger = Logger.getLogger(FakerDataProvider.class.getName());
	
	@Override
	public void readData() {
		logger.info("Reading Data from Faker");
	}

}

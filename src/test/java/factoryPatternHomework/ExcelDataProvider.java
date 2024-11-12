package factoryPatternHomework;

import java.util.logging.Logger;

public class ExcelDataProvider implements DataFactory{

	public static final Logger logger = Logger.getLogger(ExcelDataProvider.class.getName());
	
	@Override
	public void readData() {
		logger.info("Reading Data from Excel");
	}

}

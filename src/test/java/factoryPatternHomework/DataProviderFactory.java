package factoryPatternHomework;

import java.util.logging.Logger;

public class DataProviderFactory {
	
	public static final Logger logger = Logger.getLogger(DataProviderFactory.class.getName());
	
	public static void readDataFromSource(DataType type) {
		DataFactoryHealper.openFile();
		switch (type) {
		case EXCEL:
			logger.info("Data source is Excel");
			new ExcelDataProvider().readData();
			break;

		case FAKER:
			logger.info("Data source is Faker Library");
			new FakerDataProvider().readData();
			break;
			
		case DATABASE:
			logger.info("Data source is Database");
			new DataBaseDataProvider().readData();
			break;
		default:
			throw new IllegalArgumentException("Provided Data Source is wrong....."+type);
		}
		DataFactoryHealper.closeFile();
	}

}

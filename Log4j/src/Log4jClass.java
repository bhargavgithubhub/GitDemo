

import org.apache.logging.log4j.*;
public class Log4jClass {

	
	 private static Logger logManager = LogManager.getLogger(Log4jClass.class.getName()); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	logManager.debug("Debugging");
	logManager.fatal("DADFDA");
	logManager.info("dafadf");
	logManager.error("ddsfdafda");
}
}

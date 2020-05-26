package NewDemo;

import org.apache.logging.log4j.*;


public class NewClasss {

	
	 private static Logger logManager = LogManager.getLogger(NewClasss.class.getName()); 
	 ////public Logger log = LogManager.getLogger(NewClasss.class.getName()); 
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	logManager.debug("Debugging");
	logManager.fatal("DADFDA");
	logManager.info("dafadf");
	logManager.error("ddsfdafda");
}
}

package com.javapractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	String message = "Hello World";
    	LOG.debug(message + "will be Printed On Debug");
    	LOG.info(message + "will be Printed On Info");
    	LOG.warn(message + "will be Printed On Warn");
    	LOG.error(message + "will be Printed On Error");
    	LOG.fatal(message + "will be Printed On Fatal");
    	LOG.info("Appending string: {}.", message);
    	System.out.println(message);
    }
}

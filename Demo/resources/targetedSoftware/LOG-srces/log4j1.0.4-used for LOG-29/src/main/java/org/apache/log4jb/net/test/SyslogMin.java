/*
 * Copyright (C) The Apache Software Foundation. All rights reserved.
 *
 * This software is published under the terms of the Apache Software
 * License version 1.1, a copy of which has been included with this
 * distribution in the LICENSE.APL file.  */


package org.apache.log4jb.net.test;

import java.io.IOException;

import org.apache.log4jb.Appender;
import org.apache.log4jb.Category;
import org.apache.log4jb.Layout;
import org.apache.log4jb.NDC;
import org.apache.log4jb.Priority;
import org.apache.log4jb.PropertyConfigurator;
import org.apache.log4jb.net.SocketAppender;


public class SyslogMin {
  
  static Category CAT = Category.getInstance(SyslogMin.class.getName());
				     
  public 
  static 
  void main(String argv[]) {

      if(argv.length == 1) {
	ProgramInit(argv[0]);
      }
      else {
	Usage("Wrong number of arguments.");
      }
      test("someHost");
  }

  
  static
  void Usage(String msg) {
    System.err.println(msg);
    System.err.println( "Usage: java " + SyslogMin.class + " configFile");
    System.exit(1);
  }

  
  static
  void ProgramInit(String configFile) {
    int port = 0;
    PropertyConfigurator.configure(configFile);
  }

  static
  void test(String host) {
    NDC.push(host);
    int i  = 0;
    CAT.debug( "Message " + i++);
    CAT.info( "Message " + i++);
    CAT.warn( "Message " + i++);
    CAT.error( "Message " + i++);
    CAT.log(Priority.FATAL, "Message " + i++);
    CAT.debug("Message " + i++,  new Exception("Just testing."));
  }
}

/*
 * Copyright (C) The Apache Software Foundation. All rights reserved.
 *
 * This software is published under the terms of the Apache Software
 * License version 1.1, a copy of which has been included with this
 * distribution in the LICENSE.APL file.  */

package org.apache.log4jb.or;

/**
   Implement this interface in order to Render objects as strings.

   @author Ceki G&uuml;lc&uuml;
   @since 1.0 */
public interface ObjectRenderer {

  /**
     Render the object passed as parameter as a String.
   */
  public
  String doRender(Object o);
}

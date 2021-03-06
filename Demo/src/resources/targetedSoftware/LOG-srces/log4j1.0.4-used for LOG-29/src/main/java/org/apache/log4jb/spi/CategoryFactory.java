/*
 * Copyright (C) The Apache Software Foundation. All rights reserved.
 *
 * This software is published under the terms of the Apache Software
 * License version 1.1, a copy of which has been included with this
 * distribution in the LICENSE.APL file.  */

import org.apache.log4jb.Category;

/**
   
  Implement this interface to create new instances of Category or
  a sub-class of Category.

  <p>See {@link org.apache.log4jb.examples.MyCategory} for an example.

  @author Ceki G&uuml;lc&uuml;
  @since version 0.8.5
   
 */
public interface CategoryFactory {

 
  public
  Category makeNewCategoryInstance(String name);

}

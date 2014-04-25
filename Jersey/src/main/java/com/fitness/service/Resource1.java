/*
 * Copyright 2000 - 2008 24 Hour Fitness. All rights reserved.
 */
package com.fitness.service;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 * Resource1 represents ...
 * 
 * @author <a href="mailto:hector.mendoza@24hourfit.com">hector.mendoza</a>
 * @version $Id$
 * @since Apr 24, 2014
 * 
 */
@Path ("jersey-hello")
public class Resource1
{
   /**
    * Represents getHello
    * 
    * @return
    * @since Apr 25, 2014
    * 
    * @todo complete description
    */
   @GET
   @Produces (MediaType.TEXT_PLAIN)
   public String getHello ()
   {
      return "Hello...";
   }
}

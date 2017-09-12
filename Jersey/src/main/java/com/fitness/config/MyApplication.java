package com.fitness.config;


import com.fitness.service.ClubResource;
import com.fitness.service.Resource1;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;


/**
 * MyApplication represents ...
 * 
 * @author hector.mendoza
 * @version $Id$
 * @since Apr 24, 2014
 * 
 */
public class MyApplication extends ResourceConfig
{
   /**
    * Register JAX-RS application components.
    */
   public MyApplication ()
   {
      register (Resource1.class);
      register (ClubResource.class);

      register (RequestContextFilter.class);
      register (JacksonFeature.class);
   }
}

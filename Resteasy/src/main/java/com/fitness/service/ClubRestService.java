/*
 * Copyright 2000 - 2008 24 Hour Fitness. All rights reserved.
 */
package com.fitness.service;


import com.fitness.dto.Club;
import com.fitness.provider.ClubDummyProvider;

import org.springframework.stereotype.Component;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 * ClubRestService represents ...
 * 
 * @author <a href="mailto:hector.mendoza@24hourfit.com">hector.mendoza</a>
 * @version $Id$
 * @since Apr 24, 2014
 * 
 */
@Component
@Path ("/Club")
public class ClubRestService
{
   // http://localhost:8989/Resteasy/rest/Club/list
   /**
    * Represents getClubs Need the Produces for parse the Obj to json
    * 
    * @return list
    * @since Apr 24, 2014
    * 
    */
   @GET
   @Path ("list")
   @Produces (MediaType.APPLICATION_JSON)
   public List <Club> getClubs ()
   {
      return ClubDummyProvider.instance ().getAllClubs ();
   }


   /**
    * Represents getRootPath
    * 
    * @return string
    * @since Apr 25, 2014
    * 
    */
   @GET
   @Path ("/")
   public String getRootPath ()
   {
      return "Is alive!!";
   }
}

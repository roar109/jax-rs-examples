package com.fitness.service;


import com.fitness.dto.Club;
import com.fitness.provider.ClubDummyProvider;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


/**
 * ClubResource represents ...
 * 
 * @author hector.mendoza
 * @version $Id$
 * @since Apr 25, 2014
 * 
 */
@Path ("Club")
public class ClubResource
{

   /**
    * Represents getClubList
    * 
    * @return list
    * @since Apr 25, 2014
    * 
    * @todo complete description
    */
   @GET
   @Path ("/list")
   public List <Club> getClubList ()
   {
      return ClubDummyProvider.instance ().getAllClubs ();
   }


   /**
    * Represents getRootText
    * 
    * @return string
    * @since Apr 25, 2014
    * 
    * @todo complete description
    */
   @GET
   @Path ("/")
   public String getRootText ()
   {
      return "IT works!";
   }
}

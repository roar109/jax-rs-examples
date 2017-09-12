package com.fitness.provider;


import com.fitness.dto.Club;

import java.util.ArrayList;
import java.util.List;


/**
 * ClubDummyProvider represents ...
 * 
 * @author hector.mendoza
 * @version $Id$
 * @since Apr 24, 2014
 * 
 */
public class ClubDummyProvider
{

   private static ClubDummyProvider instance = new ClubDummyProvider ();


   private ClubDummyProvider ()
   {
      // NOPMD
   }


   /**
    * Represents instance
    * 
    * @return instance
    * @since Apr 24, 2014
    * 
    * @todo complete description
    */
   public static ClubDummyProvider instance ()
   {
      return instance;
   }


   /**
    * Represents getAllClubs
    * 
    * @return
    * @since Apr 24, 2014
    * 
    * @todo complete description
    */
   public List <Club> getAllClubs ()
   {
      final List <Club> clubs = new ArrayList <Club> ();
      clubs.add (new Club ("Carlsbad", "00024"));
      clubs.add (new Club ("Hollywood", "00088"));
      clubs.add (new Club ("San Monica", "000184"));
      return clubs;
   }
}

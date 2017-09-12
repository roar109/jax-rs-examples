package com.fitness.service;


import com.fitness.dto.Club;
import com.fitness.provider.ClubDummyProvider;

import java.util.List;


/**
 * ClubManagerImpl represents ...
 * 
 * @author hector.mendoza
 * @version $Id$
 * @since Apr 25, 2014
 * 
 */
public class ClubManagerImpl implements ClubManager
{

   /**
    * Overrides fetchAllClubs
    * 
    * @return list
    * @since Apr 25, 2014
    * @see com.fitness.service.ClubManager#fetchAllClubs()
    */
   @Override
   public List <Club> fetchAllClubs ()
   {
      return ClubDummyProvider.instance ().getAllClubs ();
   }

}

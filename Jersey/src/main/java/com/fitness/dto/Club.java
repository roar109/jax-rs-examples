/*
 * Copyright 2000 - 2008 24 Hour Fitness. All rights reserved.
 */
package com.fitness.dto;




/**
 * Club represents ...
 * 
 * @author <a href="mailto:hector.mendoza@24hourfit.com">hector.mendoza</a>
 * @version $Id$
 * @since Apr 24, 2014
 * 
 */
public class Club
{
   private String name;
   private String clubNumber;


   /**
    * Constructs an instance of Club object.
    */
   public Club ()
   {
      // NOPMD
   }


   /**
    * Constructs an instance of Club object.
    * 
    * @param nameValue
    * @param number
    */
   public Club (final String nameValue, final String number)
   {
      this.name = nameValue;
      this.clubNumber = number;
   }


   /**
    * @return the name
    */
   public String getName ()
   {
      return name;
   }


   /**
    * @param nameValue the name to set
    */
   public void setName (final String nameValue)
   {
      this.name = nameValue;
   }


   /**
    * @return the clubNumber
    */
   public String getClubNumber ()
   {
      return clubNumber;
   }


   /**
    * @param clubNumberValue the clubNumber to set
    */
   public void setClubNumber (final String clubNumberValue)
   {
      this.clubNumber = clubNumberValue;
   }

}

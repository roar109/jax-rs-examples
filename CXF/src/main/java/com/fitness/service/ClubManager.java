package com.fitness.service;


import com.fitness.dto.Club;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Consumes ("application/json")
@Produces ("application/json")
public interface ClubManager
{

   @GET
   @Path ("/list")
   public List <Club> fetchAllClubs ();

}

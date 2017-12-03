package com.sonata.microprofile.sample.microprofilerestservice.rest;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Path;

@ApplicationScoped
@Path("/sangh")
public class HelloWorldEndpoint {
		
	@PersistenceContext(unitName = "microprofilepu")
	private EntityManager em;

	

}
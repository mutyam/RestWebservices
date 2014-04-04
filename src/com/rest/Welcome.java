/**
 * 
 */
package com.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


public class Welcome {
	
	@GET
	@Path("/api/welcome")
	public String sayHello(){
		return "<p> Welcome to REST Webservices Tutorial </p>";
	}
}

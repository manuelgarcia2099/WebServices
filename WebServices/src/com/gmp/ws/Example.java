package com.gmp.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("example")
public class Example {
	
	@GET
	@Path("prova")
	public String prova() {
		
		return "You win!";
	}

}

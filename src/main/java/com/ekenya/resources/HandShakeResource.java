package com.ekenya.resources;


import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import com.ekenya.resources.records.HandShake;

import io.smallrye.mutiny.Uni;
import io.vertx.mutiny.core.eventbus.Message;

@Path("/app/v1/")
public class HandShakeResource extends MyMainResource {

	
	

	@POST
	@Path("handshake")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Uni<HandShake> join(@Valid HandShake handshake) {
		
		return eventBus.<HandShake>request( HANDSHAKE_EVENT.get()  , handshake).onItem().transform(Message::body);
	}

}
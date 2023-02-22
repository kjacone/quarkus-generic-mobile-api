package com.ekenya.resources;

import java.util.concurrent.CompletionStage;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.vertx.core.json.Json;
import io.vertx.core.json.JsonObject;
import io.vertx.mutiny.core.eventbus.EventBus;
import io.vertx.mutiny.core.eventbus.Message;

@Path("/login")
public class LookupResource {
	
	@GET
	public String hello() {
		return "hello";
	}

//    @Inject
//    EventBus eventBus;
//
//    @POST
//    @Path("join")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public CompletionStage<User> join(@Valid User user) {
//        return  eventBus.<Json>send("join", JsonObject.mapFrom(user))
//                .thenApply(Message::body)
//                .thenApply(jsonObject -> jsonObject.mapTo(User.class));
//        
//     
//    }
//    
//    
//    
//
//    @PUT
//    @Path("leave")
//    @Consumes(MediaType.TEXT_HTML)
//    public CompletionStage<String> leave(@Email String username) {
//        return eventBus.<String>send("leave", username)
//                .thenApply(Message::body)
//                .exceptionally(Throwable::getMessage);
//    }
//
//    @POST
//    @Produces(MediaType.TEXT_HTML)
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Path("chat")
//    public CompletionStage<String> chat(@Valid ChatMessage message) {
//        return eventBus.<String>send("chat", JsonObject.mapFrom(message))
//                .thenApply(Message::body)
//                .exceptionally(Throwable::getMessage);
//    }

}
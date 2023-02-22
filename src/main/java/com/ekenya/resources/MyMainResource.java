package com.ekenya.resources;

import java.util.Optional;

import javax.inject.Inject;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import io.vertx.mutiny.core.eventbus.EventBus;


public class MyMainResource {
	
	@ConfigProperty(name = "event.handshake")
	public Optional<String> HANDSHAKE_EVENT; 
	
	@Inject
	EventBus eventBus;
	

}

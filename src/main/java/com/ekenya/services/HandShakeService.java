package com.ekenya.services;



import io.quarkus.vertx.ConsumeEvent;

import javax.enterprise.context.ApplicationScoped;


import com.ekenya.resources.records.HandShake;

@ApplicationScoped                          
public class HandShakeService  {
	

    
    
    @ConsumeEvent("events.ekenya.handshake")              
    public HandShake hello(HandShake name)  {  
    	


    	
    	
    	
    	
        return  name;             
    }
}

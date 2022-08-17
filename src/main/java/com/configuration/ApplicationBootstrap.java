package com.configuration;

import io.micronaut.context.event.*;
import io.micronaut.runtime.server.event.*;
import jakarta.inject.*;

@Singleton
public class ApplicationBootstrap implements ApplicationEventListener<ServerStartupEvent> {

    @Override
    public void onApplicationEvent(ServerStartupEvent event){
        System.out.println("Server Startup Event");
        System.out.println("Publish metrics...");
    }
}
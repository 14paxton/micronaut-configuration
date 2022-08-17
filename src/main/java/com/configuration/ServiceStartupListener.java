package com.configuration;

import io.micronaut.discovery.event.*;
import io.micronaut.runtime.event.annotation.*;
import jakarta.inject.*;

@Singleton
public class ServiceStartupListener {

    @EventListener
    void serviceStarted(ServiceReadyEvent serviceReady){
        System.out.println("Service is ready");
        System.out.println("All startup Event listeners...");
    }
}
package com.tracking;

import org.springframework.boot.builder.SpringApplicationBuilder;

public class TrackingAppServer extends TrackingApp {
    public static void main(String[] args) {
        new TrackingAppServer().configure(new SpringApplicationBuilder()).run(args);
    }
}

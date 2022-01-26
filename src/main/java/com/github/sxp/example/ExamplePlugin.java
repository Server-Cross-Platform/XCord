package com.github.sxp.example;

import com.github.sxp.java.api.startup.CrossPlatformPlugin;

public class ExamplePlugin extends CrossPlatformPlugin {
    @Override
    public void onStart() {
        System.out.println("Plugin started!");
    }

    @Override
    public void onStop() {
        System.out.println("Plugin stopped!");
    }
}

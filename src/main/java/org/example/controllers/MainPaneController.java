package org.example.controllers;

import org.example.config.MainConfiguration;

public class MainPaneController {
    public void startMainPane() {
        MainConfiguration mainConfiguration = new MainConfiguration();
        mainConfiguration.loadConfig();
    }
}

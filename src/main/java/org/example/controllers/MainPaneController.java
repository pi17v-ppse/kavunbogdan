package org.example.controllers;

import org.example.config.MainConfiguration;

/**
 * Класс контроллер главного окна
 *
 * Класс отвечает за все действия, происходящие в главном окне
 *
 * @author bogdan
 * @version 1.0.1
 * @copyright GNU Public License
 */
public class MainPaneController {

     /**
     * 
     * Метод, который отображает главное окно и создает все классы-слушатели
     *
     * @return void
     */
    public void startMainPane() {
        MainConfiguration mainConfiguration = new MainConfiguration();
        mainConfiguration.loadConfig();
    }

    /**
     * 
     * Метод, который закрывает главное окно и все потоки не демоны
     *
     * @return void
     */
    public void exitGame() {

    }
}

package org.example;

import org.example.controllers.MainPaneController;

/**
 * Главный класс приложения
 *
 * Класс запускает главное окно приложения
 *
 * @author bogdan
 * @version 1.0.1
 * @copyright GNU Public License
 * @todo Реализовать все методы
 */
public class Main {

    /**
     * 
     * Создается объект класса MainPaneController и вызывается метод,
     * который отображает главное окно приложения
     *
     * @param args аргументы приложения
     * @return void
     */
    public static void main(String[] args) {
        MainPaneController mainPaneController = new MainPaneController();
        mainPaneController.startMainPane();
    }
}

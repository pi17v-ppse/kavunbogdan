package org.example.items;

/**
 * Интерфейс объекта "Поле"
 *
 * Интерфейс содержит абстарктные методы, присущие всем классам типа "Поле"
 *
 * @author bogdan
 * @version 1.0.1
 * @copyright GNU Public License
 */
public interface Field {

    /**
     * 
     * Метод содержит события, которые происходят при открытии поля
     *
     * @return void
     */
    public void open();

    /**
     * 
     * Метод обновляет поле и приводит в начальное состояние
     *
     * @return void
     */
    public void refreshField();
}

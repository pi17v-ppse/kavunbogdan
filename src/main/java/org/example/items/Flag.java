package org.example.items;

/**
 * Класс объекта "Поле"
 *
 * Интерфейс содержит абстарктные методы, присущие всем классам типа "Поле"
 *
 * @author bogdan
 * @version 1.0.1
 * @copyright GNU Public License
 */
public class Flag {

    /**
     * Номер поля
     *
     * Номер поля, которое помечено флагом.
     * В данном поле, по мнению игрока, находится бомба
     *
     * @var int fieldNumber
     */
    private int fieldNumber;

    /**
     * 
     * Конструктор класса с аргументами
     *
     * @param fieldNumber номер поля
     */
    public Flag(int fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    /**
     * 
     * Метод getter, возврающий номер поля, на который поставлен флаг
     *
     * @return int
     */
    public int getFlag() {
        return fieldNumber;
    }
}

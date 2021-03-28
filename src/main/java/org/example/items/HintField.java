package org.example.items;

/**
 * Класс "Пустое поле"
 *
 * Класс реализует поведение поля, в котором содержится
 * подсказка (кол-во рядом находящихся бомб)
 *
 * @author bogdan
 * @version 1.0.1
 * @copyright GNU Public License
 */
public class HintField implements Field{

    /**
     * Кол-во бомб
     *
     * Кол-во рядом находящихся бомб
     * Может быть максимум 8(очень маленький шанс)
     * Чаще всего не превышает 4
     *
     * @var int bombCount
     */
    int bombCount;

    /**
     * 
     * Конструктор класса с аргументами
     *
     * @param bombCount кол-во бомб
     */
    public HintField(int bombCount) {
        this.bombCount = bombCount;
    }

    @Override
    public void open() {

    }

    @Override
    public void refreshField() {

    }
}

package main;

import main.kitchen.Chief;
import main.kitchen.GlobConst;
import main.view.View;

/**
 * Main class
 * Created by daniel.volkov on 13/11/16.
 * Шеф-повар. Определить иерархию овощей. Сделать салат.
 * Посчитать калорийность.
 * Провести сортировку овощей для салата на основе одного из параметров.
 * Найти овощи в салате, соответствующие заданному диапазону калорийности.
 * @author daniel.volkov
 */
public class Main {

    public static void main(String[] args) {
        View view = new View();
        Chief chief = new Chief(GlobConst.CHIEF_NAME,view);
        chief.cook();
    }
}

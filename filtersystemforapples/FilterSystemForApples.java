
package filtersystemforapples;

import filtersystemforapples.Apple;
import filtersystemforapples.SelectionCriteria;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterSystemForApples {

    
    public static void main(String[] args) {
        Apple apple1 = new Apple("red", 160);
        Apple apple2 = new Apple("green", 110);
        Apple apple3 = new Apple("green", 200);
        Apple apple4 = new Apple("green", 50);
        Apple apple5 = new Apple("red", 175);
        Apple apple6 = new Apple("red", 183);
        Apple apple7 = new Apple("red", 80);
        
        SelectionCriteria selectionCriteria = new SelectionCriteria();
        
        List<Apple> inventory = Arrays.asList(apple1, apple2, apple3, apple4, apple5, apple6, apple7);
        System.out.println(selectionCriteria.filterGreenApples(inventory));
        System.out.println(selectionCriteria.filterRedApples(inventory));
        System.out.println(selectionCriteria.filterAppleByWeight(inventory));
        System.out.println(selectionCriteria.filterApples(inventory, "red", 150));
    }
    
}

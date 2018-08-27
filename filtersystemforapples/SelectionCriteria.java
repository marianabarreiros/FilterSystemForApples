package filtersystemforapples;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class SelectionCriteria {
    
    public List<Apple> filterApples(List<Apple> apples){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : apples){
            if("green".equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }
}

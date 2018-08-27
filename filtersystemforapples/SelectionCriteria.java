package filtersystemforapples;

import java.util.ArrayList;
import java.util.List;


public class SelectionCriteria {
    //Primeiro exemplo
    public List<Apple> filterGreenApples(List<Apple> apples){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : apples){
            if("green".equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }
    //Segundo exemplo
    public List<Apple> filterRedApples(List<Apple> apples){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : apples){
            if("red".equals(apple.getColor()) || "green".equals(apple.getColor())){
                result.add(apple);
            }
        }             
        return result;
    }
    //Terceiro exemplo
    public List<Apple> filterAppleByWeight(List<Apple> apples){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : apples){
            if(apple.getWeight() > 150){
                result.add(apple);
            }
        }             
        return result;
    }
    //Quarto exemplo exemplo
    public List<Apple> filterApples(List<Apple> apples, String cor, int weight){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : apples){
            if(apple.getWeight() > weight && apple.getColor().equals(cor)){
                result.add(apple);
            }
        }             
        return result;
    }
      
      
    
}

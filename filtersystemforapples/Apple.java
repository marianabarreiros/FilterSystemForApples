/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filtersystemforapples;

/**
 *
 * @author aluno
 */
public class Apple {
    private String color;
    private int Weight;

    public Apple(String color, int Weight) {
        this.color = color;
        this.Weight = Weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return Weight;
    }
    
    public String toString(){
        return "Maçã "+this.getColor()+ " com peso "+this.getWeight();
    }
}

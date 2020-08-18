package factoryMethod.first.product;

import factoryMethod.first.component.Color;
import factoryMethod.first.component.Model;

public abstract class Notebook {
    int price;
    Color color;
    Model model;
    /*
    ........ и т д
    * */
    public String toString(){
        return "Model - "+ model.name()+ "; price - " + price +"; color - "+ color.name();
    }
}

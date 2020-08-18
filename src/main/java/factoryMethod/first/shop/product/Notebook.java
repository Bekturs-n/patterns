package factoryMethod.first.shop.product;

import factoryMethod.first.shop.component.Color;
import factoryMethod.first.shop.component.Model;

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

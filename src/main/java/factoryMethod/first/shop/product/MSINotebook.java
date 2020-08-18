package factoryMethod.first.shop.product;

import factoryMethod.first.shop.component.Color;
import factoryMethod.first.shop.component.Model;

public class MSINotebook extends Notebook{

    public MSINotebook(){
        price = 70000;
        model = Model.MSI;
        color = Color.BLACK;
    }
}

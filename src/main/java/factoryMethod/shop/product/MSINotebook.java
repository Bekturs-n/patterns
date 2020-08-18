package factoryMethod.shop.product;

import factoryMethod.shop.component.Color;
import factoryMethod.shop.component.Model;

public class MSINotebook extends Notebook{

    public MSINotebook(){
        price = 70000;
        model = Model.MSI;
        color = Color.BLACK;
    }
}

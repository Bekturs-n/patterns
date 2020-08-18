package factoryMethod.first.product;

import factoryMethod.first.component.Color;
import factoryMethod.first.component.Model;

public class MSINotebook extends Notebook{

    public MSINotebook(){
        price = 70000;
        model = Model.MSI;
        color = Color.BLACK;
    }
}

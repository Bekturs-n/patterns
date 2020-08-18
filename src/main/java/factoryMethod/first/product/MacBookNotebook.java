package factoryMethod.first.product;

import factoryMethod.first.component.Color;
import factoryMethod.first.component.Model;

public class MacBookNotebook extends Notebook {

    public MacBookNotebook() {
        price = 100000;
        model = Model.MacBook;
        color = Color.SPACE_GREY;
    }
}

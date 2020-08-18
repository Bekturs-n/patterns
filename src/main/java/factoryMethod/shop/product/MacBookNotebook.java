package factoryMethod.shop.product;

import factoryMethod.shop.component.Color;
import factoryMethod.shop.component.Model;

public class MacBookNotebook extends Notebook {

    public MacBookNotebook() {
        price = 100000;
        model = Model.MacBook;
        color = Color.SPACE_GREY;
    }
}

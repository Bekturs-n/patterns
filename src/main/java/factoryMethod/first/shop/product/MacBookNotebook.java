package factoryMethod.first.shop.product;

import factoryMethod.first.shop.component.Color;
import factoryMethod.first.shop.component.Model;

public class MacBookNotebook extends Notebook {

    public MacBookNotebook() {
        price = 100000;
        model = Model.MacBook;
        color = Color.SPACE_GREY;
    }
}

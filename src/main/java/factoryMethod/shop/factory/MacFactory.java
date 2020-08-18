package factoryMethod.shop.factory;

import factoryMethod.shop.product.MacBookNotebook;
import factoryMethod.shop.product.Notebook;

public class MacFactory extends NotebookFactory{
    @Override
    public Notebook creator() {
        return new MacBookNotebook();
    }
}

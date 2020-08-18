package factoryMethod.first.shop.factory;

import factoryMethod.first.shop.product.MacBookNotebook;
import factoryMethod.first.shop.product.Notebook;

public class MacFactory extends NotebookFactory{
    @Override
    public Notebook creator() {
        return new MacBookNotebook();
    }
}

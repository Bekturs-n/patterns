package factoryMethod.first.factory;

import factoryMethod.first.product.MacBookNotebook;
import factoryMethod.first.product.Notebook;

public class MacFactory extends NotebookFactory{
    @Override
    public Notebook creator() {
        return new MacBookNotebook();
    }
}

package factoryMethod.shop.factory;

import factoryMethod.shop.product.MSINotebook;
import factoryMethod.shop.product.Notebook;

public class MSIFactory extends NotebookFactory{
    @Override
    public Notebook creator() {
        return new MSINotebook();
    }
}

package factoryMethod.first.shop.factory;

import factoryMethod.first.shop.product.MSINotebook;
import factoryMethod.first.shop.product.Notebook;

public class MSIFactory extends NotebookFactory{
    @Override
    public Notebook creator() {
        return new MSINotebook();
    }
}

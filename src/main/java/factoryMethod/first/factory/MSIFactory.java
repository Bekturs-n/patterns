package factoryMethod.first.factory;

import factoryMethod.first.product.MSINotebook;
import factoryMethod.first.product.Notebook;

public class MSIFactory extends NotebookFactory{
    @Override
    public Notebook creator() {
        return new MSINotebook();
    }
}

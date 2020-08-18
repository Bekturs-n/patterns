package abstractFactory.firstExample.pack.factory;

import abstractFactory.firstExample.pack.type.BMWCoupe;
import abstractFactory.firstExample.pack.type.BMWSedan;
import abstractFactory.firstExample.pack.type.Coupe;
import abstractFactory.firstExample.pack.type.Sedan;

public class BMWFactory implements CarFactory {
    @Override
    public Sedan createSedan() {
        return new BMWSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new BMWCoupe();
    }
}

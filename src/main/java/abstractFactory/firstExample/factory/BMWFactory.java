package abstractFactory.firstExample.factory;

import abstractFactory.firstExample.type.BMWCoupe;
import abstractFactory.firstExample.type.BMWSedan;
import abstractFactory.firstExample.type.Coupe;
import abstractFactory.firstExample.type.Sedan;

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

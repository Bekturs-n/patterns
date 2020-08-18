package abstractFactory.pack.factory;

import abstractFactory.pack.type.BMWCoupe;
import abstractFactory.pack.type.BMWSedan;
import abstractFactory.pack.type.Coupe;
import abstractFactory.pack.type.Sedan;

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

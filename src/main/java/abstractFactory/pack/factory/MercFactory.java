package abstractFactory.pack.factory;

import abstractFactory.pack.type.Coupe;
import abstractFactory.pack.type.MercCoupe;
import abstractFactory.pack.type.MercSedan;
import abstractFactory.pack.type.Sedan;

public class MercFactory implements CarFactory {
    @Override
    public Sedan createSedan() {
        return new MercSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new MercCoupe();
    }
}

package abstractFactory.firstExample.pack.factory;

import abstractFactory.firstExample.pack.type.Coupe;
import abstractFactory.firstExample.pack.type.MercCoupe;
import abstractFactory.firstExample.pack.type.MercSedan;
import abstractFactory.firstExample.pack.type.Sedan;

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

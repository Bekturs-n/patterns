package abstractFactory.firstExample.factory;

import abstractFactory.firstExample.type.Coupe;
import abstractFactory.firstExample.type.MercCoupe;
import abstractFactory.firstExample.type.MercSedan;
import abstractFactory.firstExample.type.Sedan;

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

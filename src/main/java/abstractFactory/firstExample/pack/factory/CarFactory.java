package abstractFactory.firstExample.pack.factory;

import abstractFactory.firstExample.pack.type.Coupe;
import abstractFactory.firstExample.pack.type.Sedan;

public interface CarFactory {
    Sedan createSedan();
    Coupe createCoupe();
}

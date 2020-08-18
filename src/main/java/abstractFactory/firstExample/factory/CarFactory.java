package abstractFactory.firstExample.factory;

import abstractFactory.firstExample.type.Coupe;
import abstractFactory.firstExample.type.Sedan;

public interface CarFactory {
    Sedan createSedan();
    Coupe createCoupe();
}

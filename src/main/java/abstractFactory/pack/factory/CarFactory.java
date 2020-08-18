package abstractFactory.pack.factory;

import abstractFactory.pack.type.Coupe;
import abstractFactory.pack.type.Sedan;

public interface CarFactory {
    Sedan createSedan();
    Coupe createCoupe();
}

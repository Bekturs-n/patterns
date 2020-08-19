package factoryMethod.second.factory;

import factoryMethod.second.entity.Developer;
import factoryMethod.second.entity.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}

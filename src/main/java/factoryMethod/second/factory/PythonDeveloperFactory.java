package factoryMethod.second.factory;

import factoryMethod.second.entity.Developer;
import factoryMethod.second.entity.JavaDeveloper;
import factoryMethod.second.entity.PythonDeveloper;

public class PythonDeveloperFactory  implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}

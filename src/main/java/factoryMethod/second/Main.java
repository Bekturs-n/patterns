package factoryMethod.second;

import factoryMethod.second.entity.Developer;
import factoryMethod.second.factory.DeveloperFactory;
import factoryMethod.second.factory.JavaDeveloperFactory;
import factoryMethod.second.factory.PythonDeveloperFactory;

public class Main {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpeciality(String speciality){
        if (speciality.equals("java")){
            return new JavaDeveloperFactory();
        } else if (speciality.equals("python")){
            return new PythonDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " не найдена. Специалист не создан.");
        }
    }
}
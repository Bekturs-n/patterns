package factoryMethod.second;

import factoryMethod.second.entity.Developer;
import factoryMethod.second.factory.DeveloperFactory;
import factoryMethod.second.factory.JavaDeveloperFactory;
import factoryMethod.second.factory.PythonDeveloperFactory;

/**
 * Шаблон: Фабрика (Factory Method)
 * =======================================================================================================
 * Цель:
 *
 * Создание интерфейса, который создаёт объект. При этом, выбор того, экземпляр какого класса создавать
 * остаётся за классами, которые имплементируют данный интерфейс.
 * =======================================================================================================
 *
 * Для чего используется:
 *
 * Для делигирования создания экземпляров, другому классу.
 *
 * =======================================================================================================
 * Пример использования:
 *
 * - заранее неизвестно, экземпляры, какого класса нужно будет создавать;
 * - класс спроектирован таким образом, что создаваемые им объекты имеют свойства определённого класса.
 *
 * =======================================================================================================
 * **/

public class Main {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpeciality(String speciality) {
        if (speciality.equals("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equals("python")) {
            return new PythonDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " не найдена. Специалист не создан.");
        }
    }
}
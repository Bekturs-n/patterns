package prototype.second;

import prototype.second.entity.Project;
import prototype.second.factory.ProjectFactory;
/**
 * Шаблон: Прототип (Prototype)
 * Цель:
 * Определить вид создаваем объектов с помощью экземпляра - прототипа и создавать новые объекты,
 * копируя этот прототип.
 *
 * Для чего используется:
 * Для создания копий заданного объекта.
 *
 * Пример использования:
 * -	классы, экземпляры которых необходимо создать определяются во время вьлолнения программы;
 * -	для избежания построения иерархии классов, фабрик или параллельных иерархий классов;
 * -	экземпляры класса могут находиться в одном из немногих возможных состояний.
 *
 * Пример, создание копии проекта, например для локального репозитория.
 *
 * p.s. Прямой реализацией шаблона Прототип является реализация интерфейса Cloneable
 */
public class VersionControlRunner {
    public static void main(String[] args) {

        /** Создаём наш пользовательский проект **/
        Project myProject = new Project(1, "Our project", "System.out.print('Hello World')");

        System.out.println(myProject);

        /** Создаём фабрику и передаём наш проект для последующего копирования **/
        ProjectFactory projectFactory = new ProjectFactory(myProject);
        /** Копируем проект **/
        Project myProjectClone = projectFactory.cloneProject();

        /**Мы получаем копию нашего проекта, например для копирования в локальный репозиторий. И мы можем работать над
         * копией не затрагивая оригенал**/
        System.out.println(myProjectClone);

    }
}

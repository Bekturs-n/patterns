package abstractFactory.firstExample;

import abstractFactory.firstExample.factory.BMWFactory;
import abstractFactory.firstExample.factory.CarFactory;
import abstractFactory.firstExample.factory.MercFactory;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.IOException;

/***
 *      Абстрактная фабрика — это порождающий паттерн проектирования,
 *      который позволяет создавать семейства связанных объектов,
 *      не привязываясь к конкретным классам создаваемых объектов.
 *
 *      Подробнее:
 *      https://refactoring.guru/ru/design-patterns/abstract-factory
 *      https://habr.com/ru/post/465835/
 *
 *      Java-example:
 *      https://refactoring.guru/ru/design-patterns/abstract-factory/java/example
 */

public class Main {
    public static void main(String[] args) {
        CarFactory factory = new MercFactory();
//        CarFactory factory = new BMWFactory();
        System.out.println(factory.createCoupe());
    }
}

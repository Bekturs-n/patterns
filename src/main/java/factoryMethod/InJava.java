package factoryMethod;

import java.util.Calendar;

/**
 * Паттерн широко используется в стандартных библиотеках Java:
 * <p>
 * java.util.Calendar#getInstance()
 * java.util.ResourceBundle#getBundle()
 * java.text.NumberFormat#getInstance()
 * java.nio.charset.Charset#forName()
 * java.net.URLStreamHandlerFactory#createURLStreamHandler(String) (Возвращает разные объекты-одиночки,
 * в зависимости от протокола)
 * <p>
 * java.util.EnumSet#of()
 * javax.xml.bind.JAXBContext#createMarshaller() и другие похожие методы.
 * <p>
 * Признаки применения паттерна: Фабричный метод можно определить по создающим методам,
 * которые возвращают объекты продуктов через абстрактные типы или интерфейсы.
 * Это позволяет переопределять типы создаваемых продуктов в подклассах.
 */

public class InJava {
    public static void main(String[] args) {
    }
}

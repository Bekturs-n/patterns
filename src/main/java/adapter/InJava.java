package adapter;

import java.util.Arrays;
import java.util.List;

/**
 * Примеры Адаптеров в стандартных библиотеках Java:
 * <p>
 * java.util.Arrays#asList()
 * java.util.Collections#list()
 * java.util.Collections#enumeration()
 * java.io.InputStreamReader(InputStream) (возвращает объект Reader)
 * java.io.OutputStreamWriter(OutputStream) (возвращает объект Writer)
 * javax.xml.bind.annotation.adapters.XmlAdapter#marshal() и #unmarshal()
 */

public class InJava {
    public static void main(String[] args) {
        Integer[] i = new Integer[]{1, 2, 3, 4, 5, 6};
        List<Integer> list = Arrays.asList(i);
        System.out.println(i[1]);
        System.out.println(list.get(1));
    }
}

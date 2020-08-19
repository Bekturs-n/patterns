package builder;
/**
 * Паттерн широко используется в стандартных библиотеках Java:
 *
 * java.lang.StringBuilder#append() (unsynchronized)
 * java.lang.StringBuffer#append() (synchronized)
 * java.nio.ByteBuffer#put() (также в CharBuffer, ShortBuffer, IntBuffer, LongBuffer, FloatBuffer и DoubleBuffer)
 * javax.swing.GroupLayout.Group#addComponent()
 * Все реализации java.lang.Appendable
 */
public class InJava {
    public static void main(String[] args) {
        StringBuilder sB = new StringBuilder().append("This ").append("is ").append("builder!");
        System.out.println(sB);
    }
}

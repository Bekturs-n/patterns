package singleton.first;

public class Singleton {
    private Long id;

    private static Singleton instance;
    private static volatile Singleton instance1;

    private Singleton(){
    }

    /*
    * ленивый
    * Synchronized Accessor
    * */
//    public static synchronized Singleton getInstance(){
//        if (instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//    }

    /*
     * ленивый
     * Double-checked locking синглтон
     * */
    /***
     * 2.1 Почему не работает без volatile?
     *
     * Проблема идиомы Double Checked Lock заключается в модели памяти Java, точнее в порядке создания объектов.
     * Можно условно представить этот порядок следующими этапами [2, 3]:
     *
     * Пусть мы создаем нового студента: Student s = new Student(), тогда
     *
     * 1) local_ptr = malloc(sizeof(Student)) // выделение памяти под сам объект;
     * 2) s = local_ptr // инициализация указателя;
     * 3) Student::ctor(s); // конструирование объекта (инициализация полей);
     *
     * Таким образом, между вторым и третьим этапом возможна ситуация, при которой другой поток может получить и начать
     * использовать (на основании условия, что указатель не нулевой) не полностью сконструированный объект. На самом
     * деле, эта проблема была частично решена в JDK 1.5 [5], однако авторы JSR-133 [5] рекомендуют использовать
     * volatile для Double Cheсked Lock. Более того, их отношение к подобным вещам легко прослеживается из комментария
     * к спецификации:
     *
     * There exist a number of common but dubious coding idioms, such as the double-checked locking idiom, that are
     * proposed to allow threads to communicate without synchronization. Almost all such idioms are invalid under the
     * existing semantics, and are expected to remain invalid under the proposed semantics.
     *
     * Таким образом, хотя проблема и решена, использовать Double Checked Lock без volatile крайне опасно. В некоторых
     * случаях, зависящих от реализации JVM, операционной среды, планировщика и т.д., такой подход может не работать.
     * Однако, серией опытов сопровождаемых просмотром ассемблерного кода, генерированного JIT’ом автору, такой случай
     * вопросизвести не удалось.
     *
     * Наконец, Double Checked Lock можно использовать без исключений с immutable объектами
     * (String, Integer, Float, и т.д.).
     */
    public static Singleton getInstance1(){
        if(instance1 == null){
            synchronized (Singleton.class){
                if(instance1 == null){
                    instance1 = new Singleton();
                }
            }
        }
        return instance1;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

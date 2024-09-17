/**
 * Класс числа, добавляемого пользователем.
 */
public class Number {

    /**
     * Значение заданного пользователем числа.
     */
    private int _value;

    /**
     * Флаг, указывающий, является ли число простым.
     */
    private boolean _isSimple;

    /**
     * Массив введенных пользователем чисел.
     */
    public static  Number[] ArrayNumbers;

    /**
     * Размера массива с числами.
     */
    public static int ArraySize = 0;

    /**
     * Конструктор по умолчанию.
     * Создает новый объект класса, устанавливая поля в значения по умолчанию.
     */
    public Number(){
        _value = 0;
        _isSimple = true;
    }

    /**
     * Конструктор с параметром.
     * Создает новый объект класса, присваивая полю _value значение, переданное в конструктор, и проверяя число на
     * простоту.
     *
     * @param value - целое число, значение которого присваивается полю _value.
     */
    public Number(int value){
        _value = value;
        _isSimple = true;
        for (int i = 2;i<=Math.sqrt(_value);i++){
            if (_value % i == 0){
                _isSimple = false;
                break;
            }
        }
    }

    /**
     * Устанавливает размер массива, если он еще не был задан.
     * Инициализирует массив объектов {@code Number}.
     *
     * @param size - количество элементов в массиве.
     * @return {@code true}, если массив успешно инициализирован
     *         {@code false}, если не удается инициализировать массив (переопределение размера).
     */
    public static boolean SetSize(int size){
        ArraySize = size;
        if (ArraySize <= 0) {
            return false;
        }else{
            ArrayNumbers = new Number[ArraySize];
            return true;
        }
    }

    /**
     * Возвращает значение поля _value.
     *
     * @return значение поля {@code _value}
     */
    public int GetValue(){
        return _value;
    }

    /**
     * Возвращает значение поля _isSimple.
     *
     * @return значение поля {@code _isSimple}
     */
    public boolean GetSimple(){
        return _isSimple;
    }
}

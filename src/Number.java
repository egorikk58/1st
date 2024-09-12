public class Number {
    private int _value;
    private boolean _isSimple;
    public static  Number[] ArrayNumbers;
    public static int ArraySize = 0;

    public Number(){
        _value = 0;
        _isSimple = true;
    }
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
    public static boolean SetSize(int size){
        if (ArraySize == 0){
            ArraySize = size;
            ArrayNumbers = new Number[ArraySize];
            return true;
        }else{
            return false;
        }
    }
    public int GetValue(){
        return _value;
    }
    public boolean GetSimple(){
        return _isSimple;
    }
}

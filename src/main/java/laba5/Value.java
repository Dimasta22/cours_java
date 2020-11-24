package laba5;

public enum Value {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;

    public static Value getValues(int index){
        Value[] values = Value.values();
        return values[index];
    }

    public static int getValueLength(){
        return Value.values().length;
    }
}

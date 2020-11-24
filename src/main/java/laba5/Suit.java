package laba5;

public enum Suit {
    HEART, DIAMOND, CLUB, SPADE;

    public static Suit getSuits(int index){
        Suit[] suits = Suit.values();
        return suits[index];
    }

    public static int getSuitLength(){
        return Suit.values().length;
    }
}

package study.Clothing;

/**
 * Created by ikocos on 11/02/2017.
 */
public enum SeasonName {
    SPRING("봄"),SUMMER("여름"), FALL("가을"), WINTER("겨울");
    final private String value;
    SeasonName(String value) {
        this.value = value;
    }
    public String getValue(){
        return  this.value;
    }
}

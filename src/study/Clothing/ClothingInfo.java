package study.Clothing;

/**
 * Created by ikocos on 11/02/2017.
 */
public class ClothingInfo {
    public String code, name, material;
    public enum Season{
        SPRING,SUMMER,FALL,WINTER
    };
    static final int SPRING = 1;
    static final int SUMMER = 2;
    static final int FALL = 3;
    static final int WINTER = 4;
    public Season season;

    public ClothingInfo(String code, String name, String material, Season season) {
        this.code = code;
        this.name = name;
        this.material = material;
        this.season = season;

    }
}

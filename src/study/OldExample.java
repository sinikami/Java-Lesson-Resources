package study;

import study.Clothing.ClothingInfo;
import study.Clothing.Season;
import study.Clothing.SeasonName;

/**
 * Created by ikocos on 11/02/2017.
 */
public class OldExample {
    public static void main(String[] args){
        ClothingInfo clothingInfo =new ClothingInfo("2222","hahaha","sssgggg", ClothingInfo.Season.SUMMER);
        System.out.println("code:" + clothingInfo.code);
        System.out.println("name:" + clothingInfo.name);
        System.out.println("material:" + clothingInfo.material);
        System.out.println("season:" + clothingInfo.season);
       Season season[]=Season.values();

        for (Season val : season){
            System.out.println(val);
        }
        printSeason("SUMMER");
        printSeason(SeasonName.FALL);
    }
    static void printSeason(String name){
        Season season = Season.valueOf(name);


        System.out.println(season);
    }
    static void printSeason(SeasonName season){
        System.out.println(season.getValue());
    }
}

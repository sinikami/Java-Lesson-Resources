package homework;

/**
 * CDInfo 클래스를 이용해서 다음의 클래스(음악 CD 클래스)를 선언하십시오.
 *
 * [이름]  CD 클래스
 * [데이터]
 * 관리번호
 * 타이틀
 *
 * [이름] 음악 CD 클래스
 * [데이터]
 * 관리번호
 * 타이틀
 * 아티스트
 * 곡명[]
 */
public class homework_03_06 extends CDInfo {//음악 CD 클래스

    String artist;
    String[] nameOfSongs;

    homework_03_06(String registerNo, String title) {
        super(registerNo, title);
    }

    homework_03_06(String registerNo, String title, String artist, String[] nameOfSongs) {
        super(registerNo, title);
        this.artist = artist;
        this.nameOfSongs = nameOfSongs;


    }
}

class CDInfo {//CD 클래스
    String registerNo;
    String title;

    CDInfo(String registerNo, String title) {
        this.registerNo = registerNo;
        this.title = title;
    }
}

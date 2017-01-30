package homework;


/*
* 일련번호에 해당하는 seqNo필드의 값을 생성자 파라미터로 받은 것이 아니라, 새로운 객체가 생성될때마다 자동으로 붙여지게 하려고 합니다
*
* */
public class homework_03_04 {
    //int seqNo;// origin
    static int seqNo=0;
    String writer;
    String writtenDate;
    String title;
    String content;

    //homework_03_04(int seqNo,String writer,String writtenDate,String title, String content){// origin
    homework_03_04(String writer,String writtenDate,String title, String content){
        //this.seqNo=seqNo; //origin
        this.seqNo++;
        this.writer=writer;
        this.writtenDate=writtenDate;
        this.title=title;
        this.content=content;

    }
}

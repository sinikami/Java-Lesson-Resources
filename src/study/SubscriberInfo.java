package study;

/**
 * Created by ikocos on 14/01/2017.
 */
public class SubscriberInfo {
    String name,id,password;
    String phoneNo,address;
    SubscriberInfo(){}//no arg constructor
    SubscriberInfo(String name,String id, String password){
        this.name =name;
        this.id =id;
        this.password = password;

    }
    SubscriberInfo(String name,String id, String password,String phoneNo,String address){
        this(name,id,password);
        this.phoneNo = phoneNo;
        this.address = address;


    }
    void changePassword(String password){
        this.password=password;
    }
    void setPhoneNo(String phoneNo){
        this.phoneNo =phoneNo;
    }
    void setAddress(String address){
        this.address=address;
    }

    @Override
    public String toString() {
        return "SubscriberInfo{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

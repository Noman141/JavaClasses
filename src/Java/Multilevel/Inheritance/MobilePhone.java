package Java.Multilevel.Inheritance;

public class MobilePhone {
    public String name;
    public String model;
    public int price;
    public String type;

    public MobilePhone(){

    }
    public void MakeCall(){
        System.out.println(name+"Call quality is very good");
    }

    public void PlayAudio(){
        System.out.println(name+"Play audio");
    }
}

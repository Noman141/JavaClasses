package Assignment3;

public class NestedIfStatement {
    public static void main(String[] args) {
        int num = 22;
        if(num <= 12){
            System.out.println("Good Morning");
            if(num > 18){
                System.out.println("Good noon");
            }
        }else{
            System.out.println("Good evening");
        }
    }
}

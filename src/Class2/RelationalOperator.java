package Class2;

public class RelationalOperator {
    static void myNum(){
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }
    }
   static void myRuls(){
        int x=10;
        int y=20;
        System.out.println(x==y);
       System.out.println(x<y);
       System.out.println(x>y);
       System.out.println(x>=y);
       System.out.println(x<=y);
       System.out.println(x!=y);
   }

    public static void main(String[] args) {
        myNum();
        myRuls();
    }
}

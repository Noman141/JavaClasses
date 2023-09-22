package Java.Naming.Convention;

public interface Drawable {
    void draw();
    class Rectangle implements Drawable{
        public void draw(){
            System.out.println("drawing rectangle");
        }
    }

    class Tringle implements Drawable{
        public void draw(){
            System.out.println("drawing tringle");
        }
    }
    class Circle implements Drawable{
        public void draw(){
            System.out.println("drawing circle");
        }
    }

    public static void main(String[] args) {
        Drawable d=new Circle();
        Drawable r=new Rectangle();
        Drawable t=new Tringle();
        d.draw();
        r.draw();
        t.draw();
    }
}

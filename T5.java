class Shapes{
    public void draw(){
        System.out.println("Drawing a Shape");
    }
    public void erase(){
        System.out.println("Erasing a Shape");
    }
}
class Circle1 extends Shapes{
    public void draw(){
        System.out.println("Drawing a Circle");
    }
    public void erase(){
        System.out.println("Erasing a Circle");
    }
}
class Square1 extends Shapes{
    public void draw(){
        System.out.println("Drawing a Square");
    }
    public void erase(){
        System.out.println("Erasing a Square");
    }
}
class Triangle1 extends Shapes{
    public void draw(){
        System.out.println("Drawing a Triangle");
    }
    public void erase(){
        System.out.println("Erasing a Triangle");
    }
}
public class T5 {
    public static void main(String[] args) {
        Shapes[] s1=new Shapes[3];
        s1[0]=new Circle1();
        s1[1]=new Square1();
        s1[2]=new Triangle1();
        for(int i=0;i<s1.length;i++){
            s1[i].draw();
            s1[i].erase();
            System.out.println("----------------");
        }
    }
}

interface resizeable{
    void resizeWidth(int width);
    void resizeHieght(int hieght);
}
class Rectangle1 implements resizeable{
    private int width;
    private int hieght;
    public Rectangle1(int width,int hieght){
        this.width=width;
        this.hieght=hieght;
    }
    public void resizeWidth(int width){
        this.width=width;
    }
    public void resizeHieght(int hieght){
        this.hieght=hieght;
    }
    public void display(){
        System.out.println("Rectangle Width:"+width);
        System.out.println("Rectangle hieght:"+hieght);
    }
}
public class T7 {
    public static void main(String[] args) {
        Rectangle1 r2=new Rectangle1(3 ,4);
        System.out.println("\n Original size Recatngle:");
        r2.display();
        r2.resizeWidth(4);
        r2.resizeHieght(5);
        System.out.println("\n Resized sized rectangle:");
        r2.display();
    }
}

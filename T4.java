class Mpoint1{
    private int x;
    private int y;
    public Mpoint1(){
        this.x=0;
        this.y=0;
    }
    public void Mpoint1(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int[] getXY(){
        int[] points={x,y};
        return points;
    }
    public double distance(int x,int y){
        int xDiff=this.x-x;
        int yDiff=this.y-y;
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }
    public double distance(){
        return Math.sqrt(x*x+y*y);
    }
}
public class T4 {
    public static void main(String[] args) {
        Mpoint1 point1=new Mpoint1();
        Mpoint1 point2=new Mpoint1();
        point1.setXY(1,2);
        int[] points=point1.getXY();
        System.out.print("point1 coordinates are");
        System.out.print(points[0]+points[1]+"\n");
        System.out.println(point1.distance(5,6));
        System.out.println(point1.distance());
    }
}

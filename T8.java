class Outr1{
    void displayMessage1() {
        System.out.println("Hii This JAVA program");
    }
        static class Innr1{
            void displayMessage1(){
                System.out.println("Hii This is Nested Class");
            }
        }
    }
public class T8 {
    public static void main(String[] args) {
        Outr1 O1=new Outr1();
        O1.displayMessage1();
        Outr1.Innr1 I1=new Outr1.Innr1();
        I1.displayMessage1();
    }
}

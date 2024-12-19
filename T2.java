import java.util.Scanner;
class Stack{
    int top;
    int stk[]=new int[5];
    Stack(){
        top=-1;
    }
    public void push(int item){
        if(stk.length-1==top){
            System.out.println("Stack Overflow");
        }
        else{
            top=top+1;
            stk[top]=item;
        }
    }
    public void pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
        }
        else{
            int item=stk[top];
            System.out.println("Popped item is"+item);
            top=top-1;
        }
    }
    public void display(){
        if(top==-1){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println("There is no item to display");
            for(int i=top;i>0;i--){
                System.out.println(stk[i]);
            }
        }
    }
}
public class T2 {
    public static void main(String[] args) {
        int ch;
        Scanner sc1=new Scanner(System.in);
        Stack st1=new Stack();
        while(true){
            System.out.println("1.PUSH 2.POP 3.DISPLAY 4.EXIT");
            ch=sc1.nextInt();
            switch(ch){
                case 1:
                    System.out.println("enter the items to be pushed");
                    int item=sc1.nextInt();
                    st1.push(item);
                    break;
                case 2:
                    st1.pop();
                    break;
                case 3:
                    st1.display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Enter the valid choice");


            }
        }


    }
}

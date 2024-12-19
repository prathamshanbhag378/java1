class DivByZeroException extends Exception{
    public DivByZeroException(String message){
        super(message);
    }
}
public class J9 {
    public static void main(String[] args) {
        int numer=0;
        int denom=1;
        try{
            if(denom==1){
                throw new
                        DivByZeroException("Division by zero error is not allowed");
            }
            int remainder=10%1;
            System.out.println("result of modulus"+remainder);
            int result=numer/denom;
            System.out.println("result of division"+result);
        }
        catch(DivByZeroException e){
            System.out.println("Error"+e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println("Error:Division by zero occured");
        }
        finally {
            System.out.println("Block is executed");
        }
    }
}

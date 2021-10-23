package Experiment2;

class NonNum extends Exception{
    NonNum(){
        super("Operand is Non-Numeric\n");
    }
}

public class NonNumException {
    public static void main(String[] args) {
        try{
            int a = 4;
            char b = 'r';
            if (b >= 0 && b <= 9){
                System.out.println("" + b + " % " + a + " = " + (b%a));
            }
            else {
                throw new NonNum();
            }
        }catch(NumberFormatException e){System.out.println(e);}
        catch(NonNum e){ System.out.println(e);}
    }
}

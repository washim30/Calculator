package Calculator;

public class Calculator {
    public static void main(String[] args) {
        Summation sm = new Summation();
        Subtraction sb  = new Subtraction();
        Multiplication mp = new Multiplication();
        Divission ds = new Divission();

        int add = sm.sum(1,2);
        System.out.println(add);

        int subt = sb.sub(4,3);
        System.out.println(subt);

        int multi = mp.mul(3,5);
        System.out.println(multi);

        double divission = ds.div(6,0);
        System.out.println(divission);

    }
}

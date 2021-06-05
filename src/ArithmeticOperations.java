public class ArithmeticOperations {
    public static void main(String[] args) {
        //System.out.println(args[0]+" "+args[1]);
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int ans = num1+num2;
        System.out.println("Sum = "+ans);
        int ans1 = num2 - num1;
        System.out.println("Difference = "+ans1);
        int ans2 = num1*num2;
        System.out.println("Product = "+ans2);
        double ans3 = num2/num1;
        System.out.println("Dividened = "+ans3);
    }
}

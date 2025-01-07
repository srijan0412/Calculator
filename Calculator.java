import java.util.Scanner;

class Calculator {
    public int add(int op1, int op2) {
        return op1 + op2;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int Input1, Input2;
        String Op;
        System.out.println("Enter First Operant");
        Input1 = sc.nextInt();
        System.out.println("Enter Second Operant");
        Input2 = sc.nextInt();
        System.out.println("Enter Operant - ");
        Op = sc.nextLine();

        if (Op == "add"){
            System.out.println(add(Input1, Input2));
            return;
        }
        

    }
}
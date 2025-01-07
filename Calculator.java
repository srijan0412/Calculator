import java.util.Scanner;

class Calculator {
    public int add(int op1, int op2) {
        return op1 + op2;
    }
    public int sub(int op1, int op2){
        return op1 - op2;
    }
    public int mul(int op1, int op2){
        return op1*op2;
    }
    public int div(int op1, int op2){
        if (op2 == 0){
            return -1;
        }
        return op1/op2;
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
        else if (Op == "sub"){
            System.out.println(sub(Input1, Input2));
            return;
        }
        else if (Op == "div"){
            System.out.println(div(Input1, Input2));
            return;
        }
        else if (Op == "mul"){
            System.out.println(mul(Input1, Input2));
            return;
        }

    }
}
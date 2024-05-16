import java.util.Scanner;
class Test{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number between(1-5)");
        int n=sc.nextInt();

        Test.Word(n);
    }
    static void Word(int ch){

       switch(ch){
        case :1
            System.out.println("One");
        break;
        case :2
            System.out.println("Two");
        break;
        case 3:
            System.out.println("Three");
        break;    
        case : 4
            System.out.println("Four");
        break;    
        case : 5
            System.out.println("Five");
        break;    
       }
    }
}
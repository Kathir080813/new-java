import java.util.Scanner;
class user{
    public static void main(String args[])
    { 
        Scanner add = new Scanner(System.in);
        int a = add.nextInt();
        int b = add.nextInt();
        int c = add.nextInt();
        int d = a*b*c;
        int e = a+b+c;
        System.out.println(d);
        System.out.println(e);
        System.out.println(d/e);
        
    }
   

}
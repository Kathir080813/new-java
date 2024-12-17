import java .util.Scanner;
class Kathir{
    public static void main(String args[])
    {
        Scanner name = new Scanner(System.in);
        String a = name.nextLine();
        int b = name.nextInt();
        name.nextLine();
        String c = name.nextLine(); 
        System.out.println("my name is "+a);
        System.out.println("age is " +b);
        System.out.println("address: "+c);        
    }
}
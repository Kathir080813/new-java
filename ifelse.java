import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) 
    {
        Scanner value = new Scanner(System.in);
        String num1 = value.nextLine();
        String num2 = value.nextLine();
        if (num1==num2)
        {
            System.out.println("it is equal");
        }
        else{
            System.out.println("it is not equal");
        }

        }

    }

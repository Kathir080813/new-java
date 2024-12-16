import java.util.Scanner;
class user2 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        String name = data.nextLine();
        int score = data.nextInt();
        data.nextLine();
        String department = data.nextLine();
        System.out.println("my name is "+name);
        System.out.println("my score is "+score/10);
        System.out.println("my department is "+department);
    }
    
}

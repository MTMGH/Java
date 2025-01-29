import java.util.Scanner;

class q1{
    public static void main(String args[])
    {
        Scanner var= new Scanner(System.in);
        String Name = var.nextLine();
        int age = var.nextInt(); 
        System.out.println("Name is "+Name);
        System.out.println("Age:"+age);
    }
}
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String fullname;
    int age;
    
    System.out.println("Please enter your Full Name.");
    fullname = input.nextLine();

    System.out.println(fullname + "" + " How old are you?");
    age = input.nextInt();
    System.out.println("In five years your going be " + (age+5) + " years old wow!"); //so old!
    input.close(); //closes it 
  }
}
import java.util.Scanner;

public class FoodMenu {
    public static void main(String[] args){
        System.out.println("-----Menu-----");
        System.out.println("1 : Spaghetti");
        System.out.println("2 : Green curry");
        System.out.println("3 : Hamburger");
        System.out.println("4 : Pizza");
        System.out.println("5 : Sushi");
        System.out.println("--------------");
        
        Scanner sc = new Scanner(System.in);
        System.out.print(">>Please enter number for select menu : ");
        int x = sc.nextInt();
        sc.close();

        System.out.println("You select : " + x);
        switch (x) {
            case 1 -> System.out.println("Spaghetti");
            case 2 -> System.out.println("Green curry");
            case 3 -> System.out.println("Hamburger");
            case 4 -> System.out.println("Pizza");
            case 5 -> System.out.println("Sushi");
            default -> System.out.println("Error");
        }
    }
}
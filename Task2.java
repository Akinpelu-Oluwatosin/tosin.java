import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

       
        System.out.print("ENTER A PET ");
        String pet = input.nextLine(); 

        if (pet == "dog") {
            
System.out.println("Woof! Dogs are awesome!");
} 
else {
 System.out.println("Cool choice, but I love dogs!");
        }
}
}
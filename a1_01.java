import java.util.Scanner;
public class a1_01 {
     public static void main(String[] args) {
        
        System.out.println("Please enter your first name");
        Scanner input = new Scanner(System.in);
        String firstname = input.nextLine();
        input.close();
        System.out.println("Please enter your last name");
        String lastname = input.nextLine();
        firstname = firstname.substring(0,3);
        lastname = lastname.substring(0,4);
        System.out.println("your e-mail address is:  "+firstname+'.'+lastname+"@gmail.com");
    }
    
}

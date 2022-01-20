public class a1_02 {
     public static void main(String args[]) {
        System.out.println("First argument: " + args[0]);
        System.out.println("Second argument: " + args[1]);
        System.out.println("Second argument: " + args[2]);
        String temp;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (args[i].compareToIgnoreCase(args[j]) > 0) {
                    temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }
            }
        }
        System.out.println(
            "The argument in alphabetical order are: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(args[i]);
        }   
    }   
}

import java.util.Scanner;
class product{   
    void pro(){
        System.out.print("i am a product");
    }
    String p_id;
    public String getP_id() {
        return p_id;
    }
    product(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product id");
        p_id = sc.next();
    }
    

}
class book extends product{
    void bo(){
        System.out.print("i am a book << ");
    }
    String b_name;
    public String getB_name() {
        return b_name;
    }
    book(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book name");
        b_name = sc.next();
    }

}
class CD extends product{
    void cd(){
        System.out.print("i am a CD << ");
    }
    String cd_title;
    public String getCd_title() {
        return cd_title;
    }
    CD(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CD title");
        cd_title = sc.next();
        
    }
    void display1(){
        System.out.println("\ncd title : "+ cd_title);
        System.out.println("product id : "+ p_id );
    }
}
class scientific extends book{

    void s(){
        System.out.print("i am a scientific book << ");
    }
    String f_name;
    public String getF_name() {
        return f_name;
    }
    scientific(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter scientific name");
        f_name = sc.next();
    }
    void display(){
        System.out.println("\nscientific name : "+ f_name);
        System.out.println("book name : "+ b_name);
        System.out.println("product id : "+ p_id );
    }
}

public class a2_01 { 
    public static void main(String args[]) {
        scientific b = new scientific();
        b.s();
        b.bo();
        b.pro();
        b.display();
        System.out.print("\n");
        CD c = new CD();
        c.cd();
        c.pro();   
        c.display1();   
    }
}


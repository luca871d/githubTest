import java.util.Scanner;
//Comment
public class SuperGreeter {
    Scanner sc = new Scanner(System.in);
    public void start(){
        System.out.println("Det virker!");
    }

    public void greet(){
        String navn = sc.next();
        System.out.println("Hej " + navn);
    }

    public void askAboutAge(){
        int age = sc.nextInt();
        System.out.println("Du er : " + age + " år");
    }

    public static void main(String[] args) {
        SuperGreeter sg = new SuperGreeter();
        sg.start();
        sg.greet();
        sg.askAboutAge();
    }
}

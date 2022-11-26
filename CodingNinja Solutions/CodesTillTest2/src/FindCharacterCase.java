import java.util.*;
public class FindCharacterCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(Character.isUpperCase(ch)){
            System.out.println("1");
        }

        else if(Character.isLowerCase(ch)){
            System.out.println("0");
        }
        else{
            System.out.println("-1");
        }

    }
}

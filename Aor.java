import java.util.*;
public class Aor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in); {
        System.out.println("Enter length of the rectangle: ");
        int length=sc.nextInt();
        System.out.println("Enter breadth of the rectangle: ");
        int breadth=sc.nextInt();
        float Area =length*breadth;
        System.out.println("Area of Rectangle: "+Area);
        sc.close();
    }
  }
}


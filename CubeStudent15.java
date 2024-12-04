import java.util.Scanner;

public class CubeStudent15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Side of cube : ");
        int s = sc.nextInt();
        area(s);
        volume(s);

    }
    public static int area(int s){
        int ar = 6 * s * s;
        System.out.println("The area of the cube is :" + ar);
        return ar;
    }
    public static int volume(int s){
        int vol = s * s * s;
        System.out.println("The volume of the cube is : " + vol);
        return vol;
    }
}

public class Experiment5_15 {

    static void show (String str, int...a){
        System.out.println("String: " +str);
        System.out.println("Number of arguments/parameters: " + a.length);

        for(int i : a) {
            System.out.print(i + " ");

        }
        System.out.println();
    }
    
}

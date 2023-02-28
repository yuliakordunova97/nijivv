public class App {
    public static void main(String[] args) {

        int a = 3;
        int b = 2;
        int c = 1;

        if (a<b) {
            a = b + 2;
            c = a + 1;
        }

//        else{
//            a = 0;
//            c = a;
//        }
        System.out.println(a); // результат компіляції 4
        System.out.println(c); // результат компіляції 5

    }
}

public class Triangle {
    public static void main(String[] args){
            easiest();
            horizontal(5);
            vertical(5);
            drawTriangle(5);
        }

    static void easiest() {
        System.out.println("\n\n Easiest exercise ever");
        System.out.println('*');

    }

    static void horizontal(int n) {
        System.out.println("\n\n Draw a horizontal line");

        for (int i = 0; i < n; i++) {

            System.out.print('*');

        }

        System.out.println();
    }

    static void vertical(int n) {
        System.out.println("\n\n Draw a vertical line");

        for (int i = 0; i < n; i++) {

            System.out.println('*');

        }
    }
        static void drawTriangle(int n) {
            System.out.println(" \n\n Draw a right triangle");

            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <i ; j++) {
                    System.out.print('*');
            }
            System.out.println();


            }

    }



}

public class Diamond {

    public static void main(String[] args) {
        drawTriangle(5);
        drawDiamond(5);
        drawDiamondWithName(5);
    }


    static void drawTriangle(int n) {
        System.out.println(" \n\n Draw a isoceles triangle");

        for (int i = 1; i <= n + 2; i += 2) {

            for (int k = (n + 2 - i) / 2; k > 0; k--) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();


        }

    }

    static void drawDiamond(int n) {
        System.out.println(" \n\n Draw a diamond ");

        for (int i = 1; i <= n + 2; i += 2) {

            for (int k = (n + 2 - i) / 2; k > 0; k--) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();


        }

        for (int i = n; i > 0; i -= 2) {

            for (int k = (n + 2 - i) / 2; k > 0; k--) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();


        }

    }

    static void drawDiamondWithName(int n) {
        System.out.println(" \n\n Draw a diamond ");

        for (int i = 1; i < n + 2; i += 2) {

            for (int k = (n + 2 - i) / 2; k > 0; k--) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();


        }

        System.out.println("Jo");

        for (int i = n; i > 0; i -= 2) {

            for (int k = (n + 2 - i) / 2; k > 0; k--) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();


        }

    }




}

public class AsteriskDrawer {

    static void showOptions() {
        System.out.println("1) Box");
        System.out.println("2) Left-Aligned Triangle");
        System.out.println("3) Right-Aligned Triangle");
        System.out.println("4) Centered Triangle");
        System.out.println("5) Box with X");
        System.out.println("6) Exit");
    }

    void askForNumRows() {
        System.out.println();
        System.out.println("Input the number of rows you want.");
    }
    void drawBox(int numRows) {
        for (int i = 0; i < numRows; i++) {
            System.out.println();
            for (int j = 0; j < numRows; j++) {
                System.out.print("*");
            }
        }
    }

    void drawLeftAlignedTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        }
    }

    void drawRightAlignedTriangle(int numRows) {
//        for (int i = 0; i < numRows; i++) {
//            System.out.println();
//            for (int j = 0; j <= i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < numRows - (numRows - i); k++) {
//                System.out.print("*");
//            }
//        }
    }

    void drawCenterAlignedTriangle(int numRows) {

    }

    void drawBoxWithX(int numRows) {

    }
}

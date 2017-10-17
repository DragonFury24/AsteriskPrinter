public class AsteriskDrawer {

    static void displayOptions() {
        System.out.println("1) Box");
        System.out.println("2) Left-Aligned Triangle");
        System.out.println("3) Right-Aligned Triangle");
        System.out.println("4) Centered Triangle");
        System.out.println("5) Box with X");
        System.out.println("6) Exit");
    }

    static void askForNumRows() {
        System.out.println();
        System.out.println("Input the number of rows you want.");
    }

    //draws lines with the same number of asterisks as the number of columns
    static void drawBox(int numRows) {
        for (int i = 0; i < numRows; i++) {
            System.out.println();
            for (int j = 0; j < numRows; j++) {
                System.out.print("*");
            }
        }
    }

    static void drawLeftAlignedTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        }
    }

    static void drawRightAlignedTriangle(int numRows) {
        for (int i = numRows; i > 0; i--) {
            System.out.println();
            for (int j = numRows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
        }
    }

    static void drawCenterAlignedTriangle(int numRows) {
        int maxLength = numRows * 2 - 1;
        for (int i = 1; i <= maxLength; i += 2) {
            System.out.println();
            for (int j = 0; j < (maxLength - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
        }
    }

    static void drawBoxWithX(int numRows) {

    }
}

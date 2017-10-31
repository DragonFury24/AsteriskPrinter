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

    //draws lines with the same number of asterisks as the number of columns.
    static void drawBox(int numRows) {
        for (int i = 0; i < numRows; i++) {
            System.out.println();
            for (int j = 0; j < numRows; j++) {
                System.out.print("*");
            }
        }
    }

    //draws LeftAlignedTriangle by drawing 1 asterisk then increasing by 1 for each row.
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
        int maxRowLength = numRows * 2 - 1;
        for (int i = 1; i <= maxRowLength; i += 2) {
            System.out.println();
            for (int j = 0; j < (maxRowLength - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
        }
    }

    static void drawBoxWithX(int numRows) {
        System.out.println("This option is currently unavailable. Please choose a different option.");
        if (true) {return;} //Method currently doesn't work
        int numSpacesInMiddle = numRows - 4;
        //Draws the first row. Prints same number of as number of rows.
        for (int i = 0; i < numRows; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < numRows - 2; i++) {
            System.out.print("*"); //Prints the first asterisk in line
            if ((numRows & 1) == 0) {
                //Prints first space to align asterisks to form an X. Increases by 1 with each line.
                int j = 0;
                for (; j < (i <= numSpacesInMiddle / 2 ? i : -1); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.print("*");
                for (; j > 0; j--) {

                }
            }
            for (int j = 0; ; )
                System.out.println();
        }
    }
}

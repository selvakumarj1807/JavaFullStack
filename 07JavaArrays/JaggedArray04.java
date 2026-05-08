class JaggedArray {
    public static void main(String[] args) {

        // Jagged array
        int[][] workHours = {
            {8, 7},          // Employee 1
            {9, 8, 7, 6},   // Employee 2
            {5, 6, 7}       // Employee 3
        };

        // Display work hours
        for (int i = 0; i < workHours.length; i++) {

            System.out.println("Employee " + (i + 1) + " work hours:");

            for (int j = 0; j < workHours[i].length; j++) {
                System.out.print(workHours[i][j] + " ");
            }

            System.out.println();
        }
    }
}
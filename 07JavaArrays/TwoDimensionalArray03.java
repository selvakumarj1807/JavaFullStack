class TwoDArray {
    public static void main(String[] args) {

        // 3 students and 4 subjects
        int[][] marks = {
            {85, 90, 78, 92},
            {88, 76, 95, 89},
            {70, 80, 68, 75}
        };

        System.out.println(marks[0][1]);

        // Display marks
        for (int i = 0; i < marks.length; i++) {

            System.out.println("Student " + (i + 1) + " marks:");

            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }

            System.out.println();
        }
    }
}
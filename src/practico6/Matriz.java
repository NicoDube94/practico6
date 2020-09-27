package practico6;

public class Matriz {

    public void armar() {
        int matrix[][] = {{3, 6, 12}, {15, 18, 21}, {24, 27, 30, 33}, {39, 42}};
        int num = 0;
        for (int f = 0; f < 4; f++) {
            System.out.println();
            for (int c : matrix[f]) {
                num = c;
                if (num % 2 == 0) {
                    System.out.print(c + " ");
                }
            }
        }

        System.out.println();
    }
}

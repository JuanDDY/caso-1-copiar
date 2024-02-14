public class App { 


    public static void printMatrix (boolean[][] matriz){

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < matriz[0].length; j++) {

                if (matriz[i][j]) {
                    System.out.print("x ");
                } else {
                    System.out.print("o ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) throws Exception {

        boolean [][] matriz =  {{false,true,false},
                                {true, true, true},
                                {false,false,false}};
        Tablero tablero = new Tablero(matriz);

        Celda celda = new Celda(1,1, true, tablero);

        System.out.println(celda.calcularVecinosVivos());

        printMatrix(matriz);
        
    }
}

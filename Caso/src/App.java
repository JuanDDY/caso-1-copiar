import java.util.ArrayList;


public class App { 


    public static void main(String[] args) throws Exception {

        boolean [][] matriz =  {{false,true,false},
                                {true, true, true},
                                {false,false,false}};
        Tablero tablero = new Tablero(matriz);

        Celda celda = new Celda(1,1, true, tablero, new ArrayList<Integer>());

        System.out.println(celda.vecinasVivas());


        
    }
}

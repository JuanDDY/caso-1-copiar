public class Celda implements Runnable {
    
    private int fila;
    private int columna;
    private boolean estado; // muerta/viva
    private Buffer buzon;
    private Tablero tablero;



    public Celda (int fila, int columna, boolean estado, Tablero tablero) {
        this.fila = fila;
        this.columna = columna;
        this.estado = estado;
        this.tablero = tablero;
        this.buzon = new Buffer(fila + 1);
    }




    @Override
    public void run (){

    }

    
    public synchronized boolean evaluacion () {
        int vecinosVivos = calcularVecinosVivos();

        if(this.estado){
            if(vecinosVivos == 0 || vecinosVivos >3){
                morir();
            } 

        } else {
            if (vecinosVivos == 3){
                nacer();
            } 
        }
        return this.estado;
    }
    
    private void nacer(){
        this.estado = true;
    }


    private void morir(){
        this.estado = false;
    }


    public int calcularVecinosVivos() {
        int contador = 0;
        int i = getFila();
        int j = getColumna();

        // Iterar sobre las celdas circundantes
        for (int x = i-1; x <= i+1; x++) {
            for (int y = j-1; y <= j+1; y++) {
                // Verificar si la posición está dentro de los límites de la matriz
                if 
                (   x >= 0 
                    && (x < tablero.getMatriz().length)
                    && (y >= 0) 
                    && (y < tablero.getMatriz()[0].length)
                ) {
                    // Verificar si la celda es true
                    if (tablero.getMatriz()[x][y]) {
                        contador++;
                    }
                }
            }
        }
        // Restar 1 si la celda en sí misma es true (para evitar contarla dos veces)
        if (tablero.getMatriz()[i][j]) {
            contador--;
        }

        return contador;
    }




    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }


    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }


    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    public Buffer getBuzon() {
        return buzon;
    }

    public void setBuzon(Buffer buzon) {
        this.buzon = buzon;
    }


}

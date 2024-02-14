public class Buffer {
    
    private int capacidad;
    private int[] buzon;

    public Buffer (int capacidad){
        this.capacidad = capacidad;
    }



    
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int[] getBuzon() {
        return buzon;
    }

    public void setBuzon(int[] buzon) {
        this.buzon = buzon;
    }

    
}

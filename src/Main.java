// Segunda Parte//
public class Main {
    public static void main(String[] args) {
       coche miCoche = new coche();
       miCoche.AnadirPuerta();
        System.out.println(miCoche.puertas);
    }
}
class coche {
    public int puertas = 0;
    public void AnadirPuerta() {
        this.puertas++;
    }
}

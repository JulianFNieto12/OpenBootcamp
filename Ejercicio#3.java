public class Main {
    public static void main(String[] args) {
        int param1 = 10;
        int param2 = 20;
        int param3 = 30;

        var resultado = suma(param1, param2, param3);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.añadirPuertas();
        miCoche.añadirPuertas();
        miCoche.añadirPuertas();
        miCoche.añadirPuertas();

        System.out.println(miCoche.numeroPuertas);
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}

class Coche{
    public int numeroPuertas = 0;

    public void añadirPuertas(){
        this.numeroPuertas++;
    }
}
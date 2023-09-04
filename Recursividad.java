public class Recursividad {

    public static void main(String[] args) {
        int base = 3;
        int exponente = 5;
        int resultadoPotencia = calcularPotencia(base, exponente);
        int resultadoSuma = sumarPotencias(base, exponente);
        
        System.out.println(base + " ELEVADO A LA " + exponente + " ES IGUAL A " + resultadoPotencia);
        System.out.println("LA SUMA DE LA POTENCIA ES DE " + base + " DESDE 0 HASTA " + exponente + " ES IGUAL A " + resultadoSuma);
    }

    public static int calcularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * calcularPotencia(base, exponente - 1);
        }
    }

    public static int sumarPotencias(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return calcularPotencia(base, exponente) + sumarPotencias(base, exponente - 1);
        }
    }
}

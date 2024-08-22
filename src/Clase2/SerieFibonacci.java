package Clase2;

public class SerieFibonacci {
    // Método básico
    public static int fibonacciBasico(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    // Método optimizado
    public static int fibonacciOptimizado(int n) {
        return fibonacciBasico(n);
    }

    // Método para medir el tiempo de ejecución
    public static long measureTime(Runnable runnable) {
        long start = System.nanoTime();
        runnable.run();
        long end = System.nanoTime();
        return end - start;
    }

    public static void main(String[] args) {
        int n = 45;
        int numEjecuciones = 10; //Número de veces que se ejecutara

        long totalBasico = 0;
        long totalOptimizado = 0; //en estos dos totales se almacenera el tiempo de ejecuión

        for (int i = 0; i < numEjecuciones; i++) {
            totalBasico += measureTime(() -> fibonacciBasico(n));
            totalOptimizado += measureTime(() -> fibonacciOptimizado(n));
        }

        long avgBasico = totalBasico / numEjecuciones;
        long avgOptimizado = totalOptimizado / numEjecuciones;

        System.out.println("Tiempo promedio basico: " + avgBasico + " nanosegundos");
        System.out.println("Tiempo promedio optimizado: " + avgOptimizado + " nanosegundos");

        //A la hora de correr el programa y analizar los resultados, se puede observar que
        //por medio del método optimizado se requiere menos tiempo de ejecuíón, por ende, en
        //tem de tiempo, es más útil.
    }
}

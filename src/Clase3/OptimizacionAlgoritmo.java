package Clase3;

public class OptimizacionAlgoritmo {
    //import java.util.HashSet;
    //import java.util.Set;

    //Java
    public boolean hasDuplicate(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) {
                return true; // Duplicado encontrado
            }
            seen.add(num); // Añadir número al conjunto
        }
        return false; // No se encontraron duplicados
    }

    //JavaScript
    function hasDuplicate(arr) {
    const seen = new Set(); // Crear un conjunto vacío para almacenar los elementos ya vistos
        for (const num of arr) { // Recorrer cada número en el array
            if (seen.has(num)) { // Verificar si el número ya está en el conjunto
                return true; // Duplicado encontrado
            }
            seen.add(num); // Agregar el número al conjunto
        }
        return false; // No se encontraron duplicados
    }



}

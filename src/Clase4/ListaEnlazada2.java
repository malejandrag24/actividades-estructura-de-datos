package Clase4;

public class ListaEnlazada2 {

    //Ejercicio 3

        private Nodo head; // Referencia al primer nodo de la lista

        // Constructor para inicializar la lista vacía
        public ListaEnlazada() {
            this.head = null;
        }

        // Método para insertar un nuevo nodo al inicio de la lista
        public void insertarAlInicio(int data) {
            Nodo nuevoNodo = new Nodo(data);
            nuevoNodo.next = head;
            head = nuevoNodo;
        }

        // Método para eliminar el primer nodo con el valor especificado
        public void eliminarPorValor(int valor) {
            if (head == null) {
                return;
            }

            // Caso especial: el nodo a eliminar es el primer nodo
            if (head.data == valor) {
                head = head.next; // Mover la cabeza al siguiente nodo
                return;
            }

            // Buscar el nodo a eliminar
            Nodo actual = head;
            while (actual.next != null && actual.next.data != valor) {
                actual = actual.next; // Moverse al siguiente nodo
            }

            // Si encontramos el nodo con el valor, eliminarlo
            if (actual.next != null) {
                actual.next = actual.next.next; // Saltar el nodo que queremos eliminar
            }
        }

        // Método para buscar un nodo con el valor especificado
        public boolean buscarPorValor(int valor) {
            Nodo actual = head; // Empezar desde la cabeza de la lista
            while (actual != null) {
                if (actual.data == valor) {
                    return true; // Valor encontrado
                }
                actual = actual.next; // Moverse al siguiente nodo
            }
            return false; // Valor no encontrado
        }

        // Método para recorrer e imprimir todos los nodos de la lista
        public void imprimirLista() {
            Nodo actual = head; // Empezar desde la cabeza de la lista
            while (actual != null) {
                System.out.print(actual.data + " "); // Imprimir el dato del nodo actual
                actual = actual.next; // Moverse al siguiente nodo
            }
            System.out.println(); // Imprimir nueva línea al final
        }
    }

    // Añadir elementos, buscar un valor y mostrar si el valor se encuentra o no en la lista

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada(); // Crear una nueva lista enlazada

        // Insertar 5 elementos al inicio de la lista
        lista.insertarAlInicio(5);
        lista.insertarAlInicio(4);
        lista.insertarAlInicio(3);
        lista.insertarAlInicio(2);
        lista.insertarAlInicio(1);

        // Imprimir la lista
        System.out.println("Lista:");
        lista.imprimirLista(); // Debería imprimir: 1 2 3 4 5

        // Buscar un valor en la lista
        int valorABuscar = 3;
        boolean encontrado = lista.buscarPorValor(valorABuscar);

        // Mostrar si el valor se encuentra en la lista
        if (encontrado) {
            System.out.println("El valor " + valorABuscar + " se encuentra en la lista.");
        } else {
            System.out.println("El valor " + valorABuscar + " no se encuentra en la lista.");
        }
    }
}


}

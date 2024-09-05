package Clase4;

public class ListasEnlacadasSimples {

    //EJERCICIO 1

    //Clase Nodo
    public class Nodo {
        int data;
        Nodo next;

        // Constructor para crear un nodo con datos
        public Nodo(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Implementamos la clase lista enlazada
    public class ListaEnlazada {
        private Nodo head;

        // Constructor para inicializar la lista vacía
        public ListaEnlazada() {
            this.head = null;
        }

        // Método para insertar un nuevo nodo al inicio de la lista
        public void insertarAlInicio(int data) {
            Nodo nuevoNodo = new Nodo(data); //
            nuevoNodo.next = head; // Hacer que el siguiente del nuevo nodo sea el actual primer nodo
            head = nuevoNodo; // Actualizar la cabeza de la lista al nuevo nodo
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

    //Añadir 5 elementos e imprimir la lista
    public class Main {
        public static void main(String[] args) {
            ListaEnlazada lista = new ListaEnlazada(); // Crear una nueva lista enlazada

            // Insertar 5 elementos al inicio de la lista
            lista.insertarAlInicio(5);
            lista.insertarAlInicio(4);
            lista.insertarAlInicio(3);
            lista.insertarAlInicio(2);
            lista.insertarAlInicio(1);

            // Imprimir los elementos de la lista
            lista.imprimirLista();
        }
    }

}

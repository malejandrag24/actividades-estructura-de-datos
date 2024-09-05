package Clase4;

public class ListaEnlazada {
        private Nodo head;

        // Constructor para inicializar la lista vacía
        public ListaEnlazada() {
            this.head = null;
        }

        // Método para isnertar un nuevo nodo a la lista
        public void insertarAlInicio(int data) {
            ListasEnlacadasSimples.Nodo nuevoNodo = new Nodo(data); // Crear un nuevo nodo
            nuevoNodo.next = head; // Hacer que el siguiente del nuevo nodo sea el actual primer nodo
            head = nuevoNodo; // Actualizar la cabeza de la lista al nuevo nodo
        }

        // Método para eliminar el primer nodo con el valor especificado
        public void eliminarPorValor(int valor) {
            if (head == null) {
                return; // Lista vacía, no hay nada que eliminar
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

    //AÑadir o eliminar elementos e imprimir lista
        public static void main(String[] args) {
            ListaEnlazada lista = new ListaEnlazada(); // Crear una nueva lista enlazada

            // Insertar 5 elementos al inicio de la lista
            lista.insertarAlInicio(5);
            lista.insertarAlInicio(4);
            lista.insertarAlInicio(3);
            lista.insertarAlInicio(2);
            lista.insertarAlInicio(1);

            // Imprimir la lista antes de eliminar
            System.out.println("Lista antes de eliminar:");
            lista.imprimirLista(); // Debería imprimir: 1 2 3 4 5

            // Eliminar el valor 3 de la lista
            lista.eliminarPorValor(3);

            // Imprimir la lista después de eliminar
            System.out.println("Lista después de eliminar 3:");
            lista.imprimirLista(); // Debería imprimir: 1 2 4 5
        }
    }

}

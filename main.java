package regu4;

import java.util.Scanner;




public class RegU4 {

    

        public static void main(String[] args) {

           boolean continuar = true;
        int opcion, elemento;
        int[] matriz = LeerTxt.LeerTxt();

        Procesos obj = new Procesos();
        Scanner leer = new Scanner(System.in);

        while (continuar) {
            System.out.println("");
            System.out.println("Menu de listas enlazadas");
            System.out.println("1.- Insertar");
            System.out.println("2.- Mostrar Pre-orden");
            System.out.println("3.- Mostrar In-orden");
            System.out.println("4.- Mostrar Post-orden");
            System.out.println("5.- Buscar elemento");
            System.out.println("6.- Altura");
            System.out.println("7.- Cantidad de nodos");
            System.out.println("8.- Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Numeros insertados");

                    for (int i = 0; i < matriz.length; i++) {
                        Nodo nodoActual;
                        nodoActual = new Nodo(matriz[i]);
                        obj.Insertar(nodoActual);
                    }
                    break;

                case 2:
                    obj.preorden();
                    break;

                case 3:
                    obj.inorden();
                    break;

                case 4:
                    obj.posorden();
                    break;

                case 5:
                    System.out.println("¿Qué número desea buscar?");
                    elemento = leer.nextInt();
                    obj.Buscar(elemento);
                    break;

                case 6:
                    obj.retornaAltura();
                    break;

                case 7:
                    obj.cantidad();
                    break;

                case 8:
                    continuar = false;
                    break;

                default:
                    break;
            }
        }
    }
}

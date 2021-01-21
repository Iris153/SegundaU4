package regu4;


import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class RegU4 {

    

        public static void main(String[] args) {

           boolean continuar = true, continuar2 = true;
        int opcion, numero = 1, elemento;

        Object inserta;

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
                        try {
                    Scanner input = new Scanner(new File("C:\\Users\\irisv\\Desktop\\Regula4.txt"));
                    while (input.hasNextLine()) {
                        String line = input.nextLine();
                        System.out.println(line);
                    }
                    input.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                System.out.println("Numeros insertados");

                while (continuar2) {
                    Nodo nodoActual;

                    switch (numero) {
                        case 1:
                            nodoActual = new Nodo(6);
                            obj.Insertar(nodoActual);
                            break;

                        case 2:
                            nodoActual = new Nodo(3);
                            obj.Insertar(nodoActual);
                            break;

                        case 3:
                            nodoActual = new Nodo(2);
                            obj.Insertar(nodoActual);
                            break;

                        case 4:
                            nodoActual = new Nodo(4);
                            obj.Insertar(nodoActual);
                            break;

                        case 5:
                            nodoActual = new Nodo(1);
                            obj.Insertar(nodoActual);
                            break;

                        case 6:
                            nodoActual = new Nodo(2);
                            obj.Insertar(nodoActual);
                            break;

                        case 7:
                            nodoActual = new Nodo(7);
                            obj.Insertar(nodoActual);
                            break;

                        case 8:
                            nodoActual = new Nodo(10);
                            obj.Insertar(nodoActual);
                            break;

                        case 9:
                            nodoActual = new Nodo(8);
                            obj.Insertar(nodoActual);
                            break;

                        case 10:
                            nodoActual = new Nodo(9);
                            obj.Insertar(nodoActual);
                            break;

                        default:
                            break;
                    }
                    if (numero == 10) {
                        continuar2 = false;
                    }
                    numero++;
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

package regu4;

/**
 *
 * @author irisv
 */
public class Buscar {

    public void metodoBuscar(int elemento, Nodo auxiliar, int nivel) {

        if (auxiliar == null) {
            System.out.println("No existe ningún elemento en el árbol");
        } else {

            if (elemento == auxiliar.elemento) {
                System.out.println("El elemento sí existe en el arbol, está en el nivel " + nivel);
            } else {

                if (elemento < auxiliar.elemento) {
                    if (auxiliar.izquierda == null) {
                        System.out.println("El elemento que ingresaste no existe");
                    } else {
                        auxiliar = auxiliar.izquierda;
                        nivel++;
                        metodoBuscar(elemento, auxiliar, nivel);
                    }

                } else {
                    if (auxiliar.derecha == null) {
                        System.out.println("El elemento que ingresaste no existe");
                    } else {
                        auxiliar = auxiliar.derecha;
                        nivel++;
                        metodoBuscar(elemento, auxiliar, nivel);
                    }
                }
            }

        }
    }

}

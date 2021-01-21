package regu4;

/**
 *
 * @author irisv
 */
public class Procesos {

    Buscar buscar = new Buscar();

    Nodo nodoPadre = null;
    Nodo nodoRaiz = null;
    int cantidadNodos = 0;
    int altura, nivel = 1;

    public void Insertar(Nodo nodoActual) {

        if (nodoPadre == null) {

            nodoPadre = nodoActual;
            nodoRaiz = nodoActual;

            cantidadNodos++;
        } else {

            if (nodoActual.elemento < nodoPadre.elemento) {

                if (nodoPadre.izquierda == null) {
                    nodoPadre.izquierda = nodoActual;
                    nodoPadre = nodoRaiz;

                    cantidadNodos++;
                } else {
                    nodoPadre = nodoPadre.izquierda;
                    Insertar(nodoActual);
                }

            } else {

                if (nodoPadre.derecha == null) {
                    nodoPadre.derecha = nodoActual;
                    nodoPadre = nodoRaiz;

                    cantidadNodos++;
                } else {
                    nodoPadre = nodoPadre.derecha;
                    Insertar(nodoActual);
                }
            }
        }
    }

    public void preorden() {
        preorden(nodoRaiz);
    }

    private void preorden(Nodo nodoRaiz2) {

        if (nodoRaiz2 != null) {
            System.out.print(nodoRaiz2.elemento + " ");
            preorden(nodoRaiz2.izquierda);
            preorden(nodoRaiz2.derecha);
        }
    }

    public void inorden() {
        inorden(nodoRaiz);
    }

    private void inorden(Nodo nodoRaiz2) {

        if (nodoRaiz2 != null) {
            inorden(nodoRaiz2.izquierda);
            System.out.print(nodoRaiz2.elemento + " ");
            inorden(nodoRaiz2.derecha);
        }
    }

    public void posorden() {
        posorden(nodoRaiz);
    }

    private void posorden(Nodo nodoRaiz2) {

        if (nodoRaiz2 != null) {
            posorden(nodoRaiz2.izquierda);
            posorden(nodoRaiz2.derecha);
            System.out.print(nodoRaiz2.elemento + " ");
        }
    }

    public void Buscar(int elemento) {

        Nodo auxiliar = nodoPadre;
        int nivel = 1;

        buscar.metodoBuscar(elemento, auxiliar, nivel);
    }

    public void cantidad() {

        System.out.print("La cantidad de nodos es de: " + cantidadNodos);

    }

    public void retornaAltura() {
        altura = 0;
        retornaAltura(nodoRaiz, nivel);
        System.out.println("La altura es: " + altura);
    }

    public void retornaAltura(Nodo reco, int nivel) {

        if (reco != null) {
            retornaAltura(reco.izquierda, nivel + 1);

            if (nivel > altura) {
                altura = nivel;
            }

            retornaAltura(reco.derecha, nivel + 1);
        }
    }

}

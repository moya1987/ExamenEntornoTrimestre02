
package Examen;

/**
 * Examen de la asignatura Entornos de Desarrollo segunda evaluacion.
 * @author adrian
 * @see https://github.com/moya1987/ExamenEntornoTrimestre02.git
 */

public class Examen {
    /**
     * Tamaño mayor de la lista de enteros.
     */
    public static int TAMAÑOMAXIMO = 100;

    /**
     * Este metodo calcula el mayor de los enteros.
     * @param listaEnteros es un array con los numeros a calcularles el mayor.
     * @return devuelve el valor mayor del array lista entero.
     * @throws Exception. Lanza excepcion cuando el array es null y cuando es mayor que el TamañoMaximo permitido. 
     */
    public static int elMayorDe(int[] listaEnteros) throws Exception {
        if (listaEnteros == null) {
            throw new Exception("Lista de números vacía, no se puede calcular el máximo");
        }
        if (listaEnteros.length > TAMAÑOMAXIMO) {
            throw new Exception("Lista de números demasido grande, no se puede calcular el máximo");
        }
        int mayor = listaEnteros[0];
        for (int i = 1; i < listaEnteros.length; i++) {
            if (mayor < listaEnteros[i]) {
                mayor = listaEnteros[i];
            }
        }
        return mayor;
    }
}
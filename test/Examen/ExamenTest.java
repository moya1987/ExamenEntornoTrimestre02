package Examen;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 * Test para la comprobacion del examen de la asignatura Entornos de Desarrollo.
 *
 * @author adrian
 */

public class ExamenTest {

    /**
     * Variable que controla la excepciones lanzadas por los metodos.
     */
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    /**
     * Constructor vacio.
     */
    public ExamenTest() {
    }

    /**
     * Este test prueba cuando listaEnteros es null.
     *
     * @throws Exception La lista de numeros esta vacia.
     */
    @Test
    public void testElMayorDeConNull() {
        System.out.println("elMayorDe con Null");
        int[] listaEnteros = null;
        boolean error = true;
        try {
            int result = Examen.elMayorDe(listaEnteros);
            error = false;
            fail("Test erroneo");
        } catch (Exception e) {
            assertEquals(error, true);
        }
    }

    /**
     * Este test prueba cuando ListaEnteros es mayor que TamañoMaximo.
     *
     * @throws Exception La lista de numeros es demasiado grande.
     */
    @Test
    public void testElMayorDeConListaEnterosMayorqueTamañomaximo() {
        System.out.println("elMayorDe con ListaEnteros mayor que Tamañomaximo");
        int[] listaEnteros = new int[1000];
        for (int i = 0; i < listaEnteros.length; i++) {
            listaEnteros[i] = i + 1;
        }
        boolean error = true;
        try {
            int result = Examen.elMayorDe(listaEnteros);
            error = false;
            fail("Test erroneo");
        } catch (Exception e) {
            assertEquals(error, true);
        }
    }

    /**
     * ESte test prueba cuando ListaEnteros tiene tamaño cero.
     *
     * @throws Exception de ArrayIndexOutOfBoundsException.
     */
    @Test
    public void testElMayorDeConListaEnterosATamañoCero() {
        System.out.println("elMayorDe con ListaEnteros con tamaño cero");
        int[] listaEnteros = new int[0];
        boolean error = true;
        try {
            int result = Examen.elMayorDe(listaEnteros);
            error = false;
            fail("Test erroneo");
        } catch (Exception e) {
            assertEquals(error, true);
        }
    }

    /**
     * Este test prueba cuando ListaEntero tiene un tamaño de tres.
     */
    @Test
    public void testElMayorDeConListaEnterosATamañoTres() {
        System.out.println("elMayorDe con ListaEnteros con tamaño tres");
        int[] listaEnteros = new int[3];
        for (int i = 0; i < listaEnteros.length; i++) {
            listaEnteros[i] = i + 1;
        }
        try {
            int result = Examen.elMayorDe(listaEnteros);
            assertEquals(result, 3);
        } catch (Exception ex) {
            fail("Error en implementacion de test");
        }
    }

    /**
     * Este test prueba cuando ListaEnteros tiene tamaño uno.
     */
    @Test
    public void testElMayorDeConListaEnterosATamañoUno() {
        System.out.println("elMayorDe con ListaEnteros con tamaño uno");
        int[] listaEnteros = new int[1];
        for (int i = 0; i < listaEnteros.length; i++) {
            listaEnteros[i] = i + 1;
        }

        try {
            int result = Examen.elMayorDe(listaEnteros);
            assertEquals(result, 1);
        } catch (Exception ex) {
            fail("Error en implementacion de test");
        }
    }

}

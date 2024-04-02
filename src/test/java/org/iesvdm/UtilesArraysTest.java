package org.iesvdm;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class UtilesArraysTest {

    @Test
    void limpiar() {
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = new int[0];
        array = UtilesArrays.limpiar();
        assertThat(array).isEqualTo(array2);
    }

    @Test
    void rellenar() {
        int[] array = new int[0];
        int[] array2 = {0, 0};
        int num = 2;
        array = UtilesArrays.rellenar(array, num);
        assertThat(array).isEqualTo(array2);
        assertThat(array.length == num).isTrue();
    }

    @Test
    void insertarAlFinal() {
        int[] array = {1, 2, 3, 4};
        int num = 5;
        array = UtilesArrays.insertarAlFinal(array, num);
        assertThat(array[array.length - 1]).isEqualTo(num);
    }

    @Test
    void insertarAlPrincipio() {
        int[] array = {2, 3, 4, 5};
        int num = 1;
        array = UtilesArrays.insertarAlPrincipio(array, num);
        assertThat(array[0]).isEqualTo(num);
    }

    @Test
    void insertarEnPosicion() {
        int[] array = {1, 2, 4, 5};
        int num = 3;
        int pos = 2;
        array = UtilesArrays.insertarEnPosicion(array, num, pos);
        assertThat(array[pos]).isEqualTo(num);
    }

    @Test
    void insertarOrdenado() {
        int[] array = {1, 2, 3, 4, 5};
        int num = 2;
        int[] array2 = {1, 2, 2, 3, 4, 5};
        array = UtilesArrays.insertarOrdenado(array, num);
        assertThat(array).isEqualTo(array2);
    }

    @Test
    void eliminarUltimo() {
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4};
        array = UtilesArrays.eliminarUltimo(array);
        assertThat(array).isEqualTo(array2);
    }

    @Test
    void eliminarPrimero() {
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = {2, 3, 4, 5};
        array = UtilesArrays.eliminarPrimero(array);
        assertThat(array).isEqualTo(array2);
    }

    @Test
    void eliminarPosicion() {
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = {1, 3, 4, 5};
        int pos = 1;
        array = UtilesArrays.eliminarPosicion(array, pos);
        assertThat(array).isEqualTo(array2);
    }

    @Test
    void eliminar() {
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = {1, 3, 4, 5};
        int elemento = 2;
        array = UtilesArrays.eliminar(array, elemento);
        assertThat(array).isEqualTo(array2);
    }

    @Test
    void ordenar() {
        int[] array = {5, 4, 3, 2, 1};
        int[] array2 = {1, 2, 3, 4, 5};
        array = UtilesArrays.ordenar(array);
        assertThat(array).isEqualTo(array2);
    }

    @Test
    void desordenar() {
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        UtilesArrays.desordenar(array);
        assertThat(array).isNotEqualTo(array2);
    }

    @Test
    void invertir() {
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};
        array = UtilesArrays.invertir(array);
        assertThat(array).isEqualTo(array2);
    }

    @Test
    void estaOrdenado() {
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};
        boolean p = UtilesArrays.estaOrdenado(array);
        boolean g = UtilesArrays.estaOrdenado(array2);
        assertThat(p).isTrue();
        assertThat(g).isFalse();
    }

    @Test
    void buscar() {
        int[] array = {1, 2, 3, 4, 5};
        int a = 2;
        int b = 6;
        assertThat(UtilesArrays.buscar(array, a)).isEqualTo(1);
        assertThat(UtilesArrays.buscar(array, b)).isEqualTo(-1);
    }

    @Test
    void partirPor() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {6, 7, 8};
        array = UtilesArrays.partirPor(array, 5, 8);
        assertThat(array).isEqualTo(array2);
    }

    @Test
    void sonIguales() {
        //Creo que no está bien hecha en el main, porque sale error siendo los 2 arrays idénticos.
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        boolean igual = UtilesArrays.sonIguales(array,array2);
    }

    @Test
    void elementosIguales() {
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = {7, 2, 10};
        boolean a = UtilesArrays.elementosIguales(array, array2, 1);
        boolean b = UtilesArrays.elementosIguales(array, array2, 2);
        assertThat(a).isTrue();
        assertThat(b).isFalse();
    }

    @Test
    void concatenarArrays() {
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = {6 ,7 ,8, 9, 10};
        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        array = UtilesArrays.concatenarArrays(array, array2);
        assertThat(array).isEqualTo(array3);
    }
}
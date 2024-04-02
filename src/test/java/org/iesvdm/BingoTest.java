package org.iesvdm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BingoTest {

    @Test
    void rellenarNumerosCarton() {
        int[][] array = new int[9][3];
        Bingo.rellenarNumerosCarton(array);
        boolean range = true;

        for (int i=0; i<9; i++) {
            for (int j=0; j<3; j++) {
                System.out.println(10*(i+1)+" "+i*10+" "+array[i][j]);
                if ((array[i][j] > (10*(i+1))) || (array[i][j] < ((i*10)))) {
                    range = false;
                }
            }
        }
        assertTrue(range);
    }

    @Test
    void ponerBlancos() {
        int [][] array = new int[9][3];
        int cont = 0;
        Bingo.rellenarNumerosCarton(array);
        Bingo.ponerBlancos(array);
        for(int i=0; i<9; i++) {
            for (int j=0; j<3; j++) {
                if (array[i][j] == -1) {
                    cont++;
                }
            }
        }
        assertEquals(12,cont);
    }

    @Test
    void buscarFila() {
        int[][] array = new int[9][3];
        Bingo.rellenarNumerosCarton(array);
        int fila = 1;
        int posicion = 2;
        boolean esta = Bingo.buscarFila(array,fila,posicion);
        if (array[posicion][fila]==-1) {
            assertTrue(esta);
        }
        else if (!(array[posicion][fila] ==-1)) {
            assertFalse(esta);
        }

    }

    @Test
    void buscarColumna() {
        int [][] array=new int[9][3];
        int cont = 0;
        int posAleatoria = 6;
        Bingo.rellenarNumerosCarton(array);
        Bingo.ponerBlancos(array);
        for (int j=0; j<3; j++) {
            if (array[posAleatoria][j] == -1) {
                cont++;
            }
        }
        if (cont == 2) {
            assertTrue(Bingo.buscarColumna(array,posAleatoria));
        }
        else {
            assertFalse(Bingo.buscarColumna(array,posAleatoria));
        }
    }

    @Test
    void buscarValorRepetido() {
        int[] array= {1,2,3,4,5};
        int elemento1 = 2;
        int elemento2 = 9;
        boolean respuesta1 = false;
        boolean respuesta2 = false;
        assertTrue(Bingo.buscarValorRepetido(array,elemento1));
        assertFalse(Bingo.buscarValorRepetido(array,elemento2));
    }

    @Test
    void pintarCarton() {
        int[][] array = new int[9][3];
        int[] bolas = {15,23,81,2,51,70};
        int aciertos = 0;
        Bingo.rellenarNumerosCarton(array);
        Bingo.pintarCarton(array,bolas);
        for (int i=0; i<9; i++) {
            for (int j=0; j<3; j++) {
                for (int k=0; k<bolas.length; k++) {
                    if (array[i][j] == bolas[k]) {
                        aciertos++;
                    }
                }
            }
        }
        assertEquals(Bingo.pintarCarton(array,bolas),aciertos);
    }

    @Test
    void insertarAlFinal() {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int num = 10;
        int[] esperado = {1,2,3,4,5,6,7,8,9,10};
        assertArrayEquals(Bingo.insertarAlFinal(array,num),esperado);
    }

    @Test
    void ordenar() {
        int[] array = {9,8,7,6,5,4,3,2,1};
        int[] esperado = {1,2,3,4,5,6,7,8,9};
        assertArrayEquals(Bingo.ordenar(array),esperado);
    }
}
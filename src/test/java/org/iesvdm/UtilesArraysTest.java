package org.iesvdm;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.*;

public class UtilesArraysTest {

    @Test
    void limpiar() {
        assertThat(UtilesArrays.limpiar()).isEmpty();
    }

    @Test
    void rellenar() {
        int[] array = new int[10];
        int elementos = 5;

    }
}

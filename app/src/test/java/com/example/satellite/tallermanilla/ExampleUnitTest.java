package com.example.satellite.tallermanilla;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void prueba1 (){
        int cantidad=1, material=0, dije=0, tipo=0, moneda=0;
        double res=100;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }
}
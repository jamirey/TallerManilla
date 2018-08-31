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
    public void prueba1 (){
        int cantidad=1, material=1, dije=1, tipo=1, moneda=1;
        double res=100;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba2 (){
        int cantidad=1, material=1, dije=1, tipo=2, moneda=1;
        double res=100;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba3 (){
        int cantidad=1, material=1, dije=1, tipo=3, moneda=1;
        double res=80;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba4 (){
        int cantidad=1, material=1, dije=1, tipo=4, moneda=1;
        double res=70;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba5 (){
        int cantidad=1, material=1, dije=2, tipo=1, moneda=1;
        double res=120;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba6 (){
        int cantidad=1, material=1, dije=2, tipo=2, moneda=1;
        double res=120;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba7 (){
        int cantidad=1, material=1, dije=2, tipo=3, moneda=1;
        double res=100;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba8 (){
        int cantidad=1, material=1, dije=2, tipo=4, moneda=1;
        double res=90;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba9 (){
        int cantidad=1, material=2, dije=1, tipo=1, moneda=1;
        double res=90;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba10 (){
        int cantidad=1, material=2, dije=1, tipo=2, moneda=1;
        double res=90;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba11 (){
        int cantidad=1, material=2, dije=1, tipo=3, moneda=1;
        double res=70;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba12 (){
        int cantidad=1, material=2, dije=1, tipo=4, moneda=1;
        double res=50;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba13 (){
        int cantidad=1, material=2, dije=2, tipo=1, moneda=1;
        double res=110;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba14 (){
        int cantidad=1, material=2, dije=2, tipo=2, moneda=1;
        double res=110;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba15 (){
        int cantidad=1, material=2, dije=2, tipo=3, moneda=1;
        double res=90;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba16 (){
        int cantidad=1, material=2, dije=2, tipo=4, moneda=1;
        double res=80;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }
    @Test
    public void prueba17 (){
        int cantidad=1, material=1, dije=1, tipo=1, moneda=2;
        double res=320000;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba18 (){
        int cantidad=1, material=1, dije=1, tipo=2, moneda=2;
        double res=320000;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba19 (){
        int cantidad=1, material=1, dije=1, tipo=3, moneda=2;
        double res=256000;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba20 (){
        int cantidad=1, material=1, dije=1, tipo=4, moneda=2;
        double res=224000;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba21 (){
        int cantidad=1, material=1, dije=2, tipo=1, moneda=2;
        double res=384000;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba22 (){
        int cantidad=1, material=1, dije=2, tipo=2, moneda=2;
        double res=384000;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba23 (){
        int cantidad=1, material=1, dije=2, tipo=3, moneda=2;
        double res=320000;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba24 (){
        int cantidad=1, material=1, dije=2, tipo=4, moneda=2;
        double res=288000;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba25 (){
        int cantidad=1, material=2, dije=1, tipo=1, moneda=2;
        double res=288000;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba26 (){
        int cantidad=1, material=2, dije=1, tipo=2, moneda=2;
        double res=288000;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba27 (){
        int cantidad=1, material=2, dije=1, tipo=3, moneda=2;
        double res=224000;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba28 (){
        int cantidad=1, material=2, dije=1, tipo=4, moneda=2;
        double res=160000;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba29 (){
        int cantidad=1, material=2, dije=2, tipo=1, moneda=2;
        double res=352000;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba30 (){
        int cantidad=1, material=2, dije=2, tipo=2, moneda=2;
        double res=352000;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba31 (){
        int cantidad=1, material=2, dije=2, tipo=3, moneda=2;
        double res=288000;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }

    @Test
    public void prueba32 (){
        int cantidad=1, material=2, dije=2, tipo=4, moneda=2;
        double res=256000;
        assertEquals(res,Metodos.calcular(cantidad,material,dije,tipo,moneda), 0 );
    }
}
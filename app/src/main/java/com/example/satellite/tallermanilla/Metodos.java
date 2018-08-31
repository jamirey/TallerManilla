package com.example.satellite.tallermanilla;

public class Metodos {

    public static double calcular(int Cantidad2, int OpcionMaterial, int OpcionDije, int OpcionTipo, int OpcionMoneda) {
        double Resultado=0;
        int PesoODolar=3200, Precio;


            if ((OpcionMaterial == 1) && (OpcionDije == 1) && (OpcionTipo == 1 || OpcionTipo == 2)) {

                if (OpcionMoneda == 2) {
                    Precio = 100;
                    Resultado = (Cantidad2 * Precio) * PesoODolar;
                } else {
                    Precio = 100;
                    Resultado = (Cantidad2 * Precio);
                }
            }
            if ((OpcionMaterial == 1) && (OpcionDije == 1) && (OpcionTipo == 3)) {

                if (OpcionMoneda == 2) {
                    Precio = 80;
                    Resultado = (Cantidad2 * Precio) * PesoODolar;

                } else {
                    Precio = 80;
                    Resultado = (Cantidad2 * Precio);
                }
            }
            if ((OpcionMaterial == 1) && (OpcionDije == 1) && (OpcionTipo == 4)) {

                if (OpcionMoneda == 2) {
                    Precio = 70;
                    Resultado = (Cantidad2 * Precio) * PesoODolar;

                } else {
                    Precio = 70;
                    Resultado = (Cantidad2 * Precio);
                }
            }

            if ((OpcionMaterial == 1) && (OpcionDije == 2) && (OpcionTipo == 1 || OpcionTipo == 2)) {

                if (OpcionMoneda == 2) {
                    Precio = 120;
                    Resultado = (Cantidad2 * Precio) * PesoODolar;

                } else {
                    Precio = 120;
                    Resultado = (Cantidad2 * Precio);

                }
            }

            if ((OpcionMaterial == 1) && (OpcionDije == 2) && (OpcionTipo == 3)) {

                if (OpcionMoneda == 2) {
                    Precio = 100;
                    Resultado = (Cantidad2 * Precio) * PesoODolar;

                } else {
                    Precio = 100;
                    Resultado = (Cantidad2 * Precio);

                }
            }

            if ((OpcionMaterial == 1) && (OpcionDije == 2) && (OpcionTipo == 4)) {

                if (OpcionMoneda == 2) {
                    Precio = 90;
                    Resultado = (Cantidad2 * Precio) * PesoODolar;

                } else {
                    Precio = 90;
                    Resultado = (Cantidad2 * Precio);

                }
            }

            if ((OpcionMaterial == 2) && (OpcionDije == 1) && (OpcionTipo == 1 || OpcionTipo == 2)) {

                if (OpcionMoneda == 2) {
                    Precio = 90;
                    Resultado = (Cantidad2 * Precio) * PesoODolar;

                } else {
                    Precio = 90;
                    Resultado = (Cantidad2 * Precio);

                }
            }

            if ((OpcionMaterial == 2) && (OpcionDije == 1) && (OpcionTipo == 3)) {

                if (OpcionMoneda == 2) {
                    Precio = 70;
                    Resultado = (Cantidad2 * Precio) * PesoODolar;

                } else {
                    Precio = 70;
                    Resultado = (Cantidad2 * Precio);

                }
            }

            if ((OpcionMaterial == 2) && (OpcionDije == 1) && (OpcionTipo == 4)) {

                if (OpcionMoneda == 2) {
                    Precio = 50;
                    Resultado = (Cantidad2 * Precio) * PesoODolar;

                } else {
                    Precio = 50;
                    Resultado = (Cantidad2 * Precio);

                }
            }

            if ((OpcionMaterial == 2) && (OpcionDije == 2) && (OpcionTipo == 1 || OpcionTipo == 2)) {

                if (OpcionMoneda == 2) {
                    Precio = 110;
                    Resultado = (Cantidad2 * Precio) * PesoODolar;

                } else {
                    Precio = 110;
                    Resultado = (Cantidad2 * Precio);

                }
            }

            if ((OpcionMaterial == 2) && (OpcionDije == 2) && (OpcionTipo == 3)) {

                if (OpcionMoneda == 2) {
                    Precio = 90;
                    Resultado = (Cantidad2 * Precio) * PesoODolar;

                } else {
                    Precio = 90;
                    Resultado = (Cantidad2 * Precio);

                }
            }

            if ((OpcionMaterial == 2) && (OpcionDije == 2) && (OpcionTipo == 4)) {

                if (OpcionMoneda== 2) {
                    Precio = 80;
                    Resultado = (Cantidad2 * Precio) * PesoODolar;

                } else {
                    Precio = 80;
                    Resultado = (Cantidad2 * Precio);
                }
            }
        return Resultado;
        }

    }


package com.example.satellite.tallermanilla;

public class Metodos {

    public static double calcular(int Cantidad2, int OpcionMaterial, int OpcionDije, int OpcionTipo, int OpcionMoneda) {
        double Resultado=0;
        int PesoODolar=3200, Precio;


            if ((OpcionMaterial == 0) && (OpcionDije == 0) && (OpcionTipo == 0 || OpcionTipo == 1)) {
                //Cantidad = Integer.parseInt(txtCantidad.getText().toString());
                if (OpcionMoneda == 1) {
                    Precio = 100;
                    Resultado = (Cantidad2 * Precio) * PesoODolar;
                } else {
                    Precio = 100;
                    Resultado = (Cantidad2 * Precio);
                }
            }
            if ((OpcionMaterial == 0) && (OpcionDije == 0) && (OpcionTipo == 2)) {
                //Cantidad = Integer.parseInt(txtCantidad.getText().toString());
                if (OpcionMoneda == 1) {
                    Precio = 80;
                    Resultado = (Cantidad2 * Precio) * PesoODolar;

                } else {
                    Precio = 80;
                    Resultado = (Cantidad2 * Precio);
                }
            }
            if ((OpcionMaterial == 0) && (OpcionDije == 0) && (OpcionTipo == 3)) {
                //Cantidad = Integer.parseInt(txtCantidad.getText().toString());
                if (OpcionMoneda == 1) {
                    Precio = 70;
                    Resultado = (Cantidad2 * Precio) * PesoODolar;

                } else {
                    Precio = 70;
                    Resultado = (Cantidad2 * Precio);
                }
            }

            if ((OpcionMaterial == 0) && (OpcionDije == 1) && (OpcionTipo == 0 || OpcionTipo == 1)) {
                //Cantidad = Integer.parseInt(txtCantidad.getText().toString());
                if (OpcionMoneda == 1) {
                    Precio = 120;
                    Resultado = (Cantidad2 * Precio) * PesoODolar;

                } else {
                    Precio = 120;
                    Resultado = (Cantidad2 * Precio);

                }
            }

            if ((OpcionMaterial == 0) && (OpcionDije == 1) && (OpcionTipo == 2)) {
                //Cantidad = Integer.parseInt(txtCantidad.getText().toString());
                if (OpcionMoneda == 1) {
                    Precio = 100;
                    Resultado = (Cantidad2 * Precio) * PesoODolar;

                } else {
                    Precio = 100;
                    Resultado = (Cantidad2 * Precio);

                }
            }

            if ((OpcionMaterial == 0) && (OpcionDije == 1) && (OpcionTipo == 3)) {
                //Cantidad = Integer.parseInt(txtCantidad.getText().toString());
                if (OpcionMoneda == 1) {
                    Precio = 90;
                    Resultado = (Cantidad2 * Precio) * PesoODolar;

                } else {
                    Precio = 90;
                    Resultado = (Cantidad2 * Precio);

                }
            }

            if ((OpcionMaterial == 1) && (OpcionDije == 0) && (OpcionTipo == 0 || OpcionTipo == 1)) {
                //Cantidad = Integer.parseInt(txtCantidad.getText().toString());
                if (OpcionMoneda == 1) {
                    Precio = 90;
                    Resultado = (Cantidad2 * Precio) * PesoODolar;

                } else {
                    Precio = 90;
                    Resultado = (Cantidad2 * Precio);

                }
            }

            if ((OpcionMaterial == 1) && (OpcionDije == 0) && (OpcionTipo == 2)) {
                //Cantidad = Integer.parseInt(txtCantidad.getText().toString());
                if (OpcionMoneda == 1) {
                    Precio = 70;
                    Resultado = (Cantidad2 * Precio) * PesoODolar;

                } else {
                    Precio = 70;
                    Resultado = (Cantidad2 * Precio);

                }
            }

            if ((OpcionMaterial == 1) && (OpcionDije == 0) && (OpcionTipo == 3)) {
                // Cantidad = Integer.parseInt(txtCantidad.getText().toString());
                if (OpcionMoneda == 1) {
                    Precio = 50;
                    Resultado = (Cantidad2 * Precio) * PesoODolar;

                } else {
                    Precio = 50;
                    Resultado = (Cantidad2 * Precio);

                }
            }

            if ((OpcionMaterial == 1) && (OpcionDije == 1) && (OpcionTipo == 0 || OpcionTipo == 1)) {
                //Cantidad = Integer.parseInt(txtCantidad.getText().toString());
                if (OpcionMoneda == 1) {
                    Precio = 110;
                    Resultado = (Cantidad2 * Precio) * PesoODolar;

                } else {
                    Precio = 110;
                    Resultado = (Cantidad2 * Precio);

                }
            }

            if ((OpcionMaterial == 1) && (OpcionDije == 1) && (OpcionTipo == 2)) {
                //Cantidad = Integer.parseInt(txtCantidad.getText().toString());
                if (OpcionMoneda == 1) {
                    Precio = 90;
                    Resultado = (Cantidad2 * Precio) * PesoODolar;

                } else {
                    Precio = 90;
                    Resultado = (Cantidad2 * Precio);

                }
            }

            if ((OpcionMaterial == 1) && (OpcionDije == 1) && (OpcionTipo == 3)) {
                //Cantidad = Integer.parseInt(txtCantidad.getText().toString());
                if (OpcionMoneda== 1) {
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


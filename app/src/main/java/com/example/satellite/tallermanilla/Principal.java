package com.example.satellite.tallermanilla;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    private Resources resources;
    private Spinner Materiales, Dijes, Tipos, Monedas;
    private EditText Cantidad;
    private String Mat [];
    private String Dij [];
    private String Tip [];
    private String Mone [];
    private TextView Valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Materiales = (Spinner) findViewById(R.id.CmbMaterial);
        Dijes = (Spinner) findViewById(R.id.CmbDije);
        Tipos = (Spinner) findViewById(R.id.CmbTipo);
        Monedas = (Spinner) findViewById(R.id.CmbMoneda);
        Valor = (TextView) findViewById(R.id.LblPrecio);
        Cantidad = (EditText) findViewById(R.id.txtCantidad);

        resources = this.getResources();

        Mat = resources.getStringArray(R.array.Materiales);
        Dij = resources.getStringArray(R.array.Dijes);
        Tip = resources.getStringArray(R.array.Tipos);
        Mone = resources.getStringArray(R.array.Monedas);

        ArrayAdapter<String> AdapterMateriales = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Mat);
        ArrayAdapter<String> AdapterDijes = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Dij);
        ArrayAdapter<String> AdapterTipos = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Tip);
        ArrayAdapter<String> AdapterMonedas = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Mone);

    }
    public boolean Validacion(){

        if (Cantidad.getText().toString().isEmpty()){
            Cantidad.setError(resources.getString(R.string.Error_uno));
            return false;
        }
        int Cantidad2 = Integer.parseInt(Cantidad.getText().toString());
        if (Cantidad2==0){
            Cantidad.setError(resources.getString(R.string.Error_dos));
            return false;
        }
        return true;
    }

    public void selected(View v) {

        if (Validacion()) {
            int OpcionMaterial, OpcionDije, OpcionTipo, OpcionMoneda, Cantidad2;
            double Precio, Resultado, PesoODolar = 0;
            OpcionMaterial = Materiales.getSelectedItemPosition();
            OpcionDije = Dijes.getSelectedItemPosition();
            OpcionTipo = Tipos.getSelectedItemPosition();
            OpcionMoneda = Monedas.getSelectedItemPosition();
            Cantidad2 = Integer.parseInt(Cantidad.getText().toString());

            Resultado = Metodos.calcular(Cantidad2, OpcionMaterial, OpcionDije, OpcionTipo, OpcionMoneda);

            Valor.setText("" + String.format("%.2f", Resultado));

        }
    }
}

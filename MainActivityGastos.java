package org.diarrea.gestiondegastos02;

import android.content.pm.ActivityInfo;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * OBJETIVOS DEL PROYECTO
 * - Utilizar varias activities. Comunicacion entre activities del mismo proyecto
 * - Menus
 * - Multilenguaje
 * - Acceso a datos de almacenamiento interno (propia App)
 * - Control ListView y Adapters
 * - RadioButton, Spinner...
 * - Modelado de entidades/objetos
 * - enviar fichero de gastos (csv) mail
 * - Cuadros de dialogo
 */

public class MainActivityGastos extends AppCompatActivity implements Button.OnClickListener {

    private EditText editTextAmgDescripcion, editTextAmgPrecio;
    private TextView textViewAmgFecha;
    private Spinner spinnerAmgGastosH;
    private RadioGroup radioGroupAmgFormaPago;
    private Button buttonAmgFecha;

    private static final String TAG = "MainActivityGastos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_gastos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        inicializarUI();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity_gastos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.menu_consultar) {
            return true;
        }
        if (id == R.id.menu_salir) {
            return true;
        }
        return super.onOptionsItemSelected(item);

    }
    private void inicializarUI() {
        //Bloquea el giro de pantalla PORTRAIT Vertical, LANDSCAPE Horizontal
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        editTextAmgDescripcion = (EditText) findViewById(R.id.editTextAmgDescripcion);
        editTextAmgPrecio = (EditText) findViewById(R.id.editTextAmgPrecio);

        textViewAmgFecha = (TextView) findViewById(R.id.textViewAmgFecha);
        textViewAmgFecha.setText(Utilidades.obtenerFecha());
        Log.i(TAG, Utilidades.obtenerFecha());

        spinnerAmgGastosH = (Spinner) findViewById(R.id.spinnerAmgGastosH);
        radioGroupAmgFormaPago = (RadioGroup) findViewById(R.id.radioGroupAmgFormaPago);

        buttonAmgFecha = (Button) findViewById(R.id.buttonAmgFecha);
        buttonAmgFecha.setOnClickListener(this); //Registrar el escuchador (evento click)..

    }

    @Override
    public void onClick(View view) {
        Utilidades.mostrarMensaje(getApplicationContext(), "Caraculo");
    }
}




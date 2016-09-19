package org.diarrea.gestiondegastos02;

import android.content.Context;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 * Created by alumne on 19/09/2016.
 */
public class Utilidades {


    public static void mostrarMensaje (Context context, String sms) {
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, sms, duration);
        toast.show();
    }

    public static String obtenerFecha () {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(Calendar.getInstance().getTime());
    }
}

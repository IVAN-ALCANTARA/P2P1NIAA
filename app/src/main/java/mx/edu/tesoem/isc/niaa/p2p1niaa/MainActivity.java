package mx.edu.tesoem.isc.niaa.p2p1niaa;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton risc, rtics, rambiental, rgast;
    CheckBox tcasa, tescuela, ttrabajo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        risc = (RadioButton) findViewById(R.id.rbisc);
        rtics = (RadioButton) findViewById(R.id.rbtics);
        rambiental = (RadioButton) findViewById(R.id.rbambiental);
        rgast = (RadioButton) findViewById(R.id.rbgast);

        tcasa=(CheckBox)findViewById(R.id.chcasa);
        tescuela=(CheckBox)findViewById(R.id.chescuela);
        ttrabajo=(CheckBox)findViewById(R.id.chtrabajo);

    }

    public void Seleccion (View view){
        if (risc.isChecked()) Toast.makeText(this, "Ingenieria en Sistemas Computacionales", Toast.LENGTH_SHORT).show();
        if (rtics.isChecked()) Toast.makeText(this, "Ingenieria en Tecnologias de la Informacion", Toast.LENGTH_SHORT).show();
        if (rambiental.isChecked()) Toast.makeText(this, "Ingenieria Ambiental", Toast.LENGTH_SHORT).show();
        if (rgast.isChecked()) Toast.makeText(this, "Licenciatura en Gastronomia", Toast.LENGTH_SHORT).show();
    }
    public void Check (View view){
        if (tcasa.isChecked()) Toast.makeText(this, "Internet en Casa", Toast.LENGTH_SHORT).show();
        if (ttrabajo.isChecked()) Toast.makeText(this, "Internet en Trabajo", Toast.LENGTH_SHORT).show();
        if (tescuela.isChecked()) Toast.makeText(this, "Internet en Escuela", Toast.LENGTH_SHORT).show();
    }
}


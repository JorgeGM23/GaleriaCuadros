package com.example.jorge.galeriacuadros;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Cuadro> listaCuadros;
    Button siguiente;
    Button anterior;
    Button info;
    ImageView ivImagenes;

    private int puntero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        siguiente = (Button)findViewById(R.id.btnSiguiente) ;
        anterior = (Button)findViewById(R.id.btnAnterior) ;
        info = (Button)findViewById(R.id.btnInformacion) ;
        ivImagenes = (ImageView)findViewById(R.id.ivImagenes);

        Cuadro gioconda = new Cuadro("La Gioconda", "Leonardo Da Vinci", "1503-1519" , "Renacentista", R.drawable.gioconda);
        Cuadro grito = new Cuadro("El grito", "Edvard Munch", "1893", "Expresionista", R.drawable.grito);
        Cuadro mujer = new Cuadro("La mujer que llora", "Pablo Picasso", "1937", "Cubismo", R.drawable.mujerquellora);
        Cuadro noche = new Cuadro("La noche estrellada", "Vincent van Gogh", "1889", "Post-Expresionista", R.drawable.nocheestrellada);

        listaCuadros= new ArrayList<Cuadro>();
        listaCuadros.add(gioconda);
        listaCuadros.add(grito);
        listaCuadros.add(mujer);
        listaCuadros.add(noche);

        puntero = 0;

        ivImagenes.setImageResource(listaCuadros.get(puntero).getImagen());
    }

    public void irSiguiente(View view) {
        puntero++;
        if (puntero == listaCuadros.size()) {
            puntero = 0;
            ivImagenes.setImageResource(listaCuadros.get(puntero).getImagen());
        }
        else {
            ivImagenes.setImageResource(listaCuadros.get(puntero).getImagen());
        }
    }

    public void irAnterior(View view) {
        if (puntero == 0) {
            puntero = listaCuadros.size() - 1;
            ivImagenes.setImageResource(listaCuadros.get(puntero).getImagen());
        }
        else {
            puntero--;
            ivImagenes.setImageResource(listaCuadros.get(puntero).getImagen());
        }
    }

    public void verInformacion(View view) {
        Intent i = new Intent(this, ActivityInformacion.class);
        Cuadro c = listaCuadros.get(puntero);
        i.putExtra("cuadro", (Serializable) c);
        startActivity(i);
    }
}

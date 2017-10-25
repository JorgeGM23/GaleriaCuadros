package com.example.jorge.galeriacuadros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityInformacion extends AppCompatActivity {

    private ImageView imageView;
    private TextView tvTitulo, tvAutor, tvFecha, tvEstilo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        imageView = (ImageView) findViewById(R.id.imageView);
        tvTitulo = (TextView)findViewById(R.id.tvTitulo);
        tvAutor = (TextView)findViewById(R.id.tvAutor);
        tvFecha = (TextView)findViewById(R.id.tvFecha);
        tvEstilo = (TextView)findViewById(R.id.tvEstilo);

        Cuadro cuadro = (Cuadro) getIntent().getExtras().getSerializable("cuadro");

        imageView.setImageResource(cuadro.getImagen());
        tvTitulo.setText(cuadro.getTitulo());
        tvAutor.setText(cuadro.getAutor());
        tvFecha.setText(cuadro.getFecha());
        tvEstilo.setText(cuadro.getEstilo());
    }
}

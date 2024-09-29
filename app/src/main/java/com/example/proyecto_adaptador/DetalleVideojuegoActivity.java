package com.example.proyecto_adaptador;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.proyecto_adaptador.clases.Videojuego;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

public class DetalleVideojuegoActivity extends AppCompatActivity {

    ImageView imgPortada;
    TextView txtNombreVideojuego, txtAñoVideojuego, txtDescripcionVideojuego;
    Button btnComprar, btnVolverInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_videojuego);


        imgPortada = findViewById(R.id.img_portada);
        txtNombreVideojuego = findViewById(R.id.txt_nombre_videojuego);
        txtAñoVideojuego = findViewById(R.id.txt_año_videojuego);
        txtDescripcionVideojuego = findViewById(R.id.txt_descripcion_videojuego);

        btnComprar = findViewById(R.id.btn_comprar);
        btnVolverInicio = findViewById(R.id.btn_volver_inicio);


        String videojuegoJson = getIntent().getExtras().getString("videojuego");
        Gson gson = new Gson();
        Videojuego videojuego = gson.fromJson(videojuegoJson, Videojuego.class);


        txtNombreVideojuego.setText(videojuego.getNombre());
        txtAñoVideojuego.setText(String.valueOf(videojuego.getAño()));
        txtDescripcionVideojuego.setText(videojuego.getDescripcion());


        Picasso.get().load(videojuego.getPortada()).into(imgPortada);


        btnVolverInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetalleVideojuegoActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
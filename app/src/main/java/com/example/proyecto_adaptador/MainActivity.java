package com.example.proyecto_adaptador;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyecto_adaptador.adaptadores.VideoJuegoAdaptador;
import com.example.proyecto_adaptador.clases.Videojuego;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcvVideojuegos;
    List<Videojuego> listaVideojuegos = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvVideojuegos = findViewById(R.id.rcvVideojuegos);

        // Usar un GridLayoutManager con 2 columnas
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        rcvVideojuegos.setLayoutManager(gridLayoutManager);

        // Agregar los videojuegos
        Videojuego vj1 = new Videojuego("https://zelda.nintendo.com/breath-of-the-wild/assets/media/wallpapers/tablet-1.jpg", "The Legend of Zelda", 2017, "Acción y aventura");
        Videojuego vj2 = new Videojuego("https://products.eneba.games/resized-products/6M1qP76B-j6vdX0T4bFCHgJeX99MaKBpXFxbpif1MqY_350x200_1x-0.jpeg", "Red Dead Redemption 2", 2018, "Acción y aventura");
        Videojuego vj3 = new Videojuego("https://products.eneba.games/resized-products/Dbdx7ihzJk48bASi_G0jHEgx2obfGYE_tNyWsjtJ4a4_350x200_1x-0.png", "Minecraft", 2011, "Sandbox");
        Videojuego vj4 = new Videojuego("https://products.eneba.games/resized-products/yqbnxszx6mnpg2ymfdsw_350x200_1x-0.jpg", "The Witcher 3: Wild Hunt", 2015, "RPG de mundo abierto");
        Videojuego vj5 = new Videojuego("https://products.eneba.games/resized-products/k-nbgm9aAQf-8B9C8QpbP3-C2EpYFORYEIaR6RQF9hY_350x200_1x-0.jpeg", "Fortnite", 2017, "Battle Royale");
        Videojuego vj6 = new Videojuego("https://products.eneba.games/resized-products/InlPQPt7WRDHBRnySANJHVQrS2whLdUdTX9JB7djmGw_350x200_1x-0.jpeg", "Among Us", 2018, "Party game");
        Videojuego vj7 = new Videojuego("https://img.redbull.com/images/c_fill,g_auto,w_450,h_600/q_auto:low,f_auto/redbullcom/2022/8/1/ksfga6rlx2ugfhjd9vnk/league-of-legends", "League of Legends", 2009, "MOBA");

        listaVideojuegos.add(vj1);
        listaVideojuegos.add(vj2);
        listaVideojuegos.add(vj3);
        listaVideojuegos.add(vj4);
        listaVideojuegos.add(vj5);
        listaVideojuegos.add(vj6);
        listaVideojuegos.add(vj7);


        rcvVideojuegos.setAdapter(new VideoJuegoAdaptador(listaVideojuegos,this));
    }
}

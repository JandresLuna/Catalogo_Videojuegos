package com.example.proyecto_adaptador.adaptadores;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyecto_adaptador.DetalleVideojuegoActivity;
import com.example.proyecto_adaptador.R;
import com.example.proyecto_adaptador.clases.Videojuego;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.util.List;

public class VideoJuegoAdaptador extends RecyclerView.Adapter<VideoJuegoAdaptador.ViewHolder> {

    private List<Videojuego> videojuegos;
    private Context context; //

    public VideoJuegoAdaptador(List<Videojuego> videojuegos, Context context) {
        this.videojuegos = videojuegos;
        this.context = context; //
    }

    @NonNull
    @Override
    public VideoJuegoAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_videojuego, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoJuegoAdaptador.ViewHolder holder, int position) {
        Videojuego videojuego = videojuegos.get(position);
        holder.bind(videojuego);
    }

    @Override
    public int getItemCount() {
        return videojuegos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView portada;
        TextView txt_nombre_videojuego, text_año_videojuego, text_descripcion_videojuego;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            portada = itemView.findViewById(R.id.portada);
            txt_nombre_videojuego = itemView.findViewById(R.id.txt_nombre_videojuego);
            text_año_videojuego = itemView.findViewById(R.id.text_año_videojuego);
            text_descripcion_videojuego = itemView.findViewById(R.id.text_descripcion_videojuego);
        }

        public void bind(final Videojuego videojuego) {

            txt_nombre_videojuego.setText(videojuego.getNombre());
            text_año_videojuego.setText(String.valueOf(videojuego.getAño()));
            text_descripcion_videojuego.setText(videojuego.getDescripcion());

            // Cargar la imagen con la librería Picasso
            Picasso.get().load(videojuego.getPortada()).into(portada);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Bundle b = new Bundle();
                    Gson gson = new Gson();
                    b.putString("videojuego", gson.toJson(videojuego));


                    Intent i = new Intent(itemView.getContext(), DetalleVideojuegoActivity.class);
                    i.putExtras(b);

                    itemView.getContext().startActivity(i);
                }
            });
        }
    }
}

package com.agustin.clase52;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AdapterLista extends ArrayAdapter<Item> {

    Context context;
    LayoutInflater inflater;
    ArrayList<Item> lista;

    public AdapterLista(@NonNull Context context, ArrayList<Item> lista, LayoutInflater inflater) {
        super(context, R.layout.item, lista);
        this.context = context;
        this.inflater = inflater;
        this.lista = lista;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;

        if(itemView == null) itemView = inflater.inflate(R.layout.item, parent, false);

            Item itemActual = lista.get(position);

            ImageView imagen = (ImageView) itemView.findViewById(R.id.imageItem);
            imagen.setImageResource(itemActual.getImagen());

            RatingBar ratingBar = (RatingBar) itemView.findViewById(R.id.ratingBar3);
            ratingBar.setNumStars(itemActual.getEstrellas());


        return itemView;
    }
}

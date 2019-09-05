package com.agustin.clase52;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Item> lista = new ArrayList<Item>();
    private ArrayAdapter<Item> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista.add(new Item(R.drawable.imagen1, 3));
        lista.add(new Item(R.drawable.imagen2, 5));
        lista.add(new Item(R.drawable.imagen3, 3));
        lista.add(new Item(R.drawable.imagen4, 1));
        lista.add(new Item(R.drawable.imagen5, 3));

        ListView lv = findViewById(R.id.mi_lista);
        adapter = new AdapterLista(this, lista, getLayoutInflater());
        lv.setAdapter(adapter);
    }

}

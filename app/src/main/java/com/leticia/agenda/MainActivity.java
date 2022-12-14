package com.leticia.agenda;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Lista de alunos");
        List<String> alunos = new ArrayList<>(
                Arrays.asList("Alex", "Fran", "Leticia", "Maria", "Ana"));

        ListView listaAlunos = findViewById(R.id.activity_main_lista_alunos);
        listaAlunos.setAdapter(
                new ArrayAdapter<>(
                        this, android.R.layout.simple_list_item_1, alunos)
        );
    }
}

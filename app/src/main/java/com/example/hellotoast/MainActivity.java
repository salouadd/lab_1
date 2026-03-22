package com.example.hellotoast;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // déclarer le compteur
    private int compteur = 0;
    private TextView textViewCompteur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // trouver les vues par leur id
        textViewCompteur = findViewById(R.id.textViewCompteur);
        Button boutonToast = findViewById(R.id.boutonToast);
        Button boutonIncrémenter = findViewById(R.id.boutonIncrémenter);

        //  bouton Toast
        boutonToast.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Bonjour Salah Eddine Bouaanane!", Toast.LENGTH_SHORT).show();
        });

        //  bouton Incrémenter
        boutonIncrémenter.setOnClickListener(v -> {
            compteur = compteur + 1;
            textViewCompteur.setText(String.valueOf(compteur));
        });
    }
}
package com.example.hellotoast;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int compteur = 0;
    private TextView textViewCompteur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Liaison des vues
        textViewCompteur = findViewById(R.id.textViewCompteur);
        EditText editTextNom = findViewById(R.id.editTextNom);
        Button boutonToast = findViewById(R.id.boutonToast);
        Button boutonToastNom = findViewById(R.id.boutonToastNom);
        Button boutonIncrémenter = findViewById(R.id.boutonIncrémenter);

        // Bouton Toast simple
        boutonToast.setOnClickListener(v -> {
            Toast.makeText(this, "Bonjour !", Toast.LENGTH_SHORT).show();
        });


        boutonToastNom.setOnClickListener(v -> {
            String nom = editTextNom.getText().toString();

            if (nom.isEmpty()) {
                editTextNom.setError("Entre ton nom d'abord !");
            } else {
                Toast.makeText(this, "Bonjour " + nom + " !", Toast.LENGTH_SHORT).show();
            }
        });

        // Bouton Incrémenter
        boutonIncrémenter.setOnClickListener(v -> {
            compteur++;
            textViewCompteur.setText(String.valueOf(compteur));
        });
    }
}
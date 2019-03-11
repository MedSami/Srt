package com.dhoha.srt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPrincipal extends AppCompatActivity {
Button btnMateriel,btnComposant,btnLogiciel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        btnComposant=findViewById(R.id.btnComposant);
        btnLogiciel=findViewById(R.id.btnLogeciel);
        btnMateriel=findViewById(R.id.btnMateriel);

        btnMateriel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MenuPrincipal.this,ListMateriel.class);
                startActivity(i);
            }
        });

        btnLogiciel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MenuPrincipal.this,ListLogiciel.class);
                startActivity(i);
            }
        });

        btnComposant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MenuPrincipal.this,ListComposant.class);
                startActivity(i);
            }
        });

    }
}

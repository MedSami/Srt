package com.dhoha.srt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MaterielDescription extends AppCompatActivity {
TextView txtRef,txtNom,txtFormat,txtMarque,txtType;
String reference,nom_m,format,marque,type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materiel_description);
        txtRef=findViewById(R.id.txtRef);
        txtNom=findViewById(R.id.txtNomMateriel);
        txtFormat=findViewById(R.id.txtFormat);
        txtMarque=findViewById(R.id.txtMarque);
        txtType=findViewById(R.id.txtType);
        Bundle data=getIntent().getExtras();
        if(data!= null){
            reference=data.getString("reference");
            nom_m=data.getString("nom_m");
            format=data.getString("format_m");
            marque=data.getString("marque");
            type=data.getString("type_m");
            txtRef.setText(reference);
            txtNom.setText(nom_m);
            txtFormat.setText(format);
            txtMarque.setText(marque);
            txtType.setText(type);
        }

    }
}

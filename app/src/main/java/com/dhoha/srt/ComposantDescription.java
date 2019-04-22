package com.dhoha.srt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ComposantDescription extends AppCompatActivity {
String reference,marque,lib,etat;
TextView txtEtat,txtMarque,txtLib,txtRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_composant_description);
        txtEtat=findViewById(R.id.txtEtat);
        txtMarque=findViewById(R.id.txtMarque);
        txtLib=findViewById(R.id.txtLib);
        txtRef=findViewById(R.id.txtRef);
    Bundle data=getIntent().getExtras();
    if(data!=null){
        reference=data.getString("Ref");
        lib=data.getString("Lib");
        etat=data.getString("Etat");
        marque=data.getString("Marque");
        txtEtat.setText(etat);
        txtLib.setText(lib);
        txtMarque.setText(marque);
        txtRef.setText(reference);
    }

    }
}

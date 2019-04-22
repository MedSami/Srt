package com.dhoha.srt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LogecielDescription extends AppCompatActivity {
String Ref,nomLog,typeLog,versionLog,licence;
TextView txtRef,txtNomLog,txtTypeLog,txtVersionLog,txtLicence;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logeciel_description);
        txtLicence=findViewById(R.id.txtLicence);
        txtVersionLog=findViewById(R.id.txtVersion);
        txtTypeLog=findViewById(R.id.txtTypeLog);
        txtNomLog=findViewById(R.id.txtNomLog);
        txtRef=findViewById(R.id.txtRef);
        Bundle data=getIntent().getExtras();
        if(data!=null){
            Ref=data.getString("reference");
            nomLog=data.getString("nom_log");
            typeLog=data.getString("type_log");
            versionLog=data.getString("version_log");
            licence=data.getString("licence");
            txtRef.setText(Ref);
            txtNomLog.setText(nomLog);
            txtTypeLog.setText(typeLog);
            txtVersionLog.setText(versionLog);
            txtLicence.setText(licence);
        }
    }
}

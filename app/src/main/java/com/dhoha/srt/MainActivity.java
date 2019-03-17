package com.dhoha.srt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.dhoha.srt.API.ApiRequest;
import com.dhoha.srt.API.RetrofitService;
import com.dhoha.srt.model.ResponseDataModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
Button btnentrer;
EditText edtEmail,edtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    btnentrer=findViewById(R.id.btnEntrer);
    edtEmail=findViewById(R.id.edtMail);
    edtPassword=findViewById(R.id.edtPassword);


    btnentrer.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (edtEmail.getText().toString().equals("")){
                Toast.makeText(MainActivity.this, "Saisir votre Email SVP", Toast.LENGTH_SHORT).show();
            }else if(edtPassword.getText().toString().equals("")){
                Toast.makeText(MainActivity.this, "Saisir Mot De Passe SVP", Toast.LENGTH_SHORT).show();
            }else {

                ApiRequest api= RetrofitService.getClient().create(ApiRequest.class);
                //Instance Call Methode
                Call<ResponseDataModel> Login=api.Login(edtEmail.getText().toString());
            Login.enqueue(new Callback<ResponseDataModel>() {
                @Override
                public void onResponse(Call<ResponseDataModel> call, Response<ResponseDataModel> response) {
                    if(response.isSuccessful()){
                        if(!response.body().getResult().isEmpty()) {
                            if (response.body().getResult().get(0).getEmail().equals(edtEmail.getText().toString())) {
                                if (response.body().getResult().get(0).getMotDePasse().equals(edtPassword.getText().toString())) {

                                    Intent intent = new Intent(MainActivity.this, MenuPrincipal.class);
                                    startActivity(intent);

                                } else {
                                    Toast.makeText(MainActivity.this, "Mot De Passe Incorrect", Toast.LENGTH_SHORT).show();
                                }
                            } else {
                                Toast.makeText(MainActivity.this, "Email Incorrect", Toast.LENGTH_SHORT).show();

                            }
                        }else {
                                Toast.makeText(MainActivity.this, "Email Incorrect", Toast.LENGTH_SHORT).show();

                            }
                    }else {
                        Toast.makeText(MainActivity.this, "Email Incorrect", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(Call<ResponseDataModel> call, Throwable t) {
                    Toast.makeText(MainActivity.this, "Problem Connexion", Toast.LENGTH_SHORT).show();
                }
            });

            }
        }
    });

    }
}

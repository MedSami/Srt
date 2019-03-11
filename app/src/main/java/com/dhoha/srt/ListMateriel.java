package com.dhoha.srt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.dhoha.srt.API.ApiRequest;
import com.dhoha.srt.API.RetrofitService;
import com.dhoha.srt.Adapter.MaterielAdapter;
import com.dhoha.srt.model.DataModel;
import com.dhoha.srt.model.ResponseDataModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListMateriel extends AppCompatActivity {
    private RecyclerView RecycleLayout;
    private RecyclerView.LayoutManager RecycleManager;
    private RecyclerView.Adapter materielAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_materiel);
        RecycleLayout = findViewById(R.id.recyclerview);
        ApiRequest api = RetrofitService.getClient().create(ApiRequest.class);
        Call<ResponseDataModel> getMateriels=api.getMateriels();

    getMateriels.enqueue(new Callback<ResponseDataModel>() {
        @Override
        public void onResponse(Call<ResponseDataModel> call, Response<ResponseDataModel> response) {
            String code = response.body().getCode();
            List<DataModel> item = response.body().getResult();
            if (code.equals("1")) {
                RecycleManager = new LinearLayoutManager(ListMateriel.this, LinearLayoutManager.VERTICAL, false);

                RecycleLayout.setLayoutManager(RecycleManager);

                materielAdapter = new MaterielAdapter(item, ListMateriel.this);

                RecycleLayout.setAdapter(materielAdapter);
            }
        }

        @Override
        public void onFailure(Call<ResponseDataModel> call, Throwable t) {
            Toast.makeText(ListMateriel.this, "Problem Connexion", Toast.LENGTH_SHORT).show();
        }
    });
    }
}

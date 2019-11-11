package com.example.apigobierno.vistas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.apigobierno.model.Municipio;
import com.example.apigobierno.model.Resultado;
import com.example.apigobierno.request.ApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainViewModel extends ViewModel {
    private MutableLiveData<String> lista;

    public LiveData<String> getLista(){
        if(lista==null){
            lista = new MutableLiveData<>();
        }
        return lista;
    }

    public void buscarVM(String prov){
        Call<Resultado> datos = ApiClient.getMyApiInterface().leer(prov);
        datos.enqueue(new Callback<Resultado>() {
            @Override
            public void onResponse(Call<Resultado> call, Response<Resultado> response) {
                if(response.isSuccessful()){
                    Resultado resultado = response.body();
                    StringBuffer cadena = new StringBuffer();

                    for(Municipio it: resultado.getMunicipios()){
                        cadena.append(it.getNombre()+"\n");
                    }

                    lista.postValue(cadena.toString());
                }
            }

            @Override
            public void onFailure(Call<Resultado> call, Throwable t) {
                lista.postValue(t.getMessage());
            }
        });
    }
}

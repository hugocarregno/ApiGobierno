package com.example.apigobierno.request;

import android.util.Log;

import com.example.apigobierno.model.Resultado;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class ApiClient {
    private static final String PATH="https://apis.datos.gob.ar/georef/api/";
    private static MyApiInterface myApiInterface;

    public static MyApiInterface getMyApiInterface(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(PATH)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        //Log.d("mensaje",retrofit.baseUrl().toString());
        myApiInterface= retrofit.create(MyApiInterface.class);
        return myApiInterface;
    }

    public interface MyApiInterface{
        String prov = "74";
        //@GET("municipios?provincia="+prov)
        @GET("municipios")
        Call<Resultado> leer(@Query("provincia") String prov);

    }
}

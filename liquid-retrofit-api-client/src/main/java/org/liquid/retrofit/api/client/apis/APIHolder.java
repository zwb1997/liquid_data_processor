package org.liquid.retrofit.api.client.apis;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIHolder {
    private static final String BASE_URL = "http://localhost:8080/api/";
    private static final OkHttpClient CLIENT = new OkHttpClient.Builder().build();
    private static final Retrofit RETO = new Retrofit
            .Builder()
            .client(CLIENT)
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    public static Retrofit getCLIENT() {
        return RETO;
    }
}

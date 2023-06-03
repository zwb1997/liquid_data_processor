package org.liquid.retrofit.api.client.apis;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface RetroApis {

    @GET("api/getstring")
    Call<List<String>> getStrings();
}

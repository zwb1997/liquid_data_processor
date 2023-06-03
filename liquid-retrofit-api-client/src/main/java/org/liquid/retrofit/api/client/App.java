package org.liquid.retrofit.api.client;

import lombok.extern.slf4j.Slf4j;
import org.liquid.retrofit.api.client.apis.APIHolder;
import org.liquid.retrofit.api.client.apis.RetroApis;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 */
@Slf4j
public class App {
    private static final String ROOT_API = "http://localhost:8080/api";

    public static void main(String[] args) {
        System.setProperty("illegal-access", "deny");
        RetroApis apis = APIHolder.getCLIENT().create(RetroApis.class);
        try {
            Response<List<String>> response = apis.getStrings().execute();
            String resStr = response.toString();
            List<String> resListString = response.body();
            log.info("call result -> [{}]", resStr);
            log.info("call result body str -> [{}]", resListString);
        } catch (IOException e) {
            log.error("cannot call api", e);
        }
    }
}

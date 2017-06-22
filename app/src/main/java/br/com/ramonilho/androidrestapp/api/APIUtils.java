package br.com.ramonilho.androidrestapp.api;

/**
 * Created by logonrm on 21/06/2017.
 */

public class APIUtils {
    private APIUtils() {}

    public static final String BASE_URL = "http://www.mocky.io";

    public static AndroidAPI getAndroidAPIVersion() {
        return RetrofitClient.getClient(BASE_URL).create(AndroidAPI.class);
    }
}

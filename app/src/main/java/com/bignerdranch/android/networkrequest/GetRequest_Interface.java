package com.bignerdranch.android.networkrequest;

import retrofit2.Call;
import retrofit2.http.GET;

public class GetRequest_Interface {
    @GET("ajax.php?a=fy&f=auto&t=auto&w=hello%20world")
    Call<Translation> getCall() {
        return null;
    }

}

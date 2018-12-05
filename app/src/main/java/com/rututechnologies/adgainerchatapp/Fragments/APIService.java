package com.rututechnologies.adgainerchatapp.Fragments;

import com.rututechnologies.adgainerchatapp.Notifications.MyResponse;
import com.rututechnologies.adgainerchatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAA4Y6Nw0s:APA91bHqTAJnaZvK0iNsBSvdZFpYkwDb1J1iSPDnv-YNbSY7nYi22RJJ-eLiNck3dwnIdZ9b9TFaF9bgXaV46IGFzj44uwdQJX_td1yx7_imw1MlabbZjPXBKUlSyKawD-ZlnT94ALob"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}

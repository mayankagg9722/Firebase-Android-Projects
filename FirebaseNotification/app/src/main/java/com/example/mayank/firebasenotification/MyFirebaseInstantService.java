package com.example.mayank.firebasenotification;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by mayank on 04-08-2016.
 */
public class MyFirebaseInstantService extends FirebaseInstanceIdService {

    public static final String token="token";
    @Override
    public void onTokenRefresh() {
        Log.v(token, FirebaseInstanceId.getInstance().getToken().toString());
    }
}

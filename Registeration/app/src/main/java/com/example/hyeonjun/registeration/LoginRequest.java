package com.example.hyeonjun.registeration;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 최현준 on 2019-01-29.
 */

public class LoginRequest extends StringRequest {
    final static private String URL = "http://guswns3563.cafe24.com/UserLogin.php";
    private Map<String, String> parameters;

    public LoginRequest(String userID, String userPassword, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);
        parameters = new HashMap<>();
        parameters.put("userID",userID);
        parameters.put("userPassword",userPassword);
    }
    @Override
    public  Map<String, String>getParams(){
        return parameters;
    }
}

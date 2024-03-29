package com.shavi.shoppoint.networksync;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shavi on 12/17/17.
 */

public class LoginRequest extends StringRequest {

  private static final String LOGIN_URL = "http://www.shavishop.dx.am/login.php"; //awardspace.com //https://cp1.awardspace.net/
    private Map<String, String> parameters;

    public LoginRequest(String email, String password, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(Method.POST, LOGIN_URL, listener, errorListener);
        parameters = new HashMap<>();
        parameters.put("email", email);
        parameters.put("password", password);  //shavi@123
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return parameters;
    }
}
/*
 * Copyright (C) 2015 Maros Cavojsky, (mpage.sk)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sk.mpage.androidsample.drawerwithauthenticator.authentication;

import android.content.Context;

import com.google.gson.Gson;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.Serializable;

public class MyAuthServer implements ServerAuthenticate {

    private final static String REST_API_KEY = "";
    private final static String SERVER_URL = "";

    @Override
    public User userSignIn(String email, String pass, String authType, Context context) throws Exception {

        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost(SERVER_URL);
        httpPost.addHeader("Content-Type", "application/json");

        UserReq userReq = new UserReq(REST_API_KEY, email, pass);
        String user = new Gson().toJson(userReq);

        //for security reasons it will be good to encrypt or hash users email and password;

        httpPost.addHeader("X-MPAGE-Data", user);

        try {
            //HttpResponse response = httpClient.execute(httpPost);
            //String responseString = EntityUtils.toString(response.getEntity());
//
//            if (response.getStatusLine().getStatusCode() != HttpURLConnection.HTTP_OK) {
//                COhaveEuError error = new Gson().fromJson(responseString, COhaveEuError.class);
//                throw new Exception("Error during log in [" + error.code + "] - " + error.error);
//            }
//
//            User createdUser = new Gson().fromJson(responseString, User.class);


            return new User(1, email, "John", "Doe", email, "gg54434cDG");
        } catch (com.google.gson.JsonIOException ex) {
            ex.printStackTrace();
            throw new Exception("Wrong answer from server. Try again later. (ERR124)");
        } catch (com.google.gson.JsonSyntaxException ex) {
            ex.printStackTrace();
            throw new Exception("Wrong answer from server. Try again later. (ERR125)");
        }
//        catch (IOException e) {
//            e.printStackTrace();
//            throw new Exception("Chyba pri spojeni so serverom. Skontrolujte internetove pripojenie. (ERR123)");
//        }

    }

    public static class COhaveEuError implements Serializable {
        public int code;
        public String error;
        public String random;
    }
}

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


import java.io.Serializable;


public class User implements Serializable {
    private int user_id;
    private String email;
    private String first_name;
    private String last_name;
    private String username;
    private String session_token;

    public static String user_id_field = "user_id";
    public static String email_field = "email";
    public static String first_name_field = "first_name";
    public static String last_name_field = "last_name";
    public static String username_field = "username";
    public static String session_token_field = "session_token";

    public User() {
        this.user_id = 0;
        this.email = "";
        this.first_name = "";
        this.last_name = "";
        this.username = "";
        this.session_token = "";
    }

    public User(int user_id, String email, String first_name, String last_name, String username, String session_token) {
        this.user_id = user_id;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.session_token = session_token;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getSession_token() {
        return session_token;
    }

    public void setSession_token(String session_token) {
        this.session_token = session_token;
    }


    public String getUsername() {
        return username;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getEmail() {
        return email;
    }
}

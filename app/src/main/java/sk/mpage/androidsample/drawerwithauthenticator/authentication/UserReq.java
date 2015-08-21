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


public class UserReq implements Serializable {
    public String api_key;
    public String email;
    public String password;

    public UserReq(String api_key, String email, String password) {
        this.api_key = api_key;
        this.email = email;
        this.password = password;
    }

}

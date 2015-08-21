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


public class AccountGeneral {

    /**
     * Account type id
     */
    public static final String ACCOUNT_TYPE = "sk.mpage.androidsample";

    /**
     * Account type
     */
    public static final String ACCOUNT_NAME = "sampleAccount";

    /**
     * User data fields
     */
    public static final String USERDATA_USER_OBJ_ID = "userObjectId";

    /**
     * Auth token types
     */
    public static final String AUTHTOKEN_TYPE_FULL_ACCESS = "full-access";
    public static final String AUTHTOKEN_TYPE_FULL_ACCESS_LABEL = "Full access";

    public static final ServerAuthenticate sServerAuthenticate = new MyAuthServer();

}

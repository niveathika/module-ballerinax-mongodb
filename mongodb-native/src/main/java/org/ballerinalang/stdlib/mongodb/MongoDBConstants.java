// Copyright (c) 2020 WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
//
// WSO2 Inc. licenses this file to you under the Apache License,
// Version 2.0 (the "License"); you may not use this file except
// in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.ballerinalang.stdlib.mongodb;

import org.ballerinalang.jvm.types.BPackage;

/**
 * Constants used in the module-mongodb.
 */
public class MongoDBConstants {
    public static final BPackage BAL_PACKAGE = new BPackage("ballerinax", "mongodb", "2.0.0");

    /**
     * Constants related to `mongodb:DatabaseError`.
     */
    public static final class DatabaseError {
        public static final String NAME = "DatabaseError";
        public static final String DETAIL_RECORD_NAME = "DatabaseErrorDetail";
        public static final String DETAIL_FIELD_MONGODB_EXCEPTION = "mongoDBExceptionType";
    }
    //Error reasons
    public static final String APPLICATION_ERROR = "ApplicationError";

    public static final String EMPTY_JSON = "{}";
}

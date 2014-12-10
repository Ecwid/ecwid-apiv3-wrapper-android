/*
Licensed to the Apache Software Foundation (ASF) under one or more
contributor license agreements.  See the NOTICE file distributed with
this work for additional information regarding copyright ownership.
The ASF licenses this file to You under the Apache License, Version 2.0
(the "License"); you may not use this file except in compliance with
the License.  You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package api.model;
import java.util.*;
import org.json.*;
import api.util.*;

public class AccountInfo {
    private JSONObject object;
    public AccountInfo() { object = new JSONObject(); }
    public AccountInfo(JSONObject json) { object = json; }


    public String getAccountName() {
        Object val = object.opt("accountName");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setAccountName(String val) {
        try {
            object.put("accountName", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getAccountNickName() {
        Object val = object.opt("accountNickName");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setAccountNickName(String val) {
        try {
            object.put("accountNickName", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getAccountEmail() {
        Object val = object.opt("accountEmail");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setAccountEmail(String val) {
        try {
            object.put("accountEmail", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public List<String> getAvailableFeatures() {
        Object val = object.opt("availableFeatures");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<String>((JSONArray) val) {
            protected String read(Object val) {
                return JsonUtil.asString(val);
            }

            protected Object write(String val) {
                return JsonUtil.asJsonSingleton(val);
            }
        };
    }

    public void setAvailableFeatures(List<String> val) {
        try {
            object.put("availableFeatures", JsonUtil.asJsonArray(val, new JsonElementFactory<String>() {
                public Object json(String val) {
                    return JsonUtil.asJsonSingleton(val);
                }
            }));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }

    public JSONObject asJson() {
        return object;
    }

    public boolean hasProp(String key) {
        return object.has(key);
    }

    public String toString() { return object.toString(); }

    public int hashCode() { return object.hashCode(); }

    public boolean equals(Object o) {
        if (!(o instanceof AccountInfo)) return false;
        return object.equals(((AccountInfo)o).object);
    }
}
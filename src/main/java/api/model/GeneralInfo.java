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

public class GeneralInfo {
    private JSONObject object;
    public GeneralInfo() { object = new JSONObject(); }
    public GeneralInfo(JSONObject json) { object = json; }


    public Number getStoreId() {
        Object val = object.opt("storeId");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setStoreId(Number val) {
        try {
            object.put("storeId", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getStoreUrl() {
        Object val = object.opt("storeUrl");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setStoreUrl(String val) {
        try {
            object.put("storeUrl", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public StarterSite getStarterSite() {
        Object val = object.opt("starterSite");
        return val == null ? null : val == JSONObject.NULL ? null : new StarterSite((JSONObject) val);
    }

    public void setStarterSite(StarterSite val) {
        try {
            object.put("starterSite", val == null ? JSONObject.NULL : val.asJson());
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
        if (!(o instanceof GeneralInfo)) return false;
        return object.equals(((GeneralInfo)o).object);
    }
}
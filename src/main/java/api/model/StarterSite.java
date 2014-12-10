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

public class StarterSite {
    private JSONObject object;
    public StarterSite() { object = new JSONObject(); }
    public StarterSite(JSONObject json) { object = json; }


    public String getEcwidSubdomain() {
        Object val = object.opt("ecwidSubdomain");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setEcwidSubdomain(String val) {
        try {
            object.put("ecwidSubdomain", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getCustomDomain() {
        Object val = object.opt("customDomain");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setCustomDomain(String val) {
        try {
            object.put("customDomain", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getGeneratedUrl() {
        Object val = object.opt("generatedUrl");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setGeneratedUrl(String val) {
        try {
            object.put("generatedUrl", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getStoreLogoUrl() {
        Object val = object.opt("storeLogoUrl");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setStoreLogoUrl(String val) {
        try {
            object.put("storeLogoUrl", JsonUtil.asJsonSingleton(val));
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
        if (!(o instanceof StarterSite)) return false;
        return object.equals(((StarterSite)o).object);
    }
}
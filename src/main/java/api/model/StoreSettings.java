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

public class StoreSettings {
    private JSONObject object;
    public StoreSettings() { object = new JSONObject(); }
    public StoreSettings(JSONObject json) { object = json; }


    public Boolean getClosed() {
        Object val = object.opt("closed");
        return val == null ? null : JsonUtil.asBoolean(val);
    }

    public void setClosed(Boolean val) {
        try {
            object.put("closed", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getStoreName() {
        Object val = object.opt("storeName");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setStoreName(String val) {
        try {
            object.put("storeName", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getInvoiceLogoUrl() {
        Object val = object.opt("invoiceLogoUrl");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setInvoiceLogoUrl(String val) {
        try {
            object.put("invoiceLogoUrl", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getEmailLogoUrl() {
        Object val = object.opt("emailLogoUrl");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setEmailLogoUrl(String val) {
        try {
            object.put("emailLogoUrl", JsonUtil.asJsonSingleton(val));
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
        if (!(o instanceof StoreSettings)) return false;
        return object.equals(((StoreSettings)o).object);
    }
}
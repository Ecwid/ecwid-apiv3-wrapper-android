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

public class OrderItemProductFile {
    private JSONObject object;
    public OrderItemProductFile() { object = new JSONObject(); }
    public OrderItemProductFile(JSONObject json) { object = json; }


    public Number getProductFileId() {
        Object val = object.opt("productFileId");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setProductFileId(Number val) {
        try {
            object.put("productFileId", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getMaxDownloads() {
        Object val = object.opt("maxDownloads");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setMaxDownloads(Number val) {
        try {
            object.put("maxDownloads", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getRemainingDownloads() {
        Object val = object.opt("remainingDownloads");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setRemainingDownloads(Number val) {
        try {
            object.put("remainingDownloads", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getExpire() {
        Object val = object.opt("expire");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setExpire(String val) {
        try {
            object.put("expire", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getName() {
        Object val = object.opt("name");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setName(String val) {
        try {
            object.put("name", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getDescription() {
        Object val = object.opt("description");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setDescription(String val) {
        try {
            object.put("description", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getSize() {
        Object val = object.opt("size");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setSize(Number val) {
        try {
            object.put("size", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getAdminUrl() {
        Object val = object.opt("adminUrl");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setAdminUrl(String val) {
        try {
            object.put("adminUrl", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getCustomerUrl() {
        Object val = object.opt("customerUrl");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setCustomerUrl(String val) {
        try {
            object.put("customerUrl", JsonUtil.asJsonSingleton(val));
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
        if (!(o instanceof OrderItemProductFile)) return false;
        return object.equals(((OrderItemProductFile)o).object);
    }
}
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

public class FileKeys {
    private JSONObject object;
    public FileKeys() { object = new JSONObject(); }
    public FileKeys(JSONObject json) { object = json; }


    public Number getId() {
        Object val = object.opt("id");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setId(Number val) {
        try {
            object.put("id", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getKey() {
        Object val = object.opt("key");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setKey(String val) {
        try {
            object.put("key", JsonUtil.asJsonSingleton(val));
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


    public Number getLastLinkGenerate() {
        Object val = object.opt("lastLinkGenerate");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setLastLinkGenerate(Number val) {
        try {
            object.put("lastLinkGenerate", JsonUtil.asJsonSingleton(val));
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


    public ProductFile getProductFile() {
        Object val = object.opt("productFile");
        return val == null ? null : val == JSONObject.NULL ? null : new ProductFile((JSONObject) val);
    }

    public void setProductFile(ProductFile val) {
        try {
            object.put("productFile", val == null ? JSONObject.NULL : val.asJson());
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
        if (!(o instanceof FileKeys)) return false;
        return object.equals(((FileKeys)o).object);
    }
}
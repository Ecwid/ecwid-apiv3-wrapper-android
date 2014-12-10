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

public class RelatedCategory {
    private JSONObject object;
    public RelatedCategory() { object = new JSONObject(); }
    public RelatedCategory(JSONObject json) { object = json; }


    public Boolean getEnabled() {
        Object val = object.opt("enabled");
        return val == null ? null : JsonUtil.asBoolean(val);
    }

    public void setEnabled(Boolean val) {
        try {
            object.put("enabled", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getCategoryId() {
        Object val = object.opt("categoryId");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setCategoryId(Number val) {
        try {
            object.put("categoryId", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getProductCount() {
        Object val = object.opt("productCount");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setProductCount(Number val) {
        try {
            object.put("productCount", JsonUtil.asJsonSingleton(val));
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
        if (!(o instanceof RelatedCategory)) return false;
        return object.equals(((RelatedCategory)o).object);
    }
}
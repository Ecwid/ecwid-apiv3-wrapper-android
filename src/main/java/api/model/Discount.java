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

public class Discount {
    private JSONObject object;
    public Discount() { object = new JSONObject(); }
    public Discount(JSONObject json) { object = json; }


    public Number getValue() {
        Object val = object.opt("value");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setValue(Number val) {
        try {
            object.put("value", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getType() {
        Object val = object.opt("type");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setType(String val) {
        try {
            object.put("type", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getBase() {
        Object val = object.opt("base");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setBase(String val) {
        try {
            object.put("base", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getOrderTotal() {
        Object val = object.opt("orderTotal");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setOrderTotal(Number val) {
        try {
            object.put("orderTotal", JsonUtil.asJsonSingleton(val));
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
        if (!(o instanceof Discount)) return false;
        return object.equals(((Discount)o).object);
    }
}
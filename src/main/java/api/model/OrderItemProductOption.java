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

public class OrderItemProductOption {
    private JSONObject object;
    public OrderItemProductOption() { object = new JSONObject(); }
    public OrderItemProductOption(JSONObject json) { object = json; }


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


    public String getValue() {
        Object val = object.opt("value");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setValue(String val) {
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


    public List<OrderItemOptionFile> getFiles() {
        Object val = object.opt("files");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<OrderItemOptionFile>((JSONArray) val) {
            protected OrderItemOptionFile read(Object val) {
                return val == JSONObject.NULL ? null : new OrderItemOptionFile((JSONObject) val);
            }

            protected Object write(OrderItemOptionFile val) {
                return val == null ? JSONObject.NULL : val.asJson();
            }
        };
    }

    public void setFiles(List<OrderItemOptionFile> val) {
        try {
            object.put("files", JsonUtil.asJsonArray(val, new JsonElementFactory<OrderItemOptionFile>() {
                public Object json(OrderItemOptionFile val) {
                    return val == null ? JSONObject.NULL : val.asJson();
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
        if (!(o instanceof OrderItemProductOption)) return false;
        return object.equals(((OrderItemProductOption)o).object);
    }
}
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

public class ProductOption {
    private JSONObject object;
    public ProductOption() { object = new JSONObject(); }
    public ProductOption(JSONObject json) { object = json; }


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


    public List<ProductOptionChoice> getChoices() {
        Object val = object.opt("choices");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<ProductOptionChoice>((JSONArray) val) {
            protected ProductOptionChoice read(Object val) {
                return val == JSONObject.NULL ? null : new ProductOptionChoice((JSONObject) val);
            }

            protected Object write(ProductOptionChoice val) {
                return val == null ? JSONObject.NULL : val.asJson();
            }
        };
    }

    public void setChoices(List<ProductOptionChoice> val) {
        try {
            object.put("choices", JsonUtil.asJsonArray(val, new JsonElementFactory<ProductOptionChoice>() {
                public Object json(ProductOptionChoice val) {
                    return val == null ? JSONObject.NULL : val.asJson();
                }
            }));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getDefaultChoice() {
        Object val = object.opt("defaultChoice");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setDefaultChoice(Number val) {
        try {
            object.put("defaultChoice", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Boolean getRequired() {
        Object val = object.opt("required");
        return val == null ? null : JsonUtil.asBoolean(val);
    }

    public void setRequired(Boolean val) {
        try {
            object.put("required", JsonUtil.asJsonSingleton(val));
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
        if (!(o instanceof ProductOption)) return false;
        return object.equals(((ProductOption)o).object);
    }
}
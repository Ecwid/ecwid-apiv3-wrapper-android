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

public class DiscountCouponCatalogLimit {
    private JSONObject object;
    public DiscountCouponCatalogLimit() { object = new JSONObject(); }
    public DiscountCouponCatalogLimit(JSONObject json) { object = json; }


    public List<Number> getProducts() {
        Object val = object.opt("products");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<Number>((JSONArray) val) {
            protected Number read(Object val) {
                return JsonUtil.asNumber(val);
            }

            protected Object write(Number val) {
                return JsonUtil.asJsonSingleton(val);
            }
        };
    }

    public void setProducts(List<Number> val) {
        try {
            object.put("products", JsonUtil.asJsonArray(val, new JsonElementFactory<Number>() {
                public Object json(Number val) {
                    return JsonUtil.asJsonSingleton(val);
                }
            }));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public List<Number> getCategories() {
        Object val = object.opt("categories");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<Number>((JSONArray) val) {
            protected Number read(Object val) {
                return JsonUtil.asNumber(val);
            }

            protected Object write(Number val) {
                return JsonUtil.asJsonSingleton(val);
            }
        };
    }

    public void setCategories(List<Number> val) {
        try {
            object.put("categories", JsonUtil.asJsonArray(val, new JsonElementFactory<Number>() {
                public Object json(Number val) {
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
        if (!(o instanceof DiscountCouponCatalogLimit)) return false;
        return object.equals(((DiscountCouponCatalogLimit)o).object);
    }
}
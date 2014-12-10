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

public class SearchResult {
    private JSONObject object;
    public SearchResult() { object = new JSONObject(); }
    public SearchResult(JSONObject json) { object = json; }


    public Number getAllProducts() {
        Object val = object.opt("allProducts");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setAllProducts(Number val) {
        try {
            object.put("allProducts", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public List<ProductEntry> getProducts() {
        Object val = object.opt("products");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<ProductEntry>((JSONArray) val) {
            protected ProductEntry read(Object val) {
                return val == JSONObject.NULL ? null : new ProductEntry((JSONObject) val);
            }

            protected Object write(ProductEntry val) {
                return val == null ? JSONObject.NULL : val.asJson();
            }
        };
    }

    public void setProducts(List<ProductEntry> val) {
        try {
            object.put("products", JsonUtil.asJsonArray(val, new JsonElementFactory<ProductEntry>() {
                public Object json(ProductEntry val) {
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
        if (!(o instanceof SearchResult)) return false;
        return object.equals(((SearchResult)o).object);
    }
}
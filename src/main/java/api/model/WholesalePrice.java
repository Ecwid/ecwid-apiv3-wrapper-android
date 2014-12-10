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

public class WholesalePrice {
    private JSONObject object;
    public WholesalePrice() { object = new JSONObject(); }
    public WholesalePrice(JSONObject json) { object = json; }


    public Number getQuantity() {
        Object val = object.opt("quantity");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setQuantity(Number val) {
        try {
            object.put("quantity", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getPrice() {
        Object val = object.opt("price");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setPrice(Number val) {
        try {
            object.put("price", JsonUtil.asJsonSingleton(val));
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
        if (!(o instanceof WholesalePrice)) return false;
        return object.equals(((WholesalePrice)o).object);
    }
}
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

public class ShippingOption {
    private JSONObject object;
    public ShippingOption() { object = new JSONObject(); }
    public ShippingOption(JSONObject json) { object = json; }


    public String getShippingCarrierName() {
        Object val = object.opt("shippingCarrierName");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setShippingCarrierName(String val) {
        try {
            object.put("shippingCarrierName", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getShippingMethodName() {
        Object val = object.opt("shippingMethodName");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setShippingMethodName(String val) {
        try {
            object.put("shippingMethodName", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getShippingRate() {
        Object val = object.opt("shippingRate");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setShippingRate(Number val) {
        try {
            object.put("shippingRate", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getEstimatedTransitTime() {
        Object val = object.opt("estimatedTransitTime");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setEstimatedTransitTime(String val) {
        try {
            object.put("estimatedTransitTime", JsonUtil.asJsonSingleton(val));
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
        if (!(o instanceof ShippingOption)) return false;
        return object.equals(((ShippingOption)o).object);
    }
}
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

public class DiscountCoupon {
    private JSONObject object;
    public DiscountCoupon() { object = new JSONObject(); }
    public DiscountCoupon(JSONObject json) { object = json; }


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


    public String getCode() {
        Object val = object.opt("code");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setCode(String val) {
        try {
            object.put("code", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getDiscountType() {
        Object val = object.opt("discountType");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setDiscountType(String val) {
        try {
            object.put("discountType", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getStatus() {
        Object val = object.opt("status");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setStatus(String val) {
        try {
            object.put("status", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getDiscount() {
        Object val = object.opt("discount");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setDiscount(Number val) {
        try {
            object.put("discount", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getLaunchDate() {
        Object val = object.opt("launchDate");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setLaunchDate(String val) {
        try {
            object.put("launchDate", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getExpirationDate() {
        Object val = object.opt("expirationDate");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setExpirationDate(String val) {
        try {
            object.put("expirationDate", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getTotalLimit() {
        Object val = object.opt("totalLimit");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setTotalLimit(Number val) {
        try {
            object.put("totalLimit", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getUsesLimit() {
        Object val = object.opt("usesLimit");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setUsesLimit(String val) {
        try {
            object.put("usesLimit", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Boolean getRepeatCustomerOnly() {
        Object val = object.opt("repeatCustomerOnly");
        return val == null ? null : JsonUtil.asBoolean(val);
    }

    public void setRepeatCustomerOnly(Boolean val) {
        try {
            object.put("repeatCustomerOnly", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getCreationDate() {
        Object val = object.opt("creationDate");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setCreationDate(String val) {
        try {
            object.put("creationDate", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getOrderCount() {
        Object val = object.opt("orderCount");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setOrderCount(Number val) {
        try {
            object.put("orderCount", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public DiscountCouponCatalogLimit getCatalogLimit() {
        Object val = object.opt("catalogLimit");
        return val == null ? null : val == JSONObject.NULL ? null : new DiscountCouponCatalogLimit((JSONObject) val);
    }

    public void setCatalogLimit(DiscountCouponCatalogLimit val) {
        try {
            object.put("catalogLimit", val == null ? JSONObject.NULL : val.asJson());
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
        if (!(o instanceof DiscountCoupon)) return false;
        return object.equals(((DiscountCoupon)o).object);
    }
}
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

public class Tax {
    private JSONObject object;
    public Tax() { object = new JSONObject(); }
    public Tax(JSONObject json) { object = json; }


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


    public Boolean getIncludeInPrice() {
        Object val = object.opt("includeInPrice");
        return val == null ? null : JsonUtil.asBoolean(val);
    }

    public void setIncludeInPrice(Boolean val) {
        try {
            object.put("includeInPrice", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Boolean getUseShippingAddress() {
        Object val = object.opt("useShippingAddress");
        return val == null ? null : JsonUtil.asBoolean(val);
    }

    public void setUseShippingAddress(Boolean val) {
        try {
            object.put("useShippingAddress", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Boolean getTaxShipping() {
        Object val = object.opt("taxShipping");
        return val == null ? null : JsonUtil.asBoolean(val);
    }

    public void setTaxShipping(Boolean val) {
        try {
            object.put("taxShipping", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Boolean getAppliedByDefault() {
        Object val = object.opt("appliedByDefault");
        return val == null ? null : JsonUtil.asBoolean(val);
    }

    public void setAppliedByDefault(Boolean val) {
        try {
            object.put("appliedByDefault", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getDefaultTax() {
        Object val = object.opt("defaultTax");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setDefaultTax(Number val) {
        try {
            object.put("defaultTax", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public List<TaxRule> getRules() {
        Object val = object.opt("rules");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<TaxRule>((JSONArray) val) {
            protected TaxRule read(Object val) {
                return val == JSONObject.NULL ? null : new TaxRule((JSONObject) val);
            }

            protected Object write(TaxRule val) {
                return val == null ? JSONObject.NULL : val.asJson();
            }
        };
    }

    public void setRules(List<TaxRule> val) {
        try {
            object.put("rules", JsonUtil.asJsonArray(val, new JsonElementFactory<TaxRule>() {
                public Object json(TaxRule val) {
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
        if (!(o instanceof Tax)) return false;
        return object.equals(((Tax)o).object);
    }
}
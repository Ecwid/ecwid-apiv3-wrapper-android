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

public class FormatsAndUnits {
    private JSONObject object;
    public FormatsAndUnits() { object = new JSONObject(); }
    public FormatsAndUnits(JSONObject json) { object = json; }


    public String getCurrency() {
        Object val = object.opt("currency");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setCurrency(String val) {
        try {
            object.put("currency", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getCurrencyPrefix() {
        Object val = object.opt("currencyPrefix");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setCurrencyPrefix(String val) {
        try {
            object.put("currencyPrefix", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getCurrencySuffix() {
        Object val = object.opt("currencySuffix");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setCurrencySuffix(String val) {
        try {
            object.put("currencySuffix", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getCurrencyGroupSeparator() {
        Object val = object.opt("currencyGroupSeparator");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setCurrencyGroupSeparator(String val) {
        try {
            object.put("currencyGroupSeparator", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getCurrencyDecimalSeparator() {
        Object val = object.opt("currencyDecimalSeparator");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setCurrencyDecimalSeparator(String val) {
        try {
            object.put("currencyDecimalSeparator", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Boolean getCurrencyTruncateZeroFractional() {
        Object val = object.opt("currencyTruncateZeroFractional");
        return val == null ? null : JsonUtil.asBoolean(val);
    }

    public void setCurrencyTruncateZeroFractional(Boolean val) {
        try {
            object.put("currencyTruncateZeroFractional", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getCurrencyRate() {
        Object val = object.opt("currencyRate");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setCurrencyRate(Number val) {
        try {
            object.put("currencyRate", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getWeightUnit() {
        Object val = object.opt("weightUnit");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setWeightUnit(String val) {
        try {
            object.put("weightUnit", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getWeightGroupSeparator() {
        Object val = object.opt("weightGroupSeparator");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setWeightGroupSeparator(String val) {
        try {
            object.put("weightGroupSeparator", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getWeightDecimalSeparator() {
        Object val = object.opt("weightDecimalSeparator");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setWeightDecimalSeparator(String val) {
        try {
            object.put("weightDecimalSeparator", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Boolean getWeightTruncateZeroFractional() {
        Object val = object.opt("weightTruncateZeroFractional");
        return val == null ? null : JsonUtil.asBoolean(val);
    }

    public void setWeightTruncateZeroFractional(Boolean val) {
        try {
            object.put("weightTruncateZeroFractional", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getTimeFormat() {
        Object val = object.opt("timeFormat");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setTimeFormat(String val) {
        try {
            object.put("timeFormat", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getDateFormat() {
        Object val = object.opt("dateFormat");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setDateFormat(String val) {
        try {
            object.put("dateFormat", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getTimezone() {
        Object val = object.opt("timezone");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setTimezone(String val) {
        try {
            object.put("timezone", JsonUtil.asJsonSingleton(val));
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
        if (!(o instanceof FormatsAndUnits)) return false;
        return object.equals(((FormatsAndUnits)o).object);
    }
}
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

public class Person {
    private JSONObject object;
    public Person() { object = new JSONObject(); }
    public Person(JSONObject json) { object = json; }


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


    public String getCompanyName() {
        Object val = object.opt("companyName");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setCompanyName(String val) {
        try {
            object.put("companyName", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getStreet() {
        Object val = object.opt("street");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setStreet(String val) {
        try {
            object.put("street", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getCity() {
        Object val = object.opt("city");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setCity(String val) {
        try {
            object.put("city", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getCountryCode() {
        Object val = object.opt("countryCode");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setCountryCode(String val) {
        try {
            object.put("countryCode", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getCountryName() {
        Object val = object.opt("countryName");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setCountryName(String val) {
        try {
            object.put("countryName", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getPostalCode() {
        Object val = object.opt("postalCode");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setPostalCode(String val) {
        try {
            object.put("postalCode", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getStateOrProvinceCode() {
        Object val = object.opt("stateOrProvinceCode");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setStateOrProvinceCode(String val) {
        try {
            object.put("stateOrProvinceCode", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getStateOrProvinceName() {
        Object val = object.opt("stateOrProvinceName");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setStateOrProvinceName(String val) {
        try {
            object.put("stateOrProvinceName", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getPhone() {
        Object val = object.opt("phone");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setPhone(String val) {
        try {
            object.put("phone", JsonUtil.asJsonSingleton(val));
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
        if (!(o instanceof Person)) return false;
        return object.equals(((Person)o).object);
    }
}
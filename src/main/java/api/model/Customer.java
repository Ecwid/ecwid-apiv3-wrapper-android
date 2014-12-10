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

public class Customer {
    private JSONObject object;
    public Customer() { object = new JSONObject(); }
    public Customer(JSONObject json) { object = json; }


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


    public String getEmail() {
        Object val = object.opt("email");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setEmail(String val) {
        try {
            object.put("email", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getPassword() {
        Object val = object.opt("password");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setPassword(String val) {
        try {
            object.put("password", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getRegistered() {
        Object val = object.opt("registered");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setRegistered(String val) {
        try {
            object.put("registered", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Person getBillingPerson() {
        Object val = object.opt("billingPerson");
        return val == null ? null : val == JSONObject.NULL ? null : new Person((JSONObject) val);
    }

    public void setBillingPerson(Person val) {
        try {
            object.put("billingPerson", val == null ? JSONObject.NULL : val.asJson());
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public List<ShippingAddress> getShippingAddresses() {
        Object val = object.opt("shippingAddresses");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<ShippingAddress>((JSONArray) val) {
            protected ShippingAddress read(Object val) {
                return val == JSONObject.NULL ? null : new ShippingAddress((JSONObject) val);
            }

            protected Object write(ShippingAddress val) {
                return val == null ? JSONObject.NULL : val.asJson();
            }
        };
    }

    public void setShippingAddresses(List<ShippingAddress> val) {
        try {
            object.put("shippingAddresses", JsonUtil.asJsonArray(val, new JsonElementFactory<ShippingAddress>() {
                public Object json(ShippingAddress val) {
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
        if (!(o instanceof Customer)) return false;
        return object.equals(((Customer)o).object);
    }
}
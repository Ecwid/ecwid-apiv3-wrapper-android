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

public class Attribute {
    private JSONObject object;
    public Attribute() { object = new JSONObject(); }
    public Attribute(JSONObject json) { object = json; }


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


    public String getShow() {
        Object val = object.opt("show");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setShow(String val) {
        try {
            object.put("show", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getInternalName() {
        Object val = object.opt("internalName");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setInternalName(String val) {
        try {
            object.put("internalName", JsonUtil.asJsonSingleton(val));
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
        if (!(o instanceof Attribute)) return false;
        return object.equals(((Attribute)o).object);
    }
}
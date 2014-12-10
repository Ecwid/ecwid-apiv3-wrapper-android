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

public class Zone {
    private JSONObject object;
    public Zone() { object = new JSONObject(); }
    public Zone(JSONObject json) { object = json; }


    public String getId() {
        Object val = object.opt("id");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setId(String val) {
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


    public List<String> getCountryCodes() {
        Object val = object.opt("countryCodes");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<String>((JSONArray) val) {
            protected String read(Object val) {
                return JsonUtil.asString(val);
            }

            protected Object write(String val) {
                return JsonUtil.asJsonSingleton(val);
            }
        };
    }

    public void setCountryCodes(List<String> val) {
        try {
            object.put("countryCodes", JsonUtil.asJsonArray(val, new JsonElementFactory<String>() {
                public Object json(String val) {
                    return JsonUtil.asJsonSingleton(val);
                }
            }));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public List<String> getStateOrProvinceCodes() {
        Object val = object.opt("stateOrProvinceCodes");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<String>((JSONArray) val) {
            protected String read(Object val) {
                return JsonUtil.asString(val);
            }

            protected Object write(String val) {
                return JsonUtil.asJsonSingleton(val);
            }
        };
    }

    public void setStateOrProvinceCodes(List<String> val) {
        try {
            object.put("stateOrProvinceCodes", JsonUtil.asJsonArray(val, new JsonElementFactory<String>() {
                public Object json(String val) {
                    return JsonUtil.asJsonSingleton(val);
                }
            }));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public List<String> getPostCodes() {
        Object val = object.opt("postCodes");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<String>((JSONArray) val) {
            protected String read(Object val) {
                return JsonUtil.asString(val);
            }

            protected Object write(String val) {
                return JsonUtil.asJsonSingleton(val);
            }
        };
    }

    public void setPostCodes(List<String> val) {
        try {
            object.put("postCodes", JsonUtil.asJsonArray(val, new JsonElementFactory<String>() {
                public Object json(String val) {
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
        if (!(o instanceof Zone)) return false;
        return object.equals(((Zone)o).object);
    }
}
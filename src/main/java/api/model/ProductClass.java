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

public class ProductClass {
    private JSONObject object;
    public ProductClass() { object = new JSONObject(); }
    public ProductClass(JSONObject json) { object = json; }


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


    public String getGoogleTaxonomy() {
        Object val = object.opt("googleTaxonomy");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setGoogleTaxonomy(String val) {
        try {
            object.put("googleTaxonomy", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getEbayTaxonomyId() {
        Object val = object.opt("ebayTaxonomyId");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setEbayTaxonomyId(Number val) {
        try {
            object.put("ebayTaxonomyId", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getEbayCondition() {
        Object val = object.opt("ebayCondition");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setEbayCondition(Number val) {
        try {
            object.put("ebayCondition", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public List<Attribute> getAttributes() {
        Object val = object.opt("attributes");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<Attribute>((JSONArray) val) {
            protected Attribute read(Object val) {
                return val == JSONObject.NULL ? null : new Attribute((JSONObject) val);
            }

            protected Object write(Attribute val) {
                return val == null ? JSONObject.NULL : val.asJson();
            }
        };
    }

    public void setAttributes(List<Attribute> val) {
        try {
            object.put("attributes", JsonUtil.asJsonArray(val, new JsonElementFactory<Attribute>() {
                public Object json(Attribute val) {
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
        if (!(o instanceof ProductClass)) return false;
        return object.equals(((ProductClass)o).object);
    }
}
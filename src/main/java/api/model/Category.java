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

public class Category {
    private JSONObject object;
    public Category() { object = new JSONObject(); }
    public Category(JSONObject json) { object = json; }


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


    public Number getParentId() {
        Object val = object.opt("parentId");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setParentId(Number val) {
        try {
            object.put("parentId", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getOrderBy() {
        Object val = object.opt("orderBy");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setOrderBy(Number val) {
        try {
            object.put("orderBy", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getThumbnailUrl() {
        Object val = object.opt("thumbnailUrl");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setThumbnailUrl(String val) {
        try {
            object.put("thumbnailUrl", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getOriginalImageUrl() {
        Object val = object.opt("originalImageUrl");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setOriginalImageUrl(String val) {
        try {
            object.put("originalImageUrl", JsonUtil.asJsonSingleton(val));
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


    public String getUrl() {
        Object val = object.opt("url");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setUrl(String val) {
        try {
            object.put("url", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getProductCount() {
        Object val = object.opt("productCount");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setProductCount(Number val) {
        try {
            object.put("productCount", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getDescription() {
        Object val = object.opt("description");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setDescription(String val) {
        try {
            object.put("description", JsonUtil.asJsonSingleton(val));
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


    public List<Number> getProductIds() {
        Object val = object.opt("productIds");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<Number>((JSONArray) val) {
            protected Number read(Object val) {
                return JsonUtil.asNumber(val);
            }

            protected Object write(Number val) {
                return JsonUtil.asJsonSingleton(val);
            }
        };
    }

    public void setProductIds(List<Number> val) {
        try {
            object.put("productIds", JsonUtil.asJsonArray(val, new JsonElementFactory<Number>() {
                public Object json(Number val) {
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
        if (!(o instanceof Category)) return false;
        return object.equals(((Category)o).object);
    }
}
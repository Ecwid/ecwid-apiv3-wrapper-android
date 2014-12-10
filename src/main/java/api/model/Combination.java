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

public class Combination {
    private JSONObject object;
    public Combination() { object = new JSONObject(); }
    public Combination(JSONObject json) { object = json; }


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


    public Number getCombinationNumber() {
        Object val = object.opt("combinationNumber");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setCombinationNumber(Number val) {
        try {
            object.put("combinationNumber", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public List<OptionValue> getOptions() {
        Object val = object.opt("options");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<OptionValue>((JSONArray) val) {
            protected OptionValue read(Object val) {
                return val == JSONObject.NULL ? null : new OptionValue((JSONObject) val);
            }

            protected Object write(OptionValue val) {
                return val == null ? JSONObject.NULL : val.asJson();
            }
        };
    }

    public void setOptions(List<OptionValue> val) {
        try {
            object.put("options", JsonUtil.asJsonArray(val, new JsonElementFactory<OptionValue>() {
                public Object json(OptionValue val) {
                    return val == null ? JSONObject.NULL : val.asJson();
                }
            }));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getSku() {
        Object val = object.opt("sku");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setSku(String val) {
        try {
            object.put("sku", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getSmallThumbnailUrl() {
        Object val = object.opt("smallThumbnailUrl");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setSmallThumbnailUrl(String val) {
        try {
            object.put("smallThumbnailUrl", JsonUtil.asJsonSingleton(val));
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


    public String getImageUrl() {
        Object val = object.opt("imageUrl");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setImageUrl(String val) {
        try {
            object.put("imageUrl", JsonUtil.asJsonSingleton(val));
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


    public Number getQuantity() {
        Object val = object.opt("quantity");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setQuantity(Number val) {
        try {
            object.put("quantity", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Boolean getUnlimited() {
        Object val = object.opt("unlimited");
        return val == null ? null : JsonUtil.asBoolean(val);
    }

    public void setUnlimited(Boolean val) {
        try {
            object.put("unlimited", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getPrice() {
        Object val = object.opt("price");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setPrice(Number val) {
        try {
            object.put("price", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public List<WholesalePrice> getWholesalePrices() {
        Object val = object.opt("wholesalePrices");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<WholesalePrice>((JSONArray) val) {
            protected WholesalePrice read(Object val) {
                return val == JSONObject.NULL ? null : new WholesalePrice((JSONObject) val);
            }

            protected Object write(WholesalePrice val) {
                return val == null ? JSONObject.NULL : val.asJson();
            }
        };
    }

    public void setWholesalePrices(List<WholesalePrice> val) {
        try {
            object.put("wholesalePrices", JsonUtil.asJsonArray(val, new JsonElementFactory<WholesalePrice>() {
                public Object json(WholesalePrice val) {
                    return val == null ? JSONObject.NULL : val.asJson();
                }
            }));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Boolean getIsShippingRequired() {
        Object val = object.opt("isShippingRequired");
        return val == null ? null : JsonUtil.asBoolean(val);
    }

    public void setIsShippingRequired(Boolean val) {
        try {
            object.put("isShippingRequired", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getWeight() {
        Object val = object.opt("weight");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setWeight(Number val) {
        try {
            object.put("weight", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getWarningLimit() {
        Object val = object.opt("warningLimit");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setWarningLimit(Number val) {
        try {
            object.put("warningLimit", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getInventoryDelta() {
        Object val = object.opt("inventoryDelta");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setInventoryDelta(Number val) {
        try {
            object.put("inventoryDelta", JsonUtil.asJsonSingleton(val));
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
        if (!(o instanceof Combination)) return false;
        return object.equals(((Combination)o).object);
    }
}
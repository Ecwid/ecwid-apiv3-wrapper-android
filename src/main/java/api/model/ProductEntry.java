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

public class ProductEntry {
    private JSONObject object;
    public ProductEntry() { object = new JSONObject(); }
    public ProductEntry(JSONObject json) { object = json; }


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


    public Boolean getInStock() {
        Object val = object.opt("inStock");
        return val == null ? null : JsonUtil.asBoolean(val);
    }

    public void setInStock(Boolean val) {
        try {
            object.put("inStock", JsonUtil.asJsonSingleton(val));
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


    public Number getCompareToPrice() {
        Object val = object.opt("compareToPrice");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setCompareToPrice(Number val) {
        try {
            object.put("compareToPrice", JsonUtil.asJsonSingleton(val));
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


    public String getCreated() {
        Object val = object.opt("created");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setCreated(String val) {
        try {
            object.put("created", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getUpdated() {
        Object val = object.opt("updated");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setUpdated(String val) {
        try {
            object.put("updated", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getProductClassId() {
        Object val = object.opt("productClassId");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setProductClassId(Number val) {
        try {
            object.put("productClassId", JsonUtil.asJsonSingleton(val));
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


    public Boolean getDescriptionTruncated() {
        Object val = object.opt("descriptionTruncated");
        return val == null ? null : JsonUtil.asBoolean(val);
    }

    public void setDescriptionTruncated(Boolean val) {
        try {
            object.put("descriptionTruncated", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getPriceInProductList() {
        Object val = object.opt("priceInProductList");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setPriceInProductList(Number val) {
        try {
            object.put("priceInProductList", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public ProductEntryCombination getDefaultCombination() {
        Object val = object.opt("defaultCombination");
        return val == null ? null : val == JSONObject.NULL ? null : new ProductEntryCombination((JSONObject) val);
    }

    public void setDefaultCombination(ProductEntryCombination val) {
        try {
            object.put("defaultCombination", val == null ? JSONObject.NULL : val.asJson());
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public List<Number> getCategoryIds() {
        Object val = object.opt("categoryIds");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<Number>((JSONArray) val) {
            protected Number read(Object val) {
                return JsonUtil.asNumber(val);
            }

            protected Object write(Number val) {
                return JsonUtil.asJsonSingleton(val);
            }
        };
    }

    public void setCategoryIds(List<Number> val) {
        try {
            object.put("categoryIds", JsonUtil.asJsonArray(val, new JsonElementFactory<Number>() {
                public Object json(Number val) {
                    return JsonUtil.asJsonSingleton(val);
                }
            }));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getDefaultCategoryId() {
        Object val = object.opt("defaultCategoryId");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setDefaultCategoryId(Number val) {
        try {
            object.put("defaultCategoryId", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Favorites getFavorites() {
        Object val = object.opt("favorites");
        return val == null ? null : val == JSONObject.NULL ? null : new Favorites((JSONObject) val);
    }

    public void setFavorites(Favorites val) {
        try {
            object.put("favorites", val == null ? JSONObject.NULL : val.asJson());
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
        if (!(o instanceof ProductEntry)) return false;
        return object.equals(((ProductEntry)o).object);
    }
}
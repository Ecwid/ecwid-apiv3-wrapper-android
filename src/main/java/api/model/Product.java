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

public class Product {
    private JSONObject object;
    public Product() { object = new JSONObject(); }
    public Product(JSONObject json) { object = json; }


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


    public List<ProductOption> getOptions() {
        Object val = object.opt("options");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<ProductOption>((JSONArray) val) {
            protected ProductOption read(Object val) {
                return val == JSONObject.NULL ? null : new ProductOption((JSONObject) val);
            }

            protected Object write(ProductOption val) {
                return val == null ? JSONObject.NULL : val.asJson();
            }
        };
    }

    public void setOptions(List<ProductOption> val) {
        try {
            object.put("options", JsonUtil.asJsonArray(val, new JsonElementFactory<ProductOption>() {
                public Object json(ProductOption val) {
                    return val == null ? JSONObject.NULL : val.asJson();
                }
            }));
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


    public Boolean getFixedShippingRateOnly() {
        Object val = object.opt("fixedShippingRateOnly");
        return val == null ? null : JsonUtil.asBoolean(val);
    }

    public void setFixedShippingRateOnly(Boolean val) {
        try {
            object.put("fixedShippingRateOnly", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getFixedShippingRate() {
        Object val = object.opt("fixedShippingRate");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setFixedShippingRate(Number val) {
        try {
            object.put("fixedShippingRate", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getDefaultCombinationId() {
        Object val = object.opt("defaultCombinationId");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setDefaultCombinationId(Number val) {
        try {
            object.put("defaultCombinationId", JsonUtil.asJsonSingleton(val));
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


    public List<GalleryImage> getGalleryImages() {
        Object val = object.opt("galleryImages");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<GalleryImage>((JSONArray) val) {
            protected GalleryImage read(Object val) {
                return val == JSONObject.NULL ? null : new GalleryImage((JSONObject) val);
            }

            protected Object write(GalleryImage val) {
                return val == null ? JSONObject.NULL : val.asJson();
            }
        };
    }

    public void setGalleryImages(List<GalleryImage> val) {
        try {
            object.put("galleryImages", JsonUtil.asJsonArray(val, new JsonElementFactory<GalleryImage>() {
                public Object json(GalleryImage val) {
                    return val == null ? JSONObject.NULL : val.asJson();
                }
            }));
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


    public List<AttributeValue> getAttributes() {
        Object val = object.opt("attributes");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<AttributeValue>((JSONArray) val) {
            protected AttributeValue read(Object val) {
                return val == JSONObject.NULL ? null : new AttributeValue((JSONObject) val);
            }

            protected Object write(AttributeValue val) {
                return val == null ? JSONObject.NULL : val.asJson();
            }
        };
    }

    public void setAttributes(List<AttributeValue> val) {
        try {
            object.put("attributes", JsonUtil.asJsonArray(val, new JsonElementFactory<AttributeValue>() {
                public Object json(AttributeValue val) {
                    return val == null ? JSONObject.NULL : val.asJson();
                }
            }));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public List<ProductFile> getFiles() {
        Object val = object.opt("files");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<ProductFile>((JSONArray) val) {
            protected ProductFile read(Object val) {
                return val == JSONObject.NULL ? null : new ProductFile((JSONObject) val);
            }

            protected Object write(ProductFile val) {
                return val == null ? JSONObject.NULL : val.asJson();
            }
        };
    }

    public void setFiles(List<ProductFile> val) {
        try {
            object.put("files", JsonUtil.asJsonArray(val, new JsonElementFactory<ProductFile>() {
                public Object json(ProductFile val) {
                    return val == null ? JSONObject.NULL : val.asJson();
                }
            }));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public RelatedProducts getRelatedProducts() {
        Object val = object.opt("relatedProducts");
        return val == null ? null : val == JSONObject.NULL ? null : new RelatedProducts((JSONObject) val);
    }

    public void setRelatedProducts(RelatedProducts val) {
        try {
            object.put("relatedProducts", val == null ? JSONObject.NULL : val.asJson());
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public List<Combination> getCombinations() {
        Object val = object.opt("combinations");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<Combination>((JSONArray) val) {
            protected Combination read(Object val) {
                return val == JSONObject.NULL ? null : new Combination((JSONObject) val);
            }

            protected Object write(Combination val) {
                return val == null ? JSONObject.NULL : val.asJson();
            }
        };
    }

    public void setCombinations(List<Combination> val) {
        try {
            object.put("combinations", JsonUtil.asJsonArray(val, new JsonElementFactory<Combination>() {
                public Object json(Combination val) {
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
        if (!(o instanceof Product)) return false;
        return object.equals(((Product)o).object);
    }
}
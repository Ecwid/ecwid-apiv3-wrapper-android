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

public class OrderItem {
    private JSONObject object;
    public OrderItem() { object = new JSONObject(); }
    public OrderItem(JSONObject json) { object = json; }


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


    public Number getProductId() {
        Object val = object.opt("productId");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setProductId(Number val) {
        try {
            object.put("productId", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getCategoryId() {
        Object val = object.opt("categoryId");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setCategoryId(Number val) {
        try {
            object.put("categoryId", JsonUtil.asJsonSingleton(val));
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


    public Number getProductPrice() {
        Object val = object.opt("productPrice");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setProductPrice(Number val) {
        try {
            object.put("productPrice", JsonUtil.asJsonSingleton(val));
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


    public String getShortDescription() {
        Object val = object.opt("shortDescription");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setShortDescription(String val) {
        try {
            object.put("shortDescription", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getTax() {
        Object val = object.opt("tax");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setTax(Number val) {
        try {
            object.put("tax", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getShipping() {
        Object val = object.opt("shipping");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setShipping(Number val) {
        try {
            object.put("shipping", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getQuantityInStock() {
        Object val = object.opt("quantityInStock");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setQuantityInStock(Number val) {
        try {
            object.put("quantityInStock", JsonUtil.asJsonSingleton(val));
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


    public Boolean getTrackQuantity() {
        Object val = object.opt("trackQuantity");
        return val == null ? null : JsonUtil.asBoolean(val);
    }

    public void setTrackQuantity(Boolean val) {
        try {
            object.put("trackQuantity", JsonUtil.asJsonSingleton(val));
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


    public Boolean getDigital() {
        Object val = object.opt("digital");
        return val == null ? null : JsonUtil.asBoolean(val);
    }

    public void setDigital(Boolean val) {
        try {
            object.put("digital", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Boolean getProductAvailable() {
        Object val = object.opt("productAvailable");
        return val == null ? null : JsonUtil.asBoolean(val);
    }

    public void setProductAvailable(Boolean val) {
        try {
            object.put("productAvailable", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Boolean getCouponApplied() {
        Object val = object.opt("couponApplied");
        return val == null ? null : JsonUtil.asBoolean(val);
    }

    public void setCouponApplied(Boolean val) {
        try {
            object.put("couponApplied", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public List<OrderItemProductOption> getSelectedOptions() {
        Object val = object.opt("selectedOptions");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<OrderItemProductOption>((JSONArray) val) {
            protected OrderItemProductOption read(Object val) {
                return val == JSONObject.NULL ? null : new OrderItemProductOption((JSONObject) val);
            }

            protected Object write(OrderItemProductOption val) {
                return val == null ? JSONObject.NULL : val.asJson();
            }
        };
    }

    public void setSelectedOptions(List<OrderItemProductOption> val) {
        try {
            object.put("selectedOptions", JsonUtil.asJsonArray(val, new JsonElementFactory<OrderItemProductOption>() {
                public Object json(OrderItemProductOption val) {
                    return val == null ? JSONObject.NULL : val.asJson();
                }
            }));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public List<OrderItemProductFile> getFiles() {
        Object val = object.opt("files");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<OrderItemProductFile>((JSONArray) val) {
            protected OrderItemProductFile read(Object val) {
                return val == JSONObject.NULL ? null : new OrderItemProductFile((JSONObject) val);
            }

            protected Object write(OrderItemProductFile val) {
                return val == null ? JSONObject.NULL : val.asJson();
            }
        };
    }

    public void setFiles(List<OrderItemProductFile> val) {
        try {
            object.put("files", JsonUtil.asJsonArray(val, new JsonElementFactory<OrderItemProductFile>() {
                public Object json(OrderItemProductFile val) {
                    return val == null ? JSONObject.NULL : val.asJson();
                }
            }));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public List<OrderItemTax> getTaxes() {
        Object val = object.opt("taxes");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<OrderItemTax>((JSONArray) val) {
            protected OrderItemTax read(Object val) {
                return val == JSONObject.NULL ? null : new OrderItemTax((JSONObject) val);
            }

            protected Object write(OrderItemTax val) {
                return val == null ? JSONObject.NULL : val.asJson();
            }
        };
    }

    public void setTaxes(List<OrderItemTax> val) {
        try {
            object.put("taxes", JsonUtil.asJsonArray(val, new JsonElementFactory<OrderItemTax>() {
                public Object json(OrderItemTax val) {
                    return val == null ? JSONObject.NULL : val.asJson();
                }
            }));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getEbayId() {
        Object val = object.opt("ebayId");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setEbayId(String val) {
        try {
            object.put("ebayId", JsonUtil.asJsonSingleton(val));
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
        if (!(o instanceof OrderItem)) return false;
        return object.equals(((OrderItem)o).object);
    }
}
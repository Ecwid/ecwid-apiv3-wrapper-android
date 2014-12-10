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

public class Order {
    private JSONObject object;
    public Order() { object = new JSONObject(); }
    public Order(JSONObject json) { object = json; }


    public String getVendorOrderNumber() {
        Object val = object.opt("vendorOrderNumber");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setVendorOrderNumber(String val) {
        try {
            object.put("vendorOrderNumber", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getSubtotal() {
        Object val = object.opt("subtotal");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setSubtotal(Number val) {
        try {
            object.put("subtotal", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getTotal() {
        Object val = object.opt("total");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setTotal(Number val) {
        try {
            object.put("total", JsonUtil.asJsonSingleton(val));
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


    public String getExternalTransactionId() {
        Object val = object.opt("externalTransactionId");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setExternalTransactionId(String val) {
        try {
            object.put("externalTransactionId", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getPaymentModule() {
        Object val = object.opt("paymentModule");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setPaymentModule(String val) {
        try {
            object.put("paymentModule", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getPaymentMethod() {
        Object val = object.opt("paymentMethod");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setPaymentMethod(String val) {
        try {
            object.put("paymentMethod", JsonUtil.asJsonSingleton(val));
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


    public String getIpAddress() {
        Object val = object.opt("ipAddress");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setIpAddress(String val) {
        try {
            object.put("ipAddress", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getCouponDiscount() {
        Object val = object.opt("couponDiscount");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setCouponDiscount(Number val) {
        try {
            object.put("couponDiscount", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getTrackingNumber() {
        Object val = object.opt("trackingNumber");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setTrackingNumber(String val) {
        try {
            object.put("trackingNumber", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getPaymentStatus() {
        Object val = object.opt("paymentStatus");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setPaymentStatus(String val) {
        try {
            object.put("paymentStatus", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getPaymentMessage() {
        Object val = object.opt("paymentMessage");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setPaymentMessage(String val) {
        try {
            object.put("paymentMessage", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getFulfillmentStatus() {
        Object val = object.opt("fulfillmentStatus");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setFulfillmentStatus(String val) {
        try {
            object.put("fulfillmentStatus", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getOrderNumber() {
        Object val = object.opt("orderNumber");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setOrderNumber(Number val) {
        try {
            object.put("orderNumber", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getRefererUrl() {
        Object val = object.opt("refererUrl");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setRefererUrl(String val) {
        try {
            object.put("refererUrl", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getNotes() {
        Object val = object.opt("notes");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setNotes(String val) {
        try {
            object.put("notes", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getOrderComments() {
        Object val = object.opt("orderComments");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setOrderComments(String val) {
        try {
            object.put("orderComments", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getAffiliateId() {
        Object val = object.opt("affiliateId");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setAffiliateId(String val) {
        try {
            object.put("affiliateId", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getVolumeDiscount() {
        Object val = object.opt("volumeDiscount");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setVolumeDiscount(Number val) {
        try {
            object.put("volumeDiscount", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getCustomerId() {
        Object val = object.opt("customerId");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setCustomerId(Number val) {
        try {
            object.put("customerId", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getMembershipBasedDiscount() {
        Object val = object.opt("membershipBasedDiscount");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setMembershipBasedDiscount(Number val) {
        try {
            object.put("membershipBasedDiscount", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getTotalAndMembershipBasedDiscount() {
        Object val = object.opt("totalAndMembershipBasedDiscount");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setTotalAndMembershipBasedDiscount(Number val) {
        try {
            object.put("totalAndMembershipBasedDiscount", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getDiscount() {
        Object val = object.opt("discount");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setDiscount(Number val) {
        try {
            object.put("discount", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getUsdTotal() {
        Object val = object.opt("usdTotal");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setUsdTotal(Number val) {
        try {
            object.put("usdTotal", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getGlobalReferer() {
        Object val = object.opt("globalReferer");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setGlobalReferer(String val) {
        try {
            object.put("globalReferer", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getCreateDate() {
        Object val = object.opt("createDate");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setCreateDate(String val) {
        try {
            object.put("createDate", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getUpdateDate() {
        Object val = object.opt("updateDate");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setUpdateDate(String val) {
        try {
            object.put("updateDate", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public String getCustomerGroup() {
        Object val = object.opt("customerGroup");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setCustomerGroup(String val) {
        try {
            object.put("customerGroup", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public DiscountCoupon getDiscountCoupon() {
        Object val = object.opt("discountCoupon");
        return val == null ? null : val == JSONObject.NULL ? null : new DiscountCoupon((JSONObject) val);
    }

    public void setDiscountCoupon(DiscountCoupon val) {
        try {
            object.put("discountCoupon", val == null ? JSONObject.NULL : val.asJson());
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public List<OrderItem> getItems() {
        Object val = object.opt("items");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<OrderItem>((JSONArray) val) {
            protected OrderItem read(Object val) {
                return val == JSONObject.NULL ? null : new OrderItem((JSONObject) val);
            }

            protected Object write(OrderItem val) {
                return val == null ? JSONObject.NULL : val.asJson();
            }
        };
    }

    public void setItems(List<OrderItem> val) {
        try {
            object.put("items", JsonUtil.asJsonArray(val, new JsonElementFactory<OrderItem>() {
                public Object json(OrderItem val) {
                    return val == null ? JSONObject.NULL : val.asJson();
                }
            }));
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


    public Person getShippingPerson() {
        Object val = object.opt("shippingPerson");
        return val == null ? null : val == JSONObject.NULL ? null : new Person((JSONObject) val);
    }

    public void setShippingPerson(Person val) {
        try {
            object.put("shippingPerson", val == null ? JSONObject.NULL : val.asJson());
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public ShippingOption getShippingOption() {
        Object val = object.opt("shippingOption");
        return val == null ? null : val == JSONObject.NULL ? null : new ShippingOption((JSONObject) val);
    }

    public void setShippingOption(ShippingOption val) {
        try {
            object.put("shippingOption", val == null ? JSONObject.NULL : val.asJson());
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Map<String, String> getAdditionalInfo() {
        Object val = object.opt("additionalInfo");
        return val == null ? null : new JsonObjectMap<String>((JSONObject) val) {
            protected String read(Object val) {
                return JsonUtil.asString(val);
            }

            protected Object write(String val) {
                return JsonUtil.asJsonSingleton(val);
            }
        };
    }

    public void setAdditionalInfo(Map<String, String> val) {
        try {
            object.put("additionalInfo", JsonUtil.asJsonMap(val, new JsonElementFactory<String>() {
                public Object json(String val) {
                    return JsonUtil.asJsonSingleton(val);
                }
            }));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Map<String, String> getPaymentParams() {
        Object val = object.opt("paymentParams");
        return val == null ? null : new JsonObjectMap<String>((JSONObject) val) {
            protected String read(Object val) {
                return JsonUtil.asString(val);
            }

            protected Object write(String val) {
                return JsonUtil.asJsonSingleton(val);
            }
        };
    }

    public void setPaymentParams(Map<String, String> val) {
        try {
            object.put("paymentParams", JsonUtil.asJsonMap(val, new JsonElementFactory<String>() {
                public Object json(String val) {
                    return JsonUtil.asJsonSingleton(val);
                }
            }));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public List<Discount> getDiscountInfo() {
        Object val = object.opt("discountInfo");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<Discount>((JSONArray) val) {
            protected Discount read(Object val) {
                return val == JSONObject.NULL ? null : new Discount((JSONObject) val);
            }

            protected Object write(Discount val) {
                return val == null ? JSONObject.NULL : val.asJson();
            }
        };
    }

    public void setDiscountInfo(List<Discount> val) {
        try {
            object.put("discountInfo", JsonUtil.asJsonArray(val, new JsonElementFactory<Discount>() {
                public Object json(Discount val) {
                    return val == null ? JSONObject.NULL : val.asJson();
                }
            }));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public CreditCardStatus getCreditCardStatus() {
        Object val = object.opt("creditCardStatus");
        return val == null ? null : val == JSONObject.NULL ? null : new CreditCardStatus((JSONObject) val);
    }

    public void setCreditCardStatus(CreditCardStatus val) {
        try {
            object.put("creditCardStatus", val == null ? JSONObject.NULL : val.asJson());
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
        if (!(o instanceof Order)) return false;
        return object.equals(((Order)o).object);
    }
}
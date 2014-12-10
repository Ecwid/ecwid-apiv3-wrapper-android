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

public class DeletedCustomersResponse {
    private JSONObject object;
    public DeletedCustomersResponse() { object = new JSONObject(); }
    public DeletedCustomersResponse(JSONObject json) { object = json; }


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


    public Number getCount() {
        Object val = object.opt("count");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setCount(Number val) {
        try {
            object.put("count", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getOffset() {
        Object val = object.opt("offset");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setOffset(Number val) {
        try {
            object.put("offset", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getLimit() {
        Object val = object.opt("limit");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setLimit(Number val) {
        try {
            object.put("limit", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public List<DeletedCustomerTO> getItems() {
        Object val = object.opt("items");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<DeletedCustomerTO>((JSONArray) val) {
            protected DeletedCustomerTO read(Object val) {
                return val == JSONObject.NULL ? null : new DeletedCustomerTO((JSONObject) val);
            }

            protected Object write(DeletedCustomerTO val) {
                return val == null ? JSONObject.NULL : val.asJson();
            }
        };
    }

    public void setItems(List<DeletedCustomerTO> val) {
        try {
            object.put("items", JsonUtil.asJsonArray(val, new JsonElementFactory<DeletedCustomerTO>() {
                public Object json(DeletedCustomerTO val) {
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
        if (!(o instanceof DeletedCustomersResponse)) return false;
        return object.equals(((DeletedCustomersResponse)o).object);
    }
}
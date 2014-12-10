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

public class GalleryImage {
    private JSONObject object;
    public GalleryImage() { object = new JSONObject(); }
    public GalleryImage(JSONObject json) { object = json; }


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


    public String getAlt() {
        Object val = object.opt("alt");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setAlt(String val) {
        try {
            object.put("alt", JsonUtil.asJsonSingleton(val));
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


    public String getThumbnail() {
        Object val = object.opt("thumbnail");
        return val == null ? null : JsonUtil.asString(val);
    }

    public void setThumbnail(String val) {
        try {
            object.put("thumbnail", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getWidth() {
        Object val = object.opt("width");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setWidth(Number val) {
        try {
            object.put("width", JsonUtil.asJsonSingleton(val));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Number getHeight() {
        Object val = object.opt("height");
        return val == null ? null : JsonUtil.asNumber(val);
    }

    public void setHeight(Number val) {
        try {
            object.put("height", JsonUtil.asJsonSingleton(val));
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
        if (!(o instanceof GalleryImage)) return false;
        return object.equals(((GalleryImage)o).object);
    }
}
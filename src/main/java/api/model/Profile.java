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

public class Profile {
    private JSONObject object;
    public Profile() { object = new JSONObject(); }
    public Profile(JSONObject json) { object = json; }


    public GeneralInfo getGeneralInfo() {
        Object val = object.opt("generalInfo");
        return val == null ? null : val == JSONObject.NULL ? null : new GeneralInfo((JSONObject) val);
    }

    public void setGeneralInfo(GeneralInfo val) {
        try {
            object.put("generalInfo", val == null ? JSONObject.NULL : val.asJson());
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public AccountInfo getAccount() {
        Object val = object.opt("account");
        return val == null ? null : val == JSONObject.NULL ? null : new AccountInfo((JSONObject) val);
    }

    public void setAccount(AccountInfo val) {
        try {
            object.put("account", val == null ? JSONObject.NULL : val.asJson());
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public StoreSettings getSettings() {
        Object val = object.opt("settings");
        return val == null ? null : val == JSONObject.NULL ? null : new StoreSettings((JSONObject) val);
    }

    public void setSettings(StoreSettings val) {
        try {
            object.put("settings", val == null ? JSONObject.NULL : val.asJson());
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Company getCompany() {
        Object val = object.opt("company");
        return val == null ? null : val == JSONObject.NULL ? null : new Company((JSONObject) val);
    }

    public void setCompany(Company val) {
        try {
            object.put("company", val == null ? JSONObject.NULL : val.asJson());
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public FormatsAndUnits getFormatsAndUnits() {
        Object val = object.opt("formatsAndUnits");
        return val == null ? null : val == JSONObject.NULL ? null : new FormatsAndUnits((JSONObject) val);
    }

    public void setFormatsAndUnits(FormatsAndUnits val) {
        try {
            object.put("formatsAndUnits", val == null ? JSONObject.NULL : val.asJson());
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public Languages getLanguages() {
        Object val = object.opt("languages");
        return val == null ? null : val == JSONObject.NULL ? null : new Languages((JSONObject) val);
    }

    public void setLanguages(Languages val) {
        try {
            object.put("languages", val == null ? JSONObject.NULL : val.asJson());
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public List<Tax> getTaxes() {
        Object val = object.opt("taxes");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<Tax>((JSONArray) val) {
            protected Tax read(Object val) {
                return val == JSONObject.NULL ? null : new Tax((JSONObject) val);
            }

            protected Object write(Tax val) {
                return val == null ? JSONObject.NULL : val.asJson();
            }
        };
    }

    public void setTaxes(List<Tax> val) {
        try {
            object.put("taxes", JsonUtil.asJsonArray(val, new JsonElementFactory<Tax>() {
                public Object json(Tax val) {
                    return val == null ? JSONObject.NULL : val.asJson();
                }
            }));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public List<Zone> getZones() {
        Object val = object.opt("zones");
        return val == null ? null : val == JSONObject.NULL ? null : new JsonArrayList<Zone>((JSONArray) val) {
            protected Zone read(Object val) {
                return val == JSONObject.NULL ? null : new Zone((JSONObject) val);
            }

            protected Object write(Zone val) {
                return val == null ? JSONObject.NULL : val.asJson();
            }
        };
    }

    public void setZones(List<Zone> val) {
        try {
            object.put("zones", JsonUtil.asJsonArray(val, new JsonElementFactory<Zone>() {
                public Object json(Zone val) {
                    return val == null ? JSONObject.NULL : val.asJson();
                }
            }));
        } catch (JSONException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }


    public BusinessRegistrationID getBusinessRegistrationID() {
        Object val = object.opt("businessRegistrationID");
        return val == null ? null : val == JSONObject.NULL ? null : new BusinessRegistrationID((JSONObject) val);
    }

    public void setBusinessRegistrationID(BusinessRegistrationID val) {
        try {
            object.put("businessRegistrationID", val == null ? JSONObject.NULL : val.asJson());
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
        if (!(o instanceof Profile)) return false;
        return object.equals(((Profile)o).object);
    }
}
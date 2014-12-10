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
package api;

import org.apache.http.client.HttpClient;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.client.methods.*;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.HttpEntity;
import org.apache.http.entity.*;
import org.apache.http.util.EntityUtils;
import org.apache.http.HttpResponse;

import java.io.InputStream;
import java.net.URISyntaxException;
import api.model.*;
import api.util.*;
import java.util.*;
import java.io.IOException;
import org.json.*;

public class Client {
    final RequestExecutor executor;
    String url = "use the url parameter to set default endpoint url, and an optional https-url to set the https url.";

    public Client() {
        this(new DefaultHttpClient());
    }

    public Client(final HttpClient client) {
        this(new RequestExecutor() {
                @Override
                public HttpResponse execute(HttpUriRequest request) throws IOException, ClientProtocolException {
                    return client.execute(request);
                }
            });
    }

    public Client(RequestExecutor executor) {
        this.executor = executor;
    }

    public Client setUrl(String url) throws URISyntaxException {
        new URIBuilder(url);
        this.url = url;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public RequestExecutor getRequestExecutor() {
        return executor;
    }


    public Request<DeletedProductsResponse> productsDeletedEntityService(Number storeId, String token, String from_date, String to_date, Number offset, Number limit) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/products/deleted");
            if (token != null) builder.setParameter("token", token.toString());
            if (from_date != null) builder.setParameter("from_date", from_date.toString());
            if (to_date != null) builder.setParameter("to_date", to_date.toString());
            if (offset != null) builder.setParameter("offset", offset.toString());
            if (limit != null) builder.setParameter("limit", limit.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            return new Request<DeletedProductsResponse>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public DeletedProductsResponse execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpGet method = new HttpGet(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new DeletedProductsResponse(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<DeletedCustomersResponse> customersDeletedEntityService(Number storeId, String token, String from_date, String to_date, Number offset, Number limit) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/customers/deleted");
            if (token != null) builder.setParameter("token", token.toString());
            if (from_date != null) builder.setParameter("from_date", from_date.toString());
            if (to_date != null) builder.setParameter("to_date", to_date.toString());
            if (offset != null) builder.setParameter("offset", offset.toString());
            if (limit != null) builder.setParameter("limit", limit.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            return new Request<DeletedCustomersResponse>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public DeletedCustomersResponse execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpGet method = new HttpGet(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new DeletedCustomersResponse(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<DeletedDiscountCouponsResponse> discountCouponsDeletedEntityService(Number storeId, String token, String from_date, String to_date, Number offset, Number limit) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/discount_coupons/deleted");
            if (token != null) builder.setParameter("token", token.toString());
            if (from_date != null) builder.setParameter("from_date", from_date.toString());
            if (to_date != null) builder.setParameter("to_date", to_date.toString());
            if (offset != null) builder.setParameter("offset", offset.toString());
            if (limit != null) builder.setParameter("limit", limit.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            return new Request<DeletedDiscountCouponsResponse>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public DeletedDiscountCouponsResponse execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpGet method = new HttpGet(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new DeletedDiscountCouponsResponse(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<DeletedOrdersResponse> ordersDeletedEntityService(Number storeId, String token, String from_date, String to_date, Number offset, Number limit) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/orders/deleted");
            if (token != null) builder.setParameter("token", token.toString());
            if (from_date != null) builder.setParameter("from_date", from_date.toString());
            if (to_date != null) builder.setParameter("to_date", to_date.toString());
            if (offset != null) builder.setParameter("offset", offset.toString());
            if (limit != null) builder.setParameter("limit", limit.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            return new Request<DeletedOrdersResponse>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public DeletedOrdersResponse execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpGet method = new HttpGet(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new DeletedOrdersResponse(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<DiscountCouponResult> listDiscountCouponService(Number storeId, String code, String discount_type, String availability, Number limit, Number offset, String token) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/discount_coupons");
            if (code != null) builder.setParameter("code", code.toString());
            if (discount_type != null) builder.setParameter("discount_type", discount_type.toString());
            if (availability != null) builder.setParameter("availability", availability.toString());
            if (limit != null) builder.setParameter("limit", limit.toString());
            if (offset != null) builder.setParameter("offset", offset.toString());
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            return new Request<DiscountCouponResult>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public DiscountCouponResult execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpGet method = new HttpGet(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new DiscountCouponResult(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<DiscountCoupon> getDiscountCouponService(Number storeId, String code, String token) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/discount_coupons/" + code);
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (code == null) throw new IllegalArgumentException("No parameter code is set");

            return new Request<DiscountCoupon>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public DiscountCoupon execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpGet method = new HttpGet(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new DiscountCoupon(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<DeleteStatus> deleteDiscountCouponService(Number storeId, String code, String discount_type, String availability, String token) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/discount_coupons");
            if (code != null) builder.setParameter("code", code.toString());
            if (discount_type != null) builder.setParameter("discount_type", discount_type.toString());
            if (availability != null) builder.setParameter("availability", availability.toString());
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            return new Request<DeleteStatus>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public DeleteStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpDelete method = new HttpDelete(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new DeleteStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<DeleteStatus> deleteDiscountCouponService(Number storeId, String code, String token) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/discount_coupons/" + code);
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (code == null) throw new IllegalArgumentException("No parameter code is set");

            return new Request<DeleteStatus>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public DeleteStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpDelete method = new HttpDelete(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new DeleteStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<UpdateStatus> updateDiscountCouponService(Number storeId, String code, String token, DiscountCoupon body) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/discount_coupons/" + code);
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (code == null) throw new IllegalArgumentException("No parameter code is set");

            if (body == null) throw new IllegalArgumentException("No request body");
            return new Request<UpdateStatus>(getRequestExecutor(), builder.build()
                    , new StringEntity(body.asJson().toString(), ContentType.APPLICATION_JSON)) {
                @Override
                public UpdateStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpPut method = new HttpPut(uri);
                    method.setEntity(body);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new UpdateStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<CreateCouponStatus> createDiscountCouponService(Number storeId, String token, DiscountCoupon body) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/discount_coupons");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (body == null) throw new IllegalArgumentException("No request body");
            return new Request<CreateCouponStatus>(getRequestExecutor(), builder.build()
                    , new StringEntity(body.asJson().toString(), ContentType.APPLICATION_JSON)) {
                @Override
                public CreateCouponStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpPost method = new HttpPost(uri);
                    method.setEntity(body);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new CreateCouponStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<Product> getProductApiService(Number storeId, Number productId, String token) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/products/" + productId);
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (productId == null) throw new IllegalArgumentException("No parameter productId is set");

            return new Request<Product>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public Product execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpGet method = new HttpGet(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new Product(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<ProductSearchResult> searchProductApiService(Number storeId, String keyword, Number priceFrom, Number priceTo, Number category, Boolean withSubcategories, String sortBy, Number offset, Number limit, String createdFrom, String createdTo, String updatedFrom, String updatedTo, Boolean enabled, Boolean inStock, String token) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/products");
            if (keyword != null) builder.setParameter("keyword", keyword.toString());
            if (priceFrom != null) builder.setParameter("priceFrom", priceFrom.toString());
            if (priceTo != null) builder.setParameter("priceTo", priceTo.toString());
            if (category != null) builder.setParameter("category", category.toString());
            if (withSubcategories != null) builder.setParameter("withSubcategories", withSubcategories.toString());
            if (sortBy != null) builder.setParameter("sortBy", sortBy.toString());
            if (offset != null) builder.setParameter("offset", offset.toString());
            if (limit != null) builder.setParameter("limit", limit.toString());
            if (createdFrom != null) builder.setParameter("createdFrom", createdFrom.toString());
            if (createdTo != null) builder.setParameter("createdTo", createdTo.toString());
            if (updatedFrom != null) builder.setParameter("updatedFrom", updatedFrom.toString());
            if (updatedTo != null) builder.setParameter("updatedTo", updatedTo.toString());
            if (enabled != null) builder.setParameter("enabled", enabled.toString());
            if (inStock != null) builder.setParameter("inStock", inStock.toString());
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            return new Request<ProductSearchResult>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public ProductSearchResult execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpGet method = new HttpGet(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new ProductSearchResult(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<CreateStatus> createProductApiService(Number storeId, String token, Product body) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/products");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (body == null) throw new IllegalArgumentException("No request body");
            return new Request<CreateStatus>(getRequestExecutor(), builder.build()
                    , new StringEntity(body.asJson().toString(), ContentType.APPLICATION_JSON)) {
                @Override
                public CreateStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpPost method = new HttpPost(uri);
                    method.setEntity(body);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new CreateStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<UpdateStatus> updateProductApiService(Number storeId, Number productId, String token, Product body) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/products/" + productId);
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (productId == null) throw new IllegalArgumentException("No parameter productId is set");

            if (body == null) throw new IllegalArgumentException("No request body");
            return new Request<UpdateStatus>(getRequestExecutor(), builder.build()
                    , new StringEntity(body.asJson().toString(), ContentType.APPLICATION_JSON)) {
                @Override
                public UpdateStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpPut method = new HttpPut(uri);
                    method.setEntity(body);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new UpdateStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<DeleteStatus> deleteProductApiService(Number storeId, Number productId, String token) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/products/" + productId);
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (productId == null) throw new IllegalArgumentException("No parameter productId is set");

            return new Request<DeleteStatus>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public DeleteStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpDelete method = new HttpDelete(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new DeleteStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<UploadStatus> uploadProductImageApiUploadService(Number storeId, String token, Number id, InputStream body) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/products/" + id + "/image");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            if (body == null) throw new IllegalArgumentException("No request body");
            return new Request<UploadStatus>(getRequestExecutor(), builder.build()
                    , createInputStreamEntity(body)) {
                @Override
                public UploadStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpPost method = new HttpPost(uri);
                    method.setEntity(body);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new UploadStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<UploadStatus> uploadProductFileApiUploadService(Number storeId, String token, Number id, String fileName, String description, InputStream body) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/products/" + id + "/files");
            if (token != null) builder.setParameter("token", token.toString());
            if (description != null) builder.setParameter("description", description.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            if (fileName == null) throw new IllegalArgumentException("No parameter fileName is set");
            builder.setParameter("fileName", fileName.toString());
            if (body == null) throw new IllegalArgumentException("No request body");
            return new Request<UploadStatus>(getRequestExecutor(), builder.build()
                    , createInputStreamEntity(body)) {
                @Override
                public UploadStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpPost method = new HttpPost(uri);
                    method.setEntity(body);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new UploadStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<InputStream> getProductEgoodApiUploadService(Number storeId, String token, Number id, Number fileId) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/products/" + id + "/files/" + fileId);
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            if (fileId == null) throw new IllegalArgumentException("No parameter fileId is set");

            return new Request<InputStream>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public InputStream execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpGet method = new HttpGet(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected binary output.");
                        return entity.getContent();

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<UploadStatus> uploadProductGalleryImageApiUploadService(Number storeId, String token, String fileName, Number id, InputStream body) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/products/" + id + "/gallery");
            if (token != null) builder.setParameter("token", token.toString());
            if (fileName != null) builder.setParameter("fileName", fileName.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            if (body == null) throw new IllegalArgumentException("No request body");
            return new Request<UploadStatus>(getRequestExecutor(), builder.build()
                    , createInputStreamEntity(body)) {
                @Override
                public UploadStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpPost method = new HttpPost(uri);
                    method.setEntity(body);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new UploadStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<DeleteStatus> deleteProductGalleryImageApiUploadService(Number storeId, String token, Number id, Number fileId) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/products/" + id + "/gallery/" + fileId);
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            if (fileId == null) throw new IllegalArgumentException("No parameter fileId is set");

            return new Request<DeleteStatus>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public DeleteStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpDelete method = new HttpDelete(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new DeleteStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<DeleteStatus> clearProductGalleryApiUploadService(Number storeId, String token, Number id) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/products/" + id + "/gallery");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            return new Request<DeleteStatus>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public DeleteStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpDelete method = new HttpDelete(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new DeleteStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<DeleteStatus> deleteProductImageApiUploadService(Number storeId, String token, Number id) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/products/" + id + "/image");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            return new Request<DeleteStatus>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public DeleteStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpDelete method = new HttpDelete(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new DeleteStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<DeleteStatus> deleteProductFileApiUploadService(Number storeId, String token, Number id, Number fileId) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/products/" + id + "/files/" + fileId);
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            if (fileId == null) throw new IllegalArgumentException("No parameter fileId is set");

            return new Request<DeleteStatus>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public DeleteStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpDelete method = new HttpDelete(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new DeleteStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<DeleteStatus> clearProductFilesApiUploadService(Number storeId, String token, Number id) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/products/" + id + "/files");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            return new Request<DeleteStatus>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public DeleteStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpDelete method = new HttpDelete(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new DeleteStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<DeleteStatus> deleteCategoryImageApiUploadService(Number storeId, String token, Number id) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/categories/" + id + "/image");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            return new Request<DeleteStatus>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public DeleteStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpDelete method = new HttpDelete(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new DeleteStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<UploadStatus> uploadCategoryImageApiUploadService(Number storeId, String token, Number id, InputStream body) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/categories/" + id + "/image");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            if (body == null) throw new IllegalArgumentException("No request body");
            return new Request<UploadStatus>(getRequestExecutor(), builder.build()
                    , createInputStreamEntity(body)) {
                @Override
                public UploadStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpPost method = new HttpPost(uri);
                    method.setEntity(body);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new UploadStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<UploadStatus> uploadCombinationImageApiUploadService(Number storeId, String token, Number id, Number combinationId, InputStream body) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/products/" + id + "/combinations/" + combinationId + "/image");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            if (combinationId == null) throw new IllegalArgumentException("No parameter combinationId is set");

            if (body == null) throw new IllegalArgumentException("No request body");
            return new Request<UploadStatus>(getRequestExecutor(), builder.build()
                    , createInputStreamEntity(body)) {
                @Override
                public UploadStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpPost method = new HttpPost(uri);
                    method.setEntity(body);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new UploadStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<DeleteStatus> deleteCombinationImageApiUploadService(Number storeId, String token, Number id, Number combinationId) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/products/" + id + "/combinations/" + combinationId + "/image");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            if (combinationId == null) throw new IllegalArgumentException("No parameter combinationId is set");

            return new Request<DeleteStatus>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public DeleteStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpDelete method = new HttpDelete(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new DeleteStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<UploadStatus> uploadOrderItemOptionFileApiUploadService(Number storeId, String token, Number orderNumber, Number itemId, String optionName, String fileName, InputStream body) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/orders/" + orderNumber + "/items/" + itemId + "/options/" + optionName);
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (orderNumber == null) throw new IllegalArgumentException("No parameter orderNumber is set");

            if (itemId == null) throw new IllegalArgumentException("No parameter itemId is set");

            if (optionName == null) throw new IllegalArgumentException("No parameter optionName is set");

            if (fileName == null) throw new IllegalArgumentException("No parameter fileName is set");
            builder.setParameter("fileName", fileName.toString());
            if (body == null) throw new IllegalArgumentException("No request body");
            return new Request<UploadStatus>(getRequestExecutor(), builder.build()
                    , createInputStreamEntity(body)) {
                @Override
                public UploadStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpPost method = new HttpPost(uri);
                    method.setEntity(body);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new UploadStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<DeleteStatus> deleteOrderItemOptionFileApiUploadService(Number storeId, String token, Number orderNumber, Number itemId, String optionName, Number fileId) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/orders/" + orderNumber + "/items/" + itemId + "/options/" + optionName + "/files/" + fileId);
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (orderNumber == null) throw new IllegalArgumentException("No parameter orderNumber is set");

            if (itemId == null) throw new IllegalArgumentException("No parameter itemId is set");

            if (optionName == null) throw new IllegalArgumentException("No parameter optionName is set");

            if (fileId == null) throw new IllegalArgumentException("No parameter fileId is set");

            return new Request<DeleteStatus>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public DeleteStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpDelete method = new HttpDelete(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new DeleteStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<DeleteStatus> clearOrderItemOptionFilesApiUploadService(Number storeId, String token, Number orderNumber, Number itemId, String optionName) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/orders/" + orderNumber + "/items/" + itemId + "/options/" + optionName + "/files");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (orderNumber == null) throw new IllegalArgumentException("No parameter orderNumber is set");

            if (itemId == null) throw new IllegalArgumentException("No parameter itemId is set");

            if (optionName == null) throw new IllegalArgumentException("No parameter optionName is set");

            return new Request<DeleteStatus>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public DeleteStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpDelete method = new HttpDelete(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new DeleteStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<UploadStatus> uploadProfileLogoApiUploadService(Number storeId, String token, InputStream body) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/profile/logo");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (body == null) throw new IllegalArgumentException("No request body");
            return new Request<UploadStatus>(getRequestExecutor(), builder.build()
                    , createInputStreamEntity(body)) {
                @Override
                public UploadStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpPost method = new HttpPost(uri);
                    method.setEntity(body);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new UploadStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<UploadStatus> uploadInvoiceLogoApiUploadService(Number storeId, String token, InputStream body) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/profile/invoicelogo");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (body == null) throw new IllegalArgumentException("No request body");
            return new Request<UploadStatus>(getRequestExecutor(), builder.build()
                    , createInputStreamEntity(body)) {
                @Override
                public UploadStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpPost method = new HttpPost(uri);
                    method.setEntity(body);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new UploadStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<UploadStatus> uploadEmailLogoApiUploadService(Number storeId, String token, InputStream body) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/profile/emaillogo");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (body == null) throw new IllegalArgumentException("No request body");
            return new Request<UploadStatus>(getRequestExecutor(), builder.build()
                    , createInputStreamEntity(body)) {
                @Override
                public UploadStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpPost method = new HttpPost(uri);
                    method.setEntity(body);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new UploadStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<DeleteStatus> deleteProfileLogoApiUploadService(Number storeId, String token) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/profile/logo");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            return new Request<DeleteStatus>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public DeleteStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpDelete method = new HttpDelete(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new DeleteStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<DeleteStatus> deleteInvoiceLogoApiUploadService(Number storeId, String token) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/profile/invoicelogo");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            return new Request<DeleteStatus>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public DeleteStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpDelete method = new HttpDelete(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new DeleteStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<DeleteStatus> deleteEmailLogoApiUploadService(Number storeId, String token) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/profile/emaillogo");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            return new Request<DeleteStatus>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public DeleteStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpDelete method = new HttpDelete(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new DeleteStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<List<Combination>> getCombinationsProductApiService(Number storeId, String token, Number id) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/products/" + id + "/combinations");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            return new Request<List<Combination>>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public List<Combination> execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpGet method = new HttpGet(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON array.");
                        JSONArray list = new JSONArray(EntityUtils.toString(entity));
                        List<Combination> result = new ArrayList<Combination>(list.length());
                        for (int i = 0; i < list.length(); i++) {
                            result.add(new Combination(list.getJSONObject(i)));
                        }
                        return result;
                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<Combination> getCombinationProductApiService(Number storeId, String token, Number id, Number combinationId) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/products/" + id + "/combinations/" + combinationId);
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            if (combinationId == null) throw new IllegalArgumentException("No parameter combinationId is set");

            return new Request<Combination>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public Combination execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpGet method = new HttpGet(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new Combination(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<CreateStatus> createCombinationProductApiService(Number storeId, String token, Number id, Combination body) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/products/" + id + "/combinations");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            if (body == null) throw new IllegalArgumentException("No request body");
            return new Request<CreateStatus>(getRequestExecutor(), builder.build()
                    , new StringEntity(body.asJson().toString(), ContentType.APPLICATION_JSON)) {
                @Override
                public CreateStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpPost method = new HttpPost(uri);
                    method.setEntity(body);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new CreateStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<UpdateStatus> updateCombinationProductApiService(Number storeId, String token, Number id, Number combinationId, Combination body) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/products/" + id + "/combinations/" + combinationId);
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            if (combinationId == null) throw new IllegalArgumentException("No parameter combinationId is set");

            if (body == null) throw new IllegalArgumentException("No request body");
            return new Request<UpdateStatus>(getRequestExecutor(), builder.build()
                    , new StringEntity(body.asJson().toString(), ContentType.APPLICATION_JSON)) {
                @Override
                public UpdateStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpPut method = new HttpPut(uri);
                    method.setEntity(body);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new UpdateStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<DeleteStatus> clearCombinationsProductApiService(Number storeId, String token, Number id) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/products/" + id + "/combinations");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            return new Request<DeleteStatus>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public DeleteStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpDelete method = new HttpDelete(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new DeleteStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<DeleteStatus> deleteCombinationProductApiService(Number storeId, String token, Number id, Number combinationId) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/products/" + id + "/combinations/" + combinationId);
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            if (combinationId == null) throw new IllegalArgumentException("No parameter combinationId is set");

            return new Request<DeleteStatus>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public DeleteStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpDelete method = new HttpDelete(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new DeleteStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<Category> getCategoryService(Number storeId, Number id, String token) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/categories/" + id);
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            return new Request<Category>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public Category execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpGet method = new HttpGet(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new Category(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<CategorySearchResult> listCategoryService(Number storeId, String token, Number parent, Boolean hidden_categories, Boolean productIds, Number limit, Number offset) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/categories");
            if (token != null) builder.setParameter("token", token.toString());
            if (parent != null) builder.setParameter("parent", parent.toString());
            if (hidden_categories != null) builder.setParameter("hidden_categories", hidden_categories.toString());
            if (productIds != null) builder.setParameter("productIds", productIds.toString());
            if (limit != null) builder.setParameter("limit", limit.toString());
            if (offset != null) builder.setParameter("offset", offset.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            return new Request<CategorySearchResult>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public CategorySearchResult execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpGet method = new HttpGet(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new CategorySearchResult(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<CreateStatus> createCategoryService(Number storeId, String token, Category body) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/categories");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (body == null) throw new IllegalArgumentException("No request body");
            return new Request<CreateStatus>(getRequestExecutor(), builder.build()
                    , new StringEntity(body.asJson().toString(), ContentType.APPLICATION_JSON)) {
                @Override
                public CreateStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpPost method = new HttpPost(uri);
                    method.setEntity(body);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new CreateStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<DeleteStatus> deleteCategoryService(Number storeId, Number id, String token) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/categories/" + id);
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            return new Request<DeleteStatus>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public DeleteStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpDelete method = new HttpDelete(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new DeleteStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<UpdateStatus> updateCategoryService(Number storeId, Number id, String token, Category body) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/categories/" + id);
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            if (body == null) throw new IllegalArgumentException("No request body");
            return new Request<UpdateStatus>(getRequestExecutor(), builder.build()
                    , new StringEntity(body.asJson().toString(), ContentType.APPLICATION_JSON)) {
                @Override
                public UpdateStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpPut method = new HttpPut(uri);
                    method.setEntity(body);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new UpdateStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<List<ProductClass>> listClassesProductApiService(Number storeId, String token) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/classes");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            return new Request<List<ProductClass>>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public List<ProductClass> execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpGet method = new HttpGet(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON array.");
                        JSONArray list = new JSONArray(EntityUtils.toString(entity));
                        List<ProductClass> result = new ArrayList<ProductClass>(list.length());
                        for (int i = 0; i < list.length(); i++) {
                            result.add(new ProductClass(list.getJSONObject(i)));
                        }
                        return result;
                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<ProductClass> getClassByIdProductApiService(Number storeId, Number id, String token) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/classes/" + id);
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            return new Request<ProductClass>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public ProductClass execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpGet method = new HttpGet(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new ProductClass(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<DeleteStatus> removeClassByIdProductApiService(Number storeId, Number id, String token) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/classes/" + id);
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            return new Request<DeleteStatus>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public DeleteStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpDelete method = new HttpDelete(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new DeleteStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<UpdateStatus> updateProductClassProductApiService(Number storeId, Number id, String token, ProductClass body) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/classes/" + id);
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            if (body == null) throw new IllegalArgumentException("No request body");
            return new Request<UpdateStatus>(getRequestExecutor(), builder.build()
                    , new StringEntity(body.asJson().toString(), ContentType.APPLICATION_JSON)) {
                @Override
                public UpdateStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpPut method = new HttpPut(uri);
                    method.setEntity(body);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new UpdateStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<CreateStatus> createProductClassProductApiService(Number storeId, String token, ProductClass body) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/classes");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (body == null) throw new IllegalArgumentException("No request body");
            return new Request<CreateStatus>(getRequestExecutor(), builder.build()
                    , new StringEntity(body.asJson().toString(), ContentType.APPLICATION_JSON)) {
                @Override
                public CreateStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpPost method = new HttpPost(uri);
                    method.setEntity(body);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new CreateStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<OrderSearchResult> getOrdersOrderApiService(Number storeId, String token, Number limit, Number offset, String couponCode, Number orderNumber, Number totalFrom, Number totalTo, String customer, String createdFrom, String createdTo, String paymentMethod, String vendorNumber, String shippingMethod, String keywords, String fulfillmentStatus, String paymentStatus, String updatedFrom, String updatedTo) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/orders");
            if (token != null) builder.setParameter("token", token.toString());
            if (limit != null) builder.setParameter("limit", limit.toString());
            if (offset != null) builder.setParameter("offset", offset.toString());
            if (couponCode != null) builder.setParameter("couponCode", couponCode.toString());
            if (orderNumber != null) builder.setParameter("orderNumber", orderNumber.toString());
            if (totalFrom != null) builder.setParameter("totalFrom", totalFrom.toString());
            if (totalTo != null) builder.setParameter("totalTo", totalTo.toString());
            if (customer != null) builder.setParameter("customer", customer.toString());
            if (createdFrom != null) builder.setParameter("createdFrom", createdFrom.toString());
            if (createdTo != null) builder.setParameter("createdTo", createdTo.toString());
            if (paymentMethod != null) builder.setParameter("paymentMethod", paymentMethod.toString());
            if (vendorNumber != null) builder.setParameter("vendorNumber", vendorNumber.toString());
            if (shippingMethod != null) builder.setParameter("shippingMethod", shippingMethod.toString());
            if (keywords != null) builder.setParameter("keywords", keywords.toString());
            if (fulfillmentStatus != null) builder.setParameter("fulfillmentStatus", fulfillmentStatus.toString());
            if (paymentStatus != null) builder.setParameter("paymentStatus", paymentStatus.toString());
            if (updatedFrom != null) builder.setParameter("updatedFrom", updatedFrom.toString());
            if (updatedTo != null) builder.setParameter("updatedTo", updatedTo.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            return new Request<OrderSearchResult>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public OrderSearchResult execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpGet method = new HttpGet(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new OrderSearchResult(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<Order> getOrderOrderApiService(Number storeId, String token, Number orderNumber) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/orders/" + orderNumber);
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (orderNumber == null) throw new IllegalArgumentException("No parameter orderNumber is set");

            return new Request<Order>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public Order execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpGet method = new HttpGet(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new Order(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<CreateStatus> createOrderOrderApiService(Number storeId, String token, Order body) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/orders");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (body == null) throw new IllegalArgumentException("No request body");
            return new Request<CreateStatus>(getRequestExecutor(), builder.build()
                    , new StringEntity(body.asJson().toString(), ContentType.APPLICATION_JSON)) {
                @Override
                public CreateStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpPost method = new HttpPost(uri);
                    method.setEntity(body);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new CreateStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<UpdateStatus> updateOrderOrderApiService(Number storeId, Number orderNumber, String token, Order body) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/orders/" + orderNumber);
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (orderNumber == null) throw new IllegalArgumentException("No parameter orderNumber is set");

            if (body == null) throw new IllegalArgumentException("No request body");
            return new Request<UpdateStatus>(getRequestExecutor(), builder.build()
                    , new StringEntity(body.asJson().toString(), ContentType.APPLICATION_JSON)) {
                @Override
                public UpdateStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpPut method = new HttpPut(uri);
                    method.setEntity(body);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new UpdateStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<DeleteStatus> removeOrderOrderApiService(Number storeId, Number orderNumber, String token) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/orders/" + orderNumber);
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (orderNumber == null) throw new IllegalArgumentException("No parameter orderNumber is set");

            return new Request<DeleteStatus>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public DeleteStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpDelete method = new HttpDelete(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new DeleteStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<Profile> getProfileApiService(Number storeId, String token) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/profile");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            return new Request<Profile>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public Profile execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpGet method = new HttpGet(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new Profile(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<UpdateStatus> updateProfileApiService(Number storeId, String token, Profile body) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/profile");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (body == null) throw new IllegalArgumentException("No request body");
            return new Request<UpdateStatus>(getRequestExecutor(), builder.build()
                    , new StringEntity(body.asJson().toString(), ContentType.APPLICATION_JSON)) {
                @Override
                public UpdateStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpPut method = new HttpPut(uri);
                    method.setEntity(body);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new UpdateStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<LatestStats> getStatsApiService(Number storeId, String token) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/latest-stats");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            return new Request<LatestStats>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public LatestStats execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpGet method = new HttpGet(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new LatestStats(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<Customer> getCustomerApiService(Number storeId, String token, Number id) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/customers/" + id);
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            return new Request<Customer>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public Customer execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpGet method = new HttpGet(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new Customer(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<CustomerSearchResult> searchCustomerApiService(Number storeId, String keyword, String name, String email, Number minOrderCount, Number maxOrderCount, String sortBy, Number offset, Number limit, String token) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/customers");
            if (keyword != null) builder.setParameter("keyword", keyword.toString());
            if (name != null) builder.setParameter("name", name.toString());
            if (email != null) builder.setParameter("email", email.toString());
            if (minOrderCount != null) builder.setParameter("minOrderCount", minOrderCount.toString());
            if (maxOrderCount != null) builder.setParameter("maxOrderCount", maxOrderCount.toString());
            if (sortBy != null) builder.setParameter("sortBy", sortBy.toString());
            if (offset != null) builder.setParameter("offset", offset.toString());
            if (limit != null) builder.setParameter("limit", limit.toString());
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            return new Request<CustomerSearchResult>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public CustomerSearchResult execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpGet method = new HttpGet(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new CustomerSearchResult(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<DeleteStatus> deleteCustomerApiService(Number storeId, Number id, String token) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/customers/" + id);
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            return new Request<DeleteStatus>(getRequestExecutor(), builder.build()
            ) {
                @Override
                public DeleteStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpDelete method = new HttpDelete(uri);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new DeleteStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<CreateStatus> createCustomerApiService(Number storeId, String token, Customer body) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/customers");
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (body == null) throw new IllegalArgumentException("No request body");
            return new Request<CreateStatus>(getRequestExecutor(), builder.build()
                    , new StringEntity(body.asJson().toString(), ContentType.APPLICATION_JSON)) {
                @Override
                public CreateStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpPost method = new HttpPost(uri);
                    method.setEntity(body);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new CreateStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Request<UpdateStatus> updateCustomerApiService(Number storeId, String token, Number id, Customer body) {
        try {
            URIBuilder builder = new URIBuilder(url + "/" + storeId + "/customers/" + id);
            if (token != null) builder.setParameter("token", token.toString());

            if (storeId == null) throw new IllegalArgumentException("No parameter storeId is set");

            if (id == null) throw new IllegalArgumentException("No parameter id is set");

            if (body == null) throw new IllegalArgumentException("No request body");
            return new Request<UpdateStatus>(getRequestExecutor(), builder.build()
                    , new StringEntity(body.asJson().toString(), ContentType.APPLICATION_JSON)) {
                @Override
                public UpdateStatus execute(RequestExecutor executor) throws IOException, JSONException {
                    HttpPut method = new HttpPut(uri);
                    method.setEntity(body);
                    try {
                        HttpResponse response = executor.execute(method);
                        if (response.getStatusLine().getStatusCode() >= 400) {
                            throw new IOException("Unexpected HTTP status: " + response.getStatusLine());
                        }
                        HttpEntity entity = response.getEntity();
                        if (entity == null) throw new JSONException("No response. Expected JSON object.");
                        return new UpdateStatus(new JSONObject(EntityUtils.toString(entity)));

                    } finally {
                        method.releaseConnection();
                    }
                }
            };
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private InputStreamEntity createInputStreamEntity(InputStream body) {
        String contentType = body instanceof HasContentType ? ((HasContentType) body).getContentType() : "application/octet-stream";
        long contentLength = body instanceof HasContentLength ? ((HasContentLength) body).getContentLength() : -1;
        InputStreamEntity ise = new InputStreamEntity(body, contentLength);
        if (contentType != null) ise.setContentType(contentType);
        return ise;
    }

}
			
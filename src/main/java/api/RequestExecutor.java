package api;

import org.apache.http.client.methods.*;
import org.apache.http.client.*;
import org.apache.http.*;

import java.io.IOException;

public interface RequestExecutor {
    public HttpResponse execute(HttpUriRequest request) throws IOException, ClientProtocolException;
}

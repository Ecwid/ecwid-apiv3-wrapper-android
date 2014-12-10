package api;

public interface HasContentType {
    /**
     * @return What content-type should be used instead the default 'application/octet-stream'.
     */
    String getContentType();
}

package api;

public interface HasContentLength {
    /**
     * @return The value of the content-length header.
     */
    long getContentLength();
}

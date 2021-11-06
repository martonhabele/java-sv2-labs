package stringmethods.url;

public class UrlManager {
    private String protocol;
    private int port;
    private String host;
    private String path;
    private String query;

    public UrlManager(String url) {
        this.protocol = getProtocol(url);
        this.port = getPort();
        this.host = getHost(url);
        this.path = path;
        this.query = query;
    }

    public String getProtocol(String url) {
        return url.substring(0, url.indexOf("://")).toLowerCase();
    }

    public int getPort() {
        return 80;
    }

    public String getHost(String url) {
        url = url.toLowerCase();
        int startPoint = url.indexOf("://") + 3;
        int endPoint = url.indexOf("/", startPoint);
        return url.substring(startPoint, endPoint);
    }

    public String getPath(String url) {
        url = url.toLowerCase();
        int startPoint = url.indexOf("://") + 3;
        int midPoint = url.indexOf("/", startPoint);
        int endPoint = url.indexOf("?", midPoint);
        return url.substring(midPoint, endPoint);
    }

}
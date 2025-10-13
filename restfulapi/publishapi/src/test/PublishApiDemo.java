
package test;

/**
 * Function description.
 *
 * @author xxxxxxx
 * @since 2019-10-24
 */
public class PublishApiDemo {

    /**
     * Token domain name.
     */
    private static String domain = "https://connect-api.cloud.huawei.com/api/";

    /**
     * clientId
     */
    private static String clientId = "17*****92";

    /**
     * clientSecret
     */
    private static String clientSecret = "65***************D8";

    /**
     * App ID.
     */
    private static String appId = "57**********43";

    public static void main(String[] args) {
        // Obtain the token.
        String token = GetToken.getToken(domain, clientId, clientSecret);

        // Query app information.
        GetAppInfo.getAppInfo(domain, clientId, token, appId, "zh-CN");
    }

}

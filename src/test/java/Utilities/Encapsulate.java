package Utilities;

public class Encapsulate {
    final private static String userName = "i.kuddus@yahoo.com",
                                password = "kn110708sml",
                                webSite = "https://www.yahoo.com",
                                Browser = "Edge";

    //we use get method because it's final
    public static String getUserName(){
        return userName;
    }

    public static String getPassword(){
        return password;
    }

    public static String getWebSite(){
        return webSite;
    }

    public static String getBrowser(){return Browser;}

}

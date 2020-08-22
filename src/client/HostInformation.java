package client;

public class HostInformation {
    public static final String ip = "192.168.0.103";
    public static final int port = 1998;
    public static final String serverName = "Server";
    public static final String host = "rmi://" + ip + ":" + port + "/" + serverName;
}

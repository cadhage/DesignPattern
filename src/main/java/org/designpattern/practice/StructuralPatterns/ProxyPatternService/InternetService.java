package org.designpattern.practice.StructuralPatterns.ProxyPatternService;
public class InternetService {
    private RealInternet realInternet = new RealInternet();

    public void connectTo(String serverHost) {
        try {
            // Restrict access to banned websites
            if (serverHost.equals("banned.com")) {
                throw new Exception("Access Denied to " + serverHost);
            }
            realInternet.connectTo(serverHost);  // Proxy forwards the connection to RealInternet
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

interface Internet {
    void connectTo(String serverHost);
}

class RealInternet implements Internet {
    public void connectTo(String serverHost) {
        System.out.println("Connecting to " + serverHost);  // Actual connection to the server
    }
}

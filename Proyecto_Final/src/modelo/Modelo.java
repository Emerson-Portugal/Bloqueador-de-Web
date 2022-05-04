package modelo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Modelo {
    
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void blockSite(String url) throws IOException {

        String OS = System.getProperty("os.name").toLowerCase();

        String hostsFile = "";
        if ((OS.indexOf("win") >= 0)) {

            hostsFile = "C:/Windows/System32/drivers/etc/hosts";
        } else {
            // Handle error when platform is not Windows, Mac, or Linux
            System.err.println("Sorry, but your OS doesn't support blocking.");
            System.exit(0);
        }

        // Actually block site

        Files.write(Paths.get(hostsFile), ("127.0.0.1 " + url).getBytes(), StandardOpenOption.APPEND);
    }

}

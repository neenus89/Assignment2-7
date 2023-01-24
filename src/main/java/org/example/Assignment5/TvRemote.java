package org.example.Assignment5;

public interface TvRemote {
    void turnOnTy();
    void turnOffTv();
    void turnVolumeDown();
    void turnVolumeUp();
    void switchChannels();
}

interface smartTvRemote extends TvRemote {
 void  wifiConnectionSetting();
 void browsingApps();

}
class SmartTv implements smartTvRemote {
    public void turnOnTy(){
        System.out.println("Turn on tv");
    }

    public void turnOffTv() {
        System.out.println("Turn off tv");
    }

    public void turnVolumeDown() {
        System.out.println("Turn volume down");
    }

    public void turnVolumeUp() {
        System.out.println("Turn volume up");
    }

    public  void switchChannels() {
        System.out.println("Switch channels");
    }

    public void wifiConnectionSetting() {
        System.out.println("Wifi connection settings");
    }

    public void browsingApps() {
        System.out.println("Browser settings");
    }

}

class MainTvClass {
    public static void main(String [] args) {
        SmartTv tv = new SmartTv();
        tv.browsingApps();
        tv.turnVolumeDown();
        tv.switchChannels();
        tv.turnOffTv();
        tv.turnVolumeUp();
        tv.turnOnTy();
        tv.wifiConnectionSetting();
    }
}



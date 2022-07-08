package structural.bridge;

import java.util.List;

public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int value);

    String getChannel();

    void setChannel(String value);

    List<String> getChanelList();

}

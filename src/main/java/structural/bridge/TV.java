package structural.bridge;

import lombok.ToString;

import java.util.List;

@ToString
public class TV implements Device {
    private boolean enabled;
    private int volume;
    private final List<String> channels;
    private String channel;

    public TV(int volume, List<String> channels, String channel) {
        this.enabled = false;
        this.volume = volume;
        this.channels = channels;
        this.channel = channel;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        enabled = true;
    }

    @Override
    public void disable() {
        enabled = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int value) {
        volume = value;
    }

    @Override
    public String getChannel() {
        return channel;
    }

    @Override
    public void setChannel(String value) {
        channel = value;
    }

    @Override
    public List<String> getChanelList() {
        return channels;
    }
}

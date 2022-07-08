package structural.bridge;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Remote {
    private final Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public void volumeDown() {
        if (device.isEnabled()) {
            device.setVolume(device.getVolume() - 1);
        }
    }

    public void volumeUp() {
        if (device.isEnabled()) {
            device.setVolume(device.getVolume() + 1);
        }
    }

    public void channelDown() {
        if (device.isEnabled()) {
            int currentChannelIndex = device.getChanelList().indexOf(device.getChannel());
            try {
                device.setChannel(device.getChanelList().get(currentChannelIndex - 1));
            }catch (Exception e){
                device.setChannel(device.getChanelList().get(device.getChanelList().size() - 1));
            }
        }
    }

    public void channelUp() {
        if (device.isEnabled()) {
            int currentChannelIndex = device.getChanelList().indexOf(device.getChannel());
            try {
                device.setChannel(device.getChanelList().get(currentChannelIndex + 1));
            }catch (Exception e){
                device.setChannel(device.getChanelList().get(0));
            }
        }
    }

}

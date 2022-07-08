package structural.bridge;

import lombok.ToString;

@ToString
public class AdvancedRemote extends Remote{
    private boolean muted;
    private int savedVolumeBeforeMute;

    public AdvancedRemote(Device device) {
        super(device);
        muted = false;
    }

    public void mute(){
        if (super.getDevice().isEnabled()){
            if (muted){
                //unmute process
                super.getDevice().setVolume(savedVolumeBeforeMute);
                muted = false;
            }else {
                //mute process
                savedVolumeBeforeMute = super.getDevice().getVolume();
                super.getDevice().setVolume(0);
                muted = true;
            }
        }
    }
}

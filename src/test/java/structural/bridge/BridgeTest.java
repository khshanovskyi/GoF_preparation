package structural.bridge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BridgeTest {

    private  List<String> radioChannels;
    private  Device radio;
    private  Remote remote;

    @BeforeEach
    void setUp() {
        radioChannels = List.of("Nashe radio", "HitFM", "RadioRada");
        radio = new Radio(10, radioChannels, radioChannels.get(0));
        remote = new Remote(radio);

        remote.togglePower();
    }

    @Test
    void togglePower() {
        assertTrue(remote.getDevice().isEnabled());
        remote.togglePower();
        assertFalse(remote.getDevice().isEnabled());
    }

    @Test
    void volumeDown() {
        assertTrue(remote.getDevice().isEnabled());
        remote.volumeDown();
        assertEquals(9, remote.getDevice().getVolume());
    }

    @Test
    void volumeUp() {
        assertTrue(remote.getDevice().isEnabled());
        remote.volumeUp();
        assertEquals(11, remote.getDevice().getVolume());
    }

    @Test
    void channelDown() {
        assertTrue(remote.getDevice().isEnabled());
        remote.channelDown();
        assertEquals("RadioRada", remote.getDevice().getChannel());
        remote.channelDown();
        assertEquals("HitFM", remote.getDevice().getChannel());
    }

    @Test
    void channelUp() {
        assertTrue(remote.getDevice().isEnabled());
        remote.channelUp();
        assertEquals("HitFM", remote.getDevice().getChannel());
        remote.channelUp();
        assertEquals("RadioRada", remote.getDevice().getChannel());
    }

    @Test
    void mute() {
        Device tv = new TV(5, Collections.emptyList(), "");
        AdvancedRemote advancedRemote = new AdvancedRemote(tv);

        advancedRemote.togglePower();
        assertTrue(advancedRemote.getDevice().isEnabled());

        advancedRemote.mute();
        assertEquals(0, advancedRemote.getDevice().getVolume());
        advancedRemote.mute();
        assertEquals(5, advancedRemote.getDevice().getVolume());
    }
}
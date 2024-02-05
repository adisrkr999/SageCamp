package ObjectOrientedProgramming;
public class TestTV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        System.out.println("tv1's channel is "+tv1.channel
        + " and the volume level is "+ tv1.volumeLevel);
        tv1.channelUp();
        for(int i =0; i<3;i++) {
            tv1.volumeUp();
        }

        tv1.volumeDown();

        System.out.println("tv1's channel is "+tv1.channel + " and the volume level is "+ tv1.volumeLevel);

        tv1.turnOff();
        tv1.channelDown();

        System.out.println("tv1's channel is "+tv1.channel + " and the volume level is "+ tv1.volumeLevel);
    }
}

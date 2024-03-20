package com.example.chap02;

public class TV {
    boolean onOff;
    int volume;
    int channel;

    public void pushOnOffButton() {
        onOff = !onOff;
        if (onOff) {
            System.out.println("TV 켜짐");
        } else {
            System.out.println("TV 꺼짐");
        }
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("볼륨 " + volume + " 로 변경");
    }

    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("채널 " + channel + " 로 변경");
    }

    public void currentStatus() {
        if (!onOff) {
            System.out.println("TV가 꺼져 있습니다.");
        } else {
            System.out.println("채널 : " + channel + " , 볼륨 : " + volume);
        }
    }

    public static void main(String[] args) {
        TV tv = new TV();

        tv.onOff = false;
        tv.volume = 10;
        tv.channel = 5;

        tv.pushOnOffButton();
        tv.setVolume(20);
        tv.setChannel(11);
        tv.currentStatus();

        tv.pushOnOffButton();
        tv.currentStatus();
    }
}

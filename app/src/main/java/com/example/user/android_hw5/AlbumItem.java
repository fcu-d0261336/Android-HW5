package com.example.user.android_hw5;

/**
 * Created by user on 2017/5/1.
 */

public class AlbumItem {
    private int hostImgId;

    private String hostName;

    private String hostScore;

    private int guestImgId;

    private String guestName;

    private String guestScore;

    public AlbumItem(int hostImgId, String hostName, String hostScore, int guestImgId, String guesttName, String guestScore){
        this.hostImgId = hostImgId;
        this.hostName = hostName;
        this.hostScore = hostScore;
        this.guestImgId = guestImgId;
        this.guestName = guesttName;
        this.guestScore = guestScore;

    }

   public int getHostImgId() {
        return hostImgId;
    }

    public String getHostName() {
        return hostName;
    }

    public String getHostScore() {
        return hostScore;
    }

    public int getGuestImdId() {
        return guestImgId;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getGuestScore() {
        return guestScore;
    }
}

package com.sapuan.blackcloverrecyclerview;

import android.os.Parcel;
import android.os.Parcelable;

public class BlackClover implements Parcelable {
    private String name, remarks, photo;
    private String team, info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    private BlackClover(Parcel in) {
        this.name = in.readString();
        this.remarks = in.readString();
        this.photo = in.readString();
        this.team = in.readString();
        this.info = in.readString();
    }

    BlackClover() {

    }

    public static final Parcelable.Creator<BlackClover> CREATOR = new Parcelable.Creator<BlackClover>() {
        @Override
        public BlackClover createFromParcel(Parcel source) {
            return new BlackClover(source);
        }

        @Override
        public BlackClover[] newArray(int size) {
            return new BlackClover[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.remarks);
        dest.writeString(this.photo);
        dest.writeString(this.team);
        dest.writeString(this.info);
    }
}

package me.sabarirangan.apps.findpeoples.model;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by sabari on 20-04-2017.
 */

public class UserProfile extends RealmObject {
    private User user;
    private String avatar;
    private String mobile;
    private RealmList<Tags> skills;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public RealmList<Tags> getSkills() {
        return skills;
    }

    public void setSkills(RealmList<Tags> skills) {
        this.skills = skills;
    }
}

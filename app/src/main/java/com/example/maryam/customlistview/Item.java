package com.example.maryam.customlistview;

public class Item {
    private String imgAvatar;
    private String txtName;
    public Item(String imgAvatar, String txtName) {
        this.imgAvatar = imgAvatar;
        this.txtName = txtName;
    }

    public String getImgAvatar() {
        return imgAvatar;
    }

    public void setImgAvatar(String imgAvatar) {
        this.imgAvatar = imgAvatar;
    }

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }
}

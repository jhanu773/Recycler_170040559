package com.example.recycler_170040559;

public class MyMobileData {
    private String mobileName;
    private Integer mobileImage;

    public MyMobileData(String mobileName, Integer mobileImage) {
        this.mobileName = mobileName;
        this.mobileImage = mobileImage;
    }
    public String getMobileName(){
        return mobileName;
    }
    public void setMobileName(String mobileName){
        this.mobileName = mobileName;
    }
    public Integer getMobileImage(){
        return mobileImage;
    }
}

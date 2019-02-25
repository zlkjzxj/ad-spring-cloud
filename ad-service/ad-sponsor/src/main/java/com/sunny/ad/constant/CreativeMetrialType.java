package com.sunny.ad.constant;

import lombok.Getter;

@Getter
public enum CreativeMetrialType {
    JPG(1, "jpg"),
    BMP(2, "bmp"),
    MP4(3, "mp4"),
    AVI(4, "avi"),
    TEXT(5, "text");
    private Integer type;
    private String desc;

    CreativeMetrialType(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}

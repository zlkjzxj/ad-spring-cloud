package com.sunny.ad.constant;

import lombok.Getter;

/**
 * @Description TODO
 * @Author sunny
 * Date 2019\2\20 0020 15:12
 */
@Getter
public enum CreativeType {
    IMAGE(1, "图片"),
    VIDEO(2, "视频"),
    TEXT(3, "文本");
    private Integer type;
    private String desc;

    CreativeType(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}

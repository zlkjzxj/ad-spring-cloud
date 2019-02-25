package com.sunny.ad.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @Description TODO
 * @Author sunny
 * Date 2019\2\20 0020 15:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ad_plan")
public class Creative {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;


    @Column(name = "name", nullable = false)
    private String name;

    /**
     * 图片、视频等
     */
    @Column(name = "type", nullable = false)
    private Integer type;

    /**
     * 物料类型，比如说图片可以是jpg、bmp等
     */
    @Column(name = "material_type", nullable = false)
    private Integer materialType;

    @Column(name = "height", nullable = false)
    private Integer height;

    @Column(name = "width", nullable = false)
    private Integer width;


    @Column(name = "size", nullable = false)
    private Integer size;

    /**
     * 持续时长，只有视频不为0
     */
    @Column(name = "duration", nullable = false)
    private Integer duration;

    /**
     * 审核状态 广告主上传的视频必须审核
     */
    @Column(name = "audit_status", nullable = false)
    private Integer auditStatus;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Basic
    @Column(name = "url", nullable = false)
    private String url;

    @Column(name = "create_time", nullable = false)
    private Date createTime;

    @Column(name = "update_time", nullable = false)
    private Date updateTime;
}

package com.johnson.model.entities;


import com.johnson.entities.BaseEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * 菜单对象
 */
@Table(name = "menu")
@Data
@Entity
public class MenuEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long menuId;

    @Column(length = 128)
    private String menuName;    // 菜单名

    @Column(length = 128)
    private String menuCode;    // 菜单代码

    @Column(length = 512)
    private String menuUrl;     // 菜单路由

    private Long weight;        // 菜单权重

    @Column(length = 512)
    private String remark;      // 备注
}

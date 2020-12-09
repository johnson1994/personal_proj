package com.johnson.model.entities;

import com.johnson.entities.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Table(name = "article_category")
@Data
@Entity
public class ArticleCategory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long categoryId;

    @Column(length = 128)
    private String title;   // 分类标题

    private Long weight;    // 分类权重（展示顺序）

    @Column(length = 512)
    private String remark;  // 备注


}

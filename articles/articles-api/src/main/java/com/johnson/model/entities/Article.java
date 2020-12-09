package com.johnson.model.entities;

import com.johnson.entities.BaseEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * 文章
 */
@Table(name = "article")
@Data
@Entity
public class Article extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long articleId;

    @Column(length = 128)
    private String title;       // 文章标题

    @Column(columnDefinition = "MEDIUMTEXT")
    private String content;     // 文章内容

    private Long weight;        // 文章权重（展示顺序）


}

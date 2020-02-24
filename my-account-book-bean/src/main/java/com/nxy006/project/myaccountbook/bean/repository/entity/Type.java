package com.nxy006.project.myaccountbook.bean.repository.entity;

import com.nxy006.project.myaccountbook.bean.common.BasicEntity;
import lombok.Data;

import javax.persistence.*;


/**
 * Type 分类实体类
 *
 * @author nxy006
 * @since 1.0
 */
@Entity
@Data
@Table(name = "t_types")
public class Type extends BasicEntity {

    /**
     * name 类型名称
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * description 类型描述
     */
    @Column(name = "description", nullable = false)
    private String description;

    /**
     * parentType 关联对象：父级类型
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Type parentType;
}

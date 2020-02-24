package com.nxy006.project.myaccountbook.bean.repository.entity;

import com.nxy006.project.myaccountbook.bean.common.BasicEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * CustomAttribute 自定义属性实体类
 *
 * @author nxy006
 * @since 1.0
 */
@Entity
@Data
@Table(name = "t_tags")
public class CustomAttribute extends BasicEntity {
}

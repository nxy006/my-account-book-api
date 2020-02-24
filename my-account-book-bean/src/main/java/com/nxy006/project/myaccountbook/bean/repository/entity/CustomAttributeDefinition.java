package com.nxy006.project.myaccountbook.bean.repository.entity;

import com.nxy006.project.myaccountbook.bean.common.BasicEntity;
import com.nxy006.project.myaccountbook.bean.repository.entity.enumerate.CustomAttributeType;
import lombok.Data;

import javax.persistence.*;

/**
 * CustomAttributeDefinition Comment
 *
 * @author nxy006
 * @since 1.0
 */
@Entity
@Data
@Table(name = "t_custom_attribute_definitions")
public class CustomAttributeDefinition extends BasicEntity {

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "type", nullable = false)
    private CustomAttributeType type;

    @Column(name = "description", nullable = false)
    private String description;
}

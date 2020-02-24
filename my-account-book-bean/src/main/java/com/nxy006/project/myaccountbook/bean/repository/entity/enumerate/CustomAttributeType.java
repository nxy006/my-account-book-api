package com.nxy006.project.myaccountbook.bean.repository.entity.enumerate;

import com.nxy006.project.myaccountbook.bean.common.PersistentEnumerate;

/**
 * CustomAttributeType
 *
 * @author nxy006
 * @since 1.0
 */
public enum CustomAttributeType implements PersistentEnumerate<CustomAttributeType> {
    TEXT(1, "text", "短文本");

    private Integer id;
    private String name;
    private String description;

    CustomAttributeType(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * 根据 id 值获取类型
     * @param id id 值
     * @return 枚举值
     */
    public static CustomAttributeType parserById(Integer id) {
        for (CustomAttributeType type : CustomAttributeType.values()) {
            if (type.getValue().equals(id)) {
                return type;
            }
        }
        throw new RuntimeException("parse CustomAttributeType with id failed, id: " + id);
    }

    @Override
    public CustomAttributeType getDefault() {
        return null;
    }

    @Override
    public Integer getValue() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

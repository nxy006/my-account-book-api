package com.nxy006.project.myaccountbook.bean.common;

/**
 * PersistentEnumerate Comment
 *
 * @author nxy006
 * @since 1.0
 */
public interface PersistentEnumerate<T> {

    /**
     * 获得默认值
     * @return default enum value
     */
    T getDefault();


    /**
     * 获取值
     * @return 获取 id 值
     */
    Integer getValue();
}

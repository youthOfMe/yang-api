package com.yangge.api.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 删除请求
 */
@Data
public class IdRequest implements Serializable {

    /**
     * ID
     */
    private Long id;
}

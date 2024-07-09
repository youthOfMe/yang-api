package com.yangge.api.model.dto.interfaceInfo;

import lombok.Data;

/**
 * 接口调用请求参数
 */
@Data
public class InterfaceInfoInvokeRequest {

    /**
     * id
     */
    private Long id;

    /**
     * 用户请求参数
     */
    private String userRequestParams;
}

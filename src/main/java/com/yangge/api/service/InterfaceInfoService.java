package com.yangge.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yangge.api.model.entity.InterfaceInfo;

/**
* @author 20406
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-07-06 18:39:43
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    /**
     * 校验
     *
     * @param interfaceInfo
     * @param add
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}

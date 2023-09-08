package com.weiwei.brainstormingcodesandbox.security;

import java.security.Permission;

/**
 * 禁用所有权限 安全管理器
 *
 * @Author weiwei
 * @Date 2023/9/6 12:08
 * @Version 1.0
 */
public class DenySecurityManager extends SecurityManager {

    @Override
    public void checkPermission(Permission perm) {
        throw new SecurityException("权限异常：" + perm.toString());
    }
}

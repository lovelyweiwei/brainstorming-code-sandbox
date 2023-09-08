package com.weiwei.brainstormingcodesandbox.security;

import java.security.Permission;

/**
 * 默认安全管理器
 *
 * @Author weiwei
 * @Date 2023/9/6 12:08
 * @Version 1.0
 */
public class DefaultSecurityManager extends SecurityManager {

    @Override
    public void checkPermission(Permission perm) {
        System.out.println("默认不作任何权限限制");
        //super.checkPermission(perm);
    }
}

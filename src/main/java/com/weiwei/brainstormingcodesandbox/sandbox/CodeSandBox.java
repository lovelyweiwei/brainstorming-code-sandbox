package com.weiwei.brainstormingcodesandbox.sandbox;

import com.weiwei.brainstormingcodesandbox.model.ExecuteCodeRequest;
import com.weiwei.brainstormingcodesandbox.model.ExecuteCodeResponse;

/**
 * @Author weiwei
 * @Date 2023/9/4 18:13
 * @Version 1.0
 */
public interface CodeSandBox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}

package com.weiwei.brainstormingcodesandbox.sandbox;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.dfa.WordTree;
import com.weiwei.brainstormingcodesandbox.model.ExecuteCodeRequest;
import com.weiwei.brainstormingcodesandbox.model.ExecuteCodeResponse;
import com.weiwei.brainstormingcodesandbox.model.ExecuteMessage;
import com.weiwei.brainstormingcodesandbox.model.JudgeInfo;
import com.weiwei.brainstormingcodesandbox.utils.ProcessUtils;
import org.springframework.stereotype.Component;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * @Author weiwei
 * @Date 2023/9/5 17:49
 * @Version 1.0
 */
@Component
public class JavaNativeCodeSandBox extends JavaCodeSandboxTemplate {

    @Override
    public File saveCodeToFile(String code) {
        File file = super.saveCodeToFile(code);
        System.out.println("askldjflasjdflas");
        return file;
    }

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return super.executeCode(executeCodeRequest);
    }
}


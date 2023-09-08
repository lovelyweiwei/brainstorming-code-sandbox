package com.weiwei.brainstormingcodesandbox.model;

import lombok.Data;

/**
 * 题目
 *
 * @Author weiwei
 * @Date 2023/8/31 19:58
 * @Version 1.0
 */
@Data
public class JudgeInfo {
    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 消耗内存(KB)
     */
    private Long memory;

    /**
     * 消耗时间 (ms)
     */
    private Long time;
}

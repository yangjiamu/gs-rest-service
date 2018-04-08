package com.study.springboot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

/**
 * Created by wenjie yang on 2018/4/8.
 */
@Getter
@ToString
@AllArgsConstructor
public class Greeting {
    private final Long id;
    private final String contetn;
}

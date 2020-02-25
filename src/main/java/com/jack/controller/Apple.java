package com.jack.controller;

import lombok.Builder;
import lombok.Data;

/**
 * @author chaiguanguan
 * @className apple
 * @description
 * @date 2020/2/25 14:16
 **/
@Data
@Builder
public class Apple {
    private String color;
    private int size;
    private String band;
}

package com.zhiyou100.file.test;

import org.junit.Test;

public class Test01 {
    @Test
    public void testFast(){
        for (int i = 0; i < 10000000; i++) {
            System.out.println("有多少？"+i);
        }
    }
}

package com.test;

import java.util.List;

/**
 * @author zhuyongging @ Zhihu Inc.
 * @since 07-20-2019
 */
public class BusinessGreen implements IContainerInterface<String> {

    @Override
    public void loadInto(List<? super String> list) {
        list.add("this is green");
    }
}

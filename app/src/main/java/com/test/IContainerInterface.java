package com.test;

import java.util.List;

/**
 * @author zhuyongging @ Zhihu Inc.
 * @since 07-20-2019
 */
public interface IContainerInterface<T> {

    void loadInto(List<? super T> list);
}

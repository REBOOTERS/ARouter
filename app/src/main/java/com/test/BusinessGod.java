package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhuyongging @ Zhihu Inc.
 * @since 07-20-2019
 */
public final class BusinessGod {
    private List<String> allBusiness = new ArrayList<>();
    private BusinessBlue mBusinessBlue;
    private BusinessGreen mBusinessGreen;
    private BusinessRed mBusinessRed;

    public BusinessGod() {
        mBusinessBlue = new BusinessBlue();
        mBusinessGreen = new BusinessGreen();
        mBusinessRed = new BusinessRed();
    }

    public List<String> getAllBusiness() {
        mBusinessBlue.loadInto(allBusiness);
        mBusinessGreen.loadInto(allBusiness);
        mBusinessRed.loadInto(allBusiness);
        return allBusiness;
    }
}

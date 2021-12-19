package com.study.forever.web.controller;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaController<T> {

    public static void main(String[] args) {
        List ctyList = new ArrayList();
        ctyList.add(1);
        ctyList.add(2);
        ctyList.add(3);
        List countryList = new ArrayList();
        countryList.add(3);
        countryList.add(4);
        countryList.add(5);
        //集合过滤包含另一个集合的元素
        List fiterList = (List) ctyList.stream().filter(e -> !countryList.contains(e)).collect(Collectors.toList());
        for (int i = 0; i < fiterList.size(); i++) {
            System.out.println("fiterList:[" + i + "]=" + fiterList.get(i));
        }

    }
    //
    private List<T> getList (T t){

        return Lists.newArrayList();

    }

}

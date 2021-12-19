package com.study.forever.web.controller;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.study.forever.dao.model.Grade;
import com.study.forever.dao.model.Student;
import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LamdaController<T> {

    private static  Gson gson = new Gson();

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

        List<Student> students = Lists.newArrayList();
        for (int i = 0; i < 5; i++) {
            Student s1 = new Student();
            s1.setStudentId(i+1);
            s1.setName("名字"+ RandomUtils.nextInt(1,8));
            s1.setAge(i+1);
            s1.setGrade(RandomUtils.nextInt(1,5));
            students.add(s1);
        }

        List<Grade> grades = Lists.newArrayList();
        for (int i = 0; i < 3; i++) {
            Grade grade = new Grade();
            grade.setGradeId(i+1);
            grade.setGradeName(i+1+"年级");
            grade.setStudentId(RandomUtils.nextInt(1,5));
            grades.add(grade);
        }
        //
        Map<Integer,Object>  m =  grades.stream().collect(Collectors.toMap(Grade::getGradeId, Function.identity(),(key1, key2)->key2));

        System.out.printf("m:"+gson.toJson(m));


    }
    @Test
    private void test1(){
        List<Grade> grades = Lists.newArrayList();
        for (int i = 0; i < 3; i++) {
            Grade grade = new Grade();
            grade.setGradeId(i+1);
            grade.setGradeName(i+1+"年级");
            grade.setStudentId(RandomUtils.nextInt(1,5));
            grades.add(grade);
        }
        //
        Map<Integer,Object>  m =  grades.stream().collect(Collectors.toMap(Grade::getGradeId, Function.identity(),(key1, key2)->key2));

        System.out.printf("m:"+gson.toJson(m));
    }
    //
    private List<T> getList (T t){

        return Lists.newArrayList();

    }

}

package com.namego.sqlTest;

import java.util.ArrayList;

/**
 * @author Namego
 * @date 2022/8/26 15:02
 */
public class Run {
    public static void main(String[] args) {
        ArrayList<String> sources=new ArrayList();
        //项目名开始的路径
        System.out.println(System.getProperty("user.dir"));
        sources.add(System.getProperty("user.dir") + "\\src\\main\\java\\com\\namego\\sqlTest\\StuWorkHourVO.java");
        sources.add(System.getProperty("user.dir") + "\\src\\main\\java\\com\\namego\\sqlTest\\VO.java");
        Util.println(sources);
    }
}

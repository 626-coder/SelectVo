package com.namego.sqlTest;

import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.FieldDoc;
import com.sun.javadoc.RootDoc;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Namego
 * @date 2022/8/26 15:00
 */
public class Util {
    public static List<String> getField(String s1, Object o) {
        List<String> list = new ArrayList();
        try {
            Class c = Class.forName(s1);
            Field[] fields = c.getDeclaredFields();
            for (Field f : fields) {
                f.setAccessible(true);
            }
            for (Field f : fields) {
                list.add(f.toString().substring(f.toString().lastIndexOf(".") + 1));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static String toUnderLine(String c)
    {
        String separator = "_";
        c = c.replaceAll("([a-z])([A-Z])", "$1"+separator+"$2").toLowerCase();
        return c;
    }

    public static void println(ArrayList<String> sources) {
        String tableName = null;
        ArrayList<String> list = new ArrayList();
        list.add("-doclet");
        list.add(Util.class.getName());
        list.addAll(sources);
        com.sun.tools.javadoc.Main.execute(list.toArray(new String[list.size()]));
        ClassDoc[] classes = Util.root.classes();
        for (ClassDoc classDoc : classes) {
            System.out.println("解析类：" + classDoc.name());
            FieldDoc[] fields = classDoc.fields(false);
            for (FieldDoc field : fields) {
                if(!field.commentText().equals(new String())){
                    tableName = field.commentText();
                }
                System.out.println("`"+ tableName +"`."+toUnderLine(field.name()) +" as " + field.name());
            }
            System.out.println();
        }
    }
    /** 文档根节点 */
    private static RootDoc root;

    /**
     * javadoc调用入口
     *
     * @param root
     * @return
     */
    public static boolean start(RootDoc root)
    {
        Util.root=root;
        return true;
    }
}

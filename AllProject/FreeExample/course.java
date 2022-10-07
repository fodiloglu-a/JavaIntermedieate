package FreeExample;

import java.lang.ref.SoftReference;

public class course {
    public  static  String name;
    public  static String code;
    public static int num;
    static {
        num=10;
    }



    public static String getName() {
        return name;
    }

    public static String getCode() {
        return code;
    }

    public static int getNum() {
        return num;
    }

    public static void setName(String name) {
        course.name = name;
    }

    public static void setCode(String code) {
        course.code = code;
    }

    public static void setNum(int num) {
        course.num = num;
    }


}

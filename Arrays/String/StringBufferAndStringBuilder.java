package String;

import com.sun.javaws.IconUtil;

public class StringBufferAndStringBuilder {
    public static void main(String[] args) {
//        StringBuilder sb=new StringBuilder();
//        sb.append("this is new char");
//        sb.indexOf("cd",0);
//        sb.delete(0,6);
//        sb.replace(0,1,"th");
//        System.out.println(sb.substring(0,5));
//        System.out.println(sb);
        StringBuffer sb=new StringBuffer();
        sb.append("this is new char");
        sb.indexOf("cd",0);
        sb.delete(0,6);
        sb.replace(0,1,"th");
        System.out.println(sb.substring(0,5));
        System.out.println(sb);
//        String c="  this is new char";
//        c=c.trim();
//        System.out.println(c);

    }
}

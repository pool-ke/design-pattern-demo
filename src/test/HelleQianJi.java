package test;

/**
 * @author qianji
 * @date 2019/12/29 13:37
 */
public class HelleQianJi {
    public static void main(String [] args){
        HelleQianJi helleQianJi = new HelleQianJi();
        String result = helleQianJi.getString("weini");
        System.out.println(result);
    }

    public String getString(String param1){
        return getString2(param1)+"_kemuyuan";
    }

    public String getString2(String param1){
        return param1+"_winnie";
    }
}

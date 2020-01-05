package sword.offer.demo;

/**
 * @author qianji
 * @date 2019/12/29 15:00
 */
public class ReplaceChar {
    public static String replaceSpace(StringBuffer str) {
        StringBuilder result = new StringBuilder();
        int size = str.length();
        for (int i=0;i<size;i++){
            char temp = str.charAt(i);
            if (temp == ' '){
                result.append("%20");
            }else{
                result.append(temp);
            }
        }
        return result.toString();
    }

    public static void main(String[] args){
        int[][] arrayTest = {{1,2,3},{4,5,6},{7,8,9}};
        StringBuffer testString = new StringBuffer("we are happy");
        String result = ReplaceChar.replaceSpace(testString);
        System.out.println(result);
    }
}

package ltcode;
/**
 * Created by hd on 2016/8/16.
 */

/**
 * LeetCode #6
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)

 P   A   H   N
 A P L S I I G
 Y   I   R
 And then read line by line: "PAHNAPLSIIGYIR"
 Write the code that will take a string and make this conversion given a number of rows:

 string convert(string text, int nRows);
 convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */
public class ZigzagConversion6 {
    public static String convert(String s, int numRows) {
        String[] everys = s.split("");
        int i,j;
        StringBuffer result = new StringBuffer();
        for(i=0;i<numRows;i++){
            for(j=i;j<everys.length;){
                if(i==0 || i==(numRows-1)){  //第一行与最后一行不需要加中间值
                    result.append(everys[j]);
                    j += (numRows-1)*2;
                }
                else{
                    if(j>numRows){             //中间值
                        result.append(everys[j-2*i]);
                    }
                    result.append(everys[j]);
                    j += (numRows-1)*2;
                }
            }

        }
        return result.toString();
    }
    public static void  main(String[] args){
        System.out.println(convert("PAYPALISHIRING",3));
    }
}

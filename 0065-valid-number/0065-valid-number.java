import java.util.regex.*;
class Solution {
    public boolean isNumber(String s) {
        String regex="^[+-]?(((\\d+\\.\\d*)|(\\.\\d+))|(\\d+))([eE][+-]?\\d+)?$";
        return Pattern.matches(regex,s);
    }
}
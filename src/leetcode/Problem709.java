package leetcode;

public class Problem709 {
    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello &&& ASNIJN@#E*(H@*(IND*(#NDNSnsuidnasuidD&*(W&D*(B( World"));
    }

    public static String toLowerCase(String str) {
        String reValue = "";
        if(str.length() >= 0){
            for(char c : str.toCharArray()){
                if(c >= 'a' && c <= 'z' || c == ' '){
                    reValue += c;
                } else if (c >= 'A' && c <= 'Z'){
                    reValue += (char) (c + 32);
                } else {
                    reValue+=c;
                }
            }
        } else {
            return "";
        }

        return reValue;
    }
}

//https://leetcode.com/problems/to-lower-case/

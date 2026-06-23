package StringsFolder;

public class countAndSay {
    public static void main(String[] args) {
        
    }
    public static String countAndSay(int n){
        if (n==1) {
            return "1";
        }
        String say=countAndSay(n-1);
        //kaam
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<say.length();i++){
            int count=1;
            while(i!=say.length()-1 && say.charAt(i)==say.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(count);
            sb.append(say.charAt(i));
    
        }
        return sb.toString();
    }
}

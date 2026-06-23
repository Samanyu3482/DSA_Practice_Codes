package recursion;


public class removeDup {
    public static void main(String[] args) {
        
        
        removeDuplicates("appnnacollege", 0, new StringBuilder(""), new boolean[26]);
    }
    public static void removeDuplicates(String str,int idx,StringBuilder newstr,boolean map[]){
        //base
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }

        //kaam
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            //duplicate
            removeDuplicates(str, idx+1, newstr, map);
        }else{
            //not duplicate
            map[currchar-'a']=true;
            removeDuplicates(str, idx+1, newstr.append(currchar), map);
        }

    }
}

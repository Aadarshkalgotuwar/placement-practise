public class Duplicate{
    public static void removeDuplicate(String str , int idx , StringBuilder newStr , boolean map[]){
        //base case
        if( idx == str.length()){
            System.out.println(newStr);
            return ;
        }
        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            //duplicate
            removeDuplicate(str, idx+1, newStr, map);
        }else{
        map[currChar-'a']=true;
        removeDuplicate(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[]args){
         String str = "aadarsh";
         removeDuplicate(str, 0, new StringBuilder(""),new boolean[26]);
    }
}
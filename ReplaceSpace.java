package 剑指Offer;
//替换字符
public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        if(str==null){
            return null;
        }
        StringBuffer newstring=new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                newstring.append('2');
                newstring.append('0');
                newstring.append('%');
            }else{
                newstring.append(str.charAt(i));
            }
        }
        return newstring.toString();
    }
}


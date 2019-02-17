public class StringManipulator{
    public String trimAndConcat( String a, String b){
        String firstString = a.trim();
        String secondString = b.trim();
        return firstString + secondString;
    }
    public Integer getIndexOrNull( String a, Character charB){
        Integer aString = a.indexOf(charB);
        return aString;
        
    }
    public Integer getIndexOrNull(String aWord, String bWord){
        Integer aString = aWord.indexOf(bWord);
        return aString;
    }
    public String concatSubstring(String a, Integer int1 , Integer int2, String b){
        String aString = a.substring(int1, int2);
        String bString = b;

        return aString + bString;
    }
}
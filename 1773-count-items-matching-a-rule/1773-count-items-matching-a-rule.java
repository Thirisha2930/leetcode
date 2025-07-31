class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int KeyIndex=0;
        if(ruleKey.equals("color")){
            KeyIndex=1;
        }else if(ruleKey.equals("name")){
            KeyIndex=2;
        }
        int count=0;
        for(List<String>item:items){
            if(item.get(KeyIndex).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
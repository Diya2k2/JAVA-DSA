Approach:
Using hashmap and Linked list.
1.We will sort the strings after sorting same type of strings are group together.
2. For sorting we have to convert String into Array. 
3. In each group we will take one key(same type of character are present in that group) and check after sorting that key is present or not and by iterate, then we make a group.

import java.util.*;
public class sstr_10 {
    public static void main(String[] args) {
        Map<String,List<String>> map=new HashMap<>();
        String[] str={"eat","tea","tan","ate","nat"};
        for(String s:str){
            char ch[]=s.toCharArray();
            Arrays.sort(ch);     //---it sort all string like-> aet,aet,ant,aet,ant
            String sorted=new String(ch);
            if(!map.containsKey(sorted)){
                map.put(sorted,new LinkedList<String>());   //from this we make new string for storing the grouped anagram i.e sturcture kind of.

            }
            map.get(sorted).add(s);  //from this we add those sorted string into the structure we made for storing above.
        }
        System.out.println(map.values());
    }
}
Output:- [[eat, tea, ate], [tan, nat]]

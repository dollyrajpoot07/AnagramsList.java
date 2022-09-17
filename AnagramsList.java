// Two strings are anagrams if they have the same characters in the same frequency,
// but the characters are in a different order. An example is bat and tab.
// Given a collection of strings, group the anagrams and return the number of groups formed.
// Example: 
// words = ["cat", "listen", "silent", "kitten", "salient"]
// Only silent and listn are anagrams. The last word, salient, contains an extra 'a'.
// No other words are anagrams, so there are 4 groups: 
// [['silent', 'listen'], ['cat'], ['kitten'], ['salient']].
// Return 4.
// Input 1 : 4
// pat
// tap
// apt
// bat
// Output 1: 2
// Input 2: 4
// cat
// chin
// kit
// act
// Output 2: 3

import java.util.*;

public class AnagramsList {
    public int getGroupedAnagrams(List<String> words) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String str : words) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);

            map.put(s, map.getOrDefault(s, new ArrayList<>()));
            map.get(s).add(str);
        }
        for (List<String> al : map.values()) {
            ans.add(new ArrayList<String>(al));
        }
        return ans.size();
    }
}

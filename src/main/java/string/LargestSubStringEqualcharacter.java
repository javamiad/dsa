package string;


//1624. Largest Substring Between Two Equal Characters
//https://leetcode.com/problems/largest-substring-between-two-equal-characters/?envType=daily-question&envId=2023-12-31

import java.util.HashMap;
import java.util.Map;

public class LargestSubStringEqualcharacter {

        public int maxLengthBetweenEqualCharacters(String s) {

            int maxSub = 0;
            boolean doesExist=false;

            Map<Character, Integer> map = new HashMap<>();

            for(int x=0;x<=s.length()-1;x++)
            {
                if(map.get(s.charAt(x))==null)
                {
                    map.put(s.charAt(x),x);

                    String[] words = "abc def".split(" ");
                    for(int y=words[x].length()-1;y>=0;y--)
                    {

                    }
                }
                else
                {
                    doesExist=true;

                    maxSub = x - (map.get(s.charAt(x))+1);
                }
            }

            if(maxSub==0 & doesExist==false)
            {
                maxSub=-1;
            }

            return maxSub;
        }



    public static void main(String[] args) {
        LargestSubStringEqualcharacter x = new LargestSubStringEqualcharacter();
        String str = "mgntdygtxrvxjnwksqhxuxtrv";
        System.out.println(x.maxLengthBetweenEqualCharacters(str));
    }

}

package stack.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class OpenClose {


    public static void main(String[] args) {

        String s = "{[()]()((";

        Map<String, String> matchMap = new HashMap<>();

        matchMap.put("{", "}");
        matchMap.put("[", "]");
        matchMap.put("(", ")");

       // System.out.println(matchMap.get("{"));

        Stack stack = new Stack();
        for(int x = 0;x<=s.length()-1;x++)
        {
            String entry = String.valueOf(s.charAt(x));
            if(matchMap.get(entry)!=null)
            {
                stack.push(entry);
            }
            else
            {
                if(!entry.equalsIgnoreCase(matchMap.get(stack.pop().toString())))
                {
                    System.out.println("not a valid string");
                    return;
                }
            }
        }
        if(stack.empty())
        {
            System.out.println("This is a valid string");
        }else
        {
            System.out.println("not a valid string");
        }


    }
}

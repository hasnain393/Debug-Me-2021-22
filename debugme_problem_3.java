/*
    Problem 3

    Expected Output :
            [hello,
             , world]
*/

package debug;

import java.util.ArrayList;
import java.util.List;

public class Problem4 {

    public static  void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("/n");
        list.add("world");

        System.out.printf(list.toString());

    }
}

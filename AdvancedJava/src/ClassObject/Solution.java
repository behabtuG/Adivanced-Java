package ClassObject;

public class Solution {


    int id;//data member (also instance variable)
    String name; //data member (also instance variable)

    public static void main(String args[]) {
        Solution s1 = new Solution();//creating an object of Student
        System.out.println(s1.id);
        System.out.println(s1.name);
    }

}

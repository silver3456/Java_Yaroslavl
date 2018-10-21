package _15_10_18.Assignment_2;

public class Solution {
    public static void main(String[] args) {

        //Building store = Building.getBuilding("dfg", 53);
       // School school = School.getSchool("school", 3);

        School c = School.getSingletonSchool();
        School c2 = School.getSingletonSchool();
        System.out.println(c.equals(c2));
      /*  System.out.println(store);
        System.out.println(school);*/
    }
}

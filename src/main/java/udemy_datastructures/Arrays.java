package udemy_datastructures;

public class Arrays {
    public static void main(String[] args) {


        String[][] users = {
                {"John", "Williams", "jw@testmail.com", "7847795739735"},
                {"Sarah", "Jackson", "sj@testmail.com", "4803750750820"},
                {"Rachel", "Wallace", "rw@testmail.com", "853025802385"}
        };

        System.out.println("\n\nUsing FOR EACH");

        //Get the size of array
        int numOfUsers = users.length;
        int numOfFields = users[0].length;
        // System.out.println("Number of users: " + numOfUsers);
        // System.out.println("Number of fields: " + numOfFields);

        //Traverse the double array
        for (String[] user : users) {
            System.out.print("[ ");
            for (String field : user) {
                System.out.print(field + " ");
            }
            System.out.println(" ]");
        }


    }
}

/*
 * Assignment-2 (Variable and Data type)
 * step 1: create a class called Product
 * step 2: create a main method
 * step 3: declare variables: id, title, price, description, category
 * step 4: assign the following data in main method
101,iphone15,1895 euros,perfect product with best image quality, phone,
* step 5: print the data
 */

package assignment2;

public class CalledProduct{
    public static void main(String[] args)
    {
        //declare variables
        int id;
        String title, price, description, category;

        //assign data

        id = 101;
        title = "iphone15";
        price = "1895 euros";
        description = "perfect product with best image quality";
        category = "phone";

        //print data

        System.out.println("Product ID:"+id);
        System.out.println("Title:"+title);
        System.out.println("Price:"+price);
        System.out.println("Description:"+description);
        System.out.println("Category:"+category);

    }
}

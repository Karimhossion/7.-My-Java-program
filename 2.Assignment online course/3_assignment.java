/*
 * Assignment-3 (User Input)
 * step 1: create a class called Product
 * step 2: create a main method
 * step 3: declare variables: id, title, price, description, category
 * step 4: get user input for each variables
* step 5: print the variables
 */

package beginnerjava;

import java.util.Scanner;

public class Product{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int id;
        String title;
        double price;
        String description, category;

        System.out.print("Enter Product Id:");
        id=input.nextInt();
        System.out.print("Enter Product title:");
        title=input.next();
        System.out.print("Enter Product Price:");
        price=input.nextDouble();
        
        System.out.print("Enter Product Description:");
        description=input.next();
        System.out.print("Enter Product Category:");
        category=input.next();

        System.out.println("___________________Product Details______________:");

        System.out.println("Id: "+id);
        System.out.println("title: "+title);
        System.out.println("price:"+price);
        System.out.println("description: "+description);
        System.out.println("category:"+category);

    }
}
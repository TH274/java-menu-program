package asg1;

import java.util.*;
import java.util.Scanner;
class main {
    public static void main(String[] args) {
        List<Product> c = new ArrayList<Product>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int ch;
        do{
            System.out.println("GAMES MENU");
            System.out.println("-------------------------------");
            System.out.println("1.Add products");
            System.out.println("2.Display products");
            System.out.println("3.Delete a product");
            System.out.println("4.Edit a product");
            System.out.println("5.Search for products by name");
            System.out.println("6.Sort products by price");
            System.out.println("7.Save products to text/binary file");
            System.out.println("8.Load products from the saved file");
            System.out.println("--------------------------------");
            System.out.print("ENTER YOUR CHOICE: ");
            ch = s.nextInt();

            int ID;
            switch(ch) {
                case 1:
                System.out.print("Enter ID: ");
                int id = s.nextInt();
                System.out.print("Enter Name: ");
                String name = s1.nextLine();
                System.out.print("Enter Price: ");
                int price = s.nextInt();
                c.add(new Product(id, name, price));
                break;
                case 2:
                System.out.println("--------------------------");
                Iterator<Product> i = c.iterator();
                while(i.hasNext()){
                    Product e = i.next();
                    System.out.println(e);
                }
                System.out.println("--------------------------");
                break;
                case 3:
                boolean found = false;
                System.out.println("Enter ID to Delete: ");
                ID = s.nextInt();
                System.out.println("--------------------------");
                i = c.iterator();
                while(i.hasNext()){
                    Product e = i.next();
                    if(e.getId() == ID) {
                        i.remove();
                        found = true;
                    }
                }
                if(!found){
                    System.out.println("Record not found");
                } else {
                    System.out.println("Record is deleted!");
                }
                System.out.println("--------------------------");
                break;
                case 4:
                found = false;
                System.out.println("Enter ID to Edit: ");
                ID = s.nextInt();
                System.out.println("--------------------------");
                ListIterator<Product>li = c.listIterator();
                while(li.hasNext()){
                    Product e = li.next();
                    if(e.getId() == ID) {
                        System.out.println("Enter new name: ");
                        name = s1.nextLine();
                        System.out.println("Enter new price: ");
                        price = s.nextInt();
                        li.set(new Product(ID, name, price));
                        found = true;
                    }
                }
                if(!found){
                    System.out.println("Record not found");
                } else {
                    System.out.println("Record is redited!");
                }
                System.out.println("--------------------------");
                break;
                case 5:
                found = false;
                System.out.println("Enter ID to Search: ");
                ID = s.nextInt();
                System.out.println("--------------------------");
                i = c.iterator();
                while(i.hasNext()){
                    Product e = i.next();
                    if(e.getId() == ID) {
                        System.out.println(e);
                        found = true;
                    }
                }
                if(!found){
                    System.out.println("Record not found");
                }
                System.out.println("--------------------------");
                break;
            }
        } while (ch!=0);
    }
}
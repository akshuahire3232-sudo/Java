import java.util.*;
class Product
{
    int pro_id;
    String name;

    Scanner sc = new Scanner(System.in);

    void Pro_Details()
    {
        System.out.println("Enter a Product ID:");
        pro_id = sc.nextInt();

        System.out.println("Enter a Product Name:");
        name  = sc.next();
    }
    void Pro_Display()
    {
        System.out.println("Product id is  :"+pro_id);
        System.out.println("Product Name id:"+name);
    }
}

class Electronics extends Product
{
    String brand ;
    String Warranty;

    Scanner sc =new Scanner(System.in);

    void Ele_Details()
    {
        System.out.println("Enter a Electronics Product Brand :");
        brand = sc.next();

        System.out.println("Enter a Electronics Product Warrenty :");
        Warranty = sc.next();
    } 
    void Ele_Display()
    {
        System.out.println("Electronics Product Brand :"+brand);
        System.out.println("Electronics Product Warrenty :"+Warranty);
    }                                   
    
}

class Clothing extends Product
{
    String Size ;
    String Material;

    Scanner sc =new Scanner(System.in);

    void cloth_Details()
    {
        System.out.println("Enter a Clothing Size Brand :");
        Size = sc.next();

        System.out.println("Enter a Clothing Material Warrenty :");
        Material = sc.next();
    } 
    void cloth_Display()
    {
        System.out.println("Clothing  Product Size :"+Size);
        System.out.println("Clothing Product Material :"+Material);
    }                                   
}

class Heirarchical
{
    public static void main(String args[])
    {
        Electronics e = new Electronics();

        e.Pro_Details();
        e.Pro_Display();
        e.Ele_Details();
        e.Ele_Display();

        Clothing c = new Clothing();

        c.Pro_Details();
        c.Pro_Display();
        c.cloth_Details();
        c.cloth_Display();
    }
}
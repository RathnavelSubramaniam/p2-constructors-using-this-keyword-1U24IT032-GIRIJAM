class Product
{
    int productId;
    String productName;
    double price;
    //Define instance variabbbles:productId(int),productName(String)price
    //(double)
    static int count;
    Product()
    {
         productName=null;
    }
    Product(int productId,String productName,double price)
    {
            this.productId=productId;
            this.productName=productName;
            this.price=price;
            count++;
    }
    //Static Variable for produce count 
    //Counstauctor to initialize product attributes 
    double discount(double Price,double Discount)
    {
              return((100-Discount)/100)*Price;
    }
    //Calculate and return the discounted price
    void displayProductionInfo()
    {
               System.out.println("Product Id:"+productId);
               System.out.println("Product Name:"+productName);
               System.out.println("Product Price:"+price);
               //Display product information
               //Static method to retrieve total product count
    }
}
class Practical2
{
    public static void main(String[] args)
    {
              Product product1=new Product(101,"Laptop",999.99);
              Product product2=new Product(202,"Smart Phone",499.95);
              Product product3=new Product(303,"Tablet",299.50);
              Product calcDiscount=new Product();

              //Create three product objects with different data
              product1.displayProductionInfo();
              product2.displayProductionInfo();
              product3.displayProductionInfo();

              //Display prouct information
              double DiscountedPrice=calcDiscount.discount(product1.price,10);
              System.out.println("Discounted Price:"+DiscountedPrice);
              System.out.println("Producr.count");
              //Calculate and display discounted price
              //Display total product count
    }
}


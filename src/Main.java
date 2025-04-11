//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Product[] products = new Product[5];
    Product.storeName="Kho Tổng ABC";
    products[0]=new Product("St01","Quan",1000000,20);
    products[1]=new Product("St02","Ao",1500000,30);
    products[2]=new Product("St03","Giay",1300000,10);
    products[3]=new Product("St04","Tat",100000,200);
    products[4]=new Product("St05","Mu",500000,50);

    for (Product p : products) {
        System.out.println(p);
    }
        findElement(products);
        findPriceHigherThamAMilion(products);
        findMaxQuantity(products);

        findSumFunction(products);

        Product.storeName="Kho miền Nam";
        System.out.println(products[1].getStoreName());
    }

    public static void findPriceHigherThamAMilion(Product[] products) {
        for (Product p : products) {
        if(p.getPrice()>1000000){
            System.out.println(p);
        }
    }
    }

    public static void findSumFunction(Product[] products) {
        int sumProduct=0;
        double sumPrice=0;
        double sumIventoryValue=0;
        for(int i = 0; i< products.length; i++){
            sumProduct+= products[i].getQuantity();
            sumPrice+= products[i].getPrice();
            sumIventoryValue+= products[i].getTotalInventoryValue();
        }
        System.out.println(sumProduct);
        System.out.println(sumPrice/5);
        System.out.println(sumIventoryValue);
    }

    public static void findMaxQuantity(Product[] products) {
        int a = products[0].getQuantity();
        int b =-1;
        for(int i = 1; i< products.length; i++){
            if(products[i].getQuantity()>a){
                b=i;
            }
        }

        System.out.println(products[b]);
    }

    public static void findElement(Product[] products) {
        for (Product p : products) {
            if(p.getName().equals("Ao")){
                System.out.println(p);
            }else{
                System.out.println("Khong tim thay san pham");
            }
        }
    }
}
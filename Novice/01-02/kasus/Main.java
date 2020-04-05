import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[]args){

        boolean kondisi = true;
        do{         
            
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Pembeli : ");
        String namaPembeli = inputScanner.nextLine();

        System.out.print("Masukkan Alamat Pembeli : ");
        String alamatPembeli = inputScanner.nextLine();

        Customer customer1 = new Customer(namaPembeli, alamatPembeli);

        System.out.print("Masukkan Nama Barang : ");
        String namaBarang = inputScanner.nextLine();

        System.out.print("Masukkan Harga Barang : ");
        int hargaBarang = inputScanner.nextInt();


        System.out.print("Masukkan Jumlah Barang : "); 
        int jumlahBarang = inputScanner.nextInt(); 

        Order order1 = new Order(namaBarang, hargaBarang, jumlahBarang);
        
        customer1.order(order1);
            
        System.out.print("Lanjut ? (Y/T) : ");
        String kondisiInput = inputScanner.next();

        if (kondisiInput.equalsIgnoreCase("y")) {
            kondisi = true;
            
        } else {
            System.out.print("terimakasih");
            //kondisi = false;
        }
        }while(kondisi);

    }
    
}

/**
 * Custommer
 */
class Customer {

    private String place_order;
    private String knows_name;
    private String knows_address;
    private String knows_customer_number;
    private String order_history;

    public Customer(String knows_name, String knows_address) {
        this.knows_name = knows_name;
        this.knows_address = knows_address;
    }

    public void order(Order order){
        order.orderItemDetail();
    }
    
}
/**
 * Order
 
 */
class Order {

private String knows_placement_date;
    private String delivery_date;
    private String order_items;
    private int price_items;
    private int amount;
    private int total;
    private String applicable_taxes;
    private String order_number;

    public Order(String order_items, int price_items, int amount) {
        this.order_items = order_items;
        this.price_items = price_items;
        this.amount = amount;
    }

    public void orderItemDetail(){

        total = price_items * amount;

        System.out.println("-------Your Detail Order-------");
        System.out.println("name items : " + order_items);
        System.out.println("price item : " + price_items);
        System.out.println("amount item : " + amount);
        System.out.println("total : " + total);

    }

}


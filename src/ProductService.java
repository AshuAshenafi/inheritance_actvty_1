import java.util.ArrayList;

public class ProductService {

    ArrayList<Product> availableProducts = new ArrayList<>();

    public void productLoader(String code) {

        Book b = new Book();
        b.setCode(code);
        b.setAuthor("Dave W.");
        b.setPrice(59.99);
        b.setDescription("Java Programming Book");
        availableProducts.add(b);
//        System.out.println(b.toString());

        Book b2 = new Book();
        b2.setCode("Book 0001");
        b2.setAuthor("Kathy Sierra & Bert Bates");
        b2.setPrice(23.41);
        b2.setDescription("Head First Java Programming");
        availableProducts.add(b2);
//        System.out.println(b.toString());

        Book c = new Book();
        c.setCode("Book 8910");
        c.setAuthor("Dave W.");
        c.setPrice(49.99);
        c.setDescription("Python programming book");
        availableProducts.add(c);
//        System.out.println(c.toString());

        Software s = new Software();
        s.setCode("Program1234");
        s.setDescription("Spreadsheet");
        s.setPrice(999.99);
        s.setOs("Windows");
        s.setProgrammer("Fi");
        availableProducts.add(s);
//        System.out.println(s.toString());
    }
//    public ArrayList<Product> displayAll(String str){
    public void displayAll(String str){
        productLoader(str);
        for(int i = 0; i < availableProducts.size(); i++){
            System.out.println(availableProducts.get(i).toString());
        }
        System.out.println("Thank you!");
    }
}

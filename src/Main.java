import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    static int INDEX =100;
    static int quantity;
    static String[][] user= new String[INDEX][6]; // isim, soyisim, mail adresi,yaş, ikamet ettiği şehir,tel no


    public static void displayUsers(){
        System.out.println("-------User List------\n");
        for (int i = 0; i < quantity; i++) {
            System.out.println("Name: " + user[i][0]);
            System.out.println("Surname: " + user[i][1]);
            System.out.println("Mail Address: " + user[i][2]);
            System.out.println("Age: " + user[i][3]);
            System.out.println("City: " + user[i][4]);
            System.out.println("Phone Number: " + user[i][5]);
            System.out.println();
        }
    }
    public static void addUser(String name, String surname, String mailAdress, String age, String city, String phoneNumber){

        user[quantity][0]= name;
        user[quantity][1]= surname;
        user[quantity][2]= mailAdress;
        user[quantity][3]= age;
        user[quantity][4]= city;
        user[quantity][5]= phoneNumber;

        quantity++;


    }
    public static void main(String[] args) {

        addUser("Nehir", "Çakılcı", "test@gmail.com","19", "İSTANBUL", "12345678890");
        addUser("Zehra", "Öztürk","test@gmail.com", "22", "KARAMAN", "12345678910");
        addUser("Defne", "Atasal", "ornek@gmail.com", "23","İstanbul", "12345678910");

        displayUsers();





//            ArrayList<String> nehir = new ArrayList<>();
//
//            nehir.add("NEHİR");
//            nehir.add("ÇAKILCI");
//            nehir.add("Yazılım müh");
//            nehir.add("İstanbul");
//            nehir.add("20");
//
//            System.out.println(nehir);
//
//
//            nehir.remove(4);
//            System.out.println(nehir);


        //2. SORU
//        ArrayList<Double> notlar = new ArrayList<>();
//
//        notlar.add(77.0);
//        notlar.add(55.0);
//        notlar.add(30.0);
//        notlar.add(87.0);
//        notlar.add(99.0);
//        notlar.add(78.0);
//
//        double sum= 0.0;
//
//        for(double not: notlar){
//            sum+= not;
//        }
//
//        double ortalama = sum/ notlar.size();
//        System.out.println(ortalama);


        //map

//        HashMap<String, Integer> sozluk = new HashMap<>();
//
//        sozluk.put("One", 1);
//        sozluk.put("Two", 2);
//        sozluk.put("Three", 3);
//        sozluk.put("Four", 4);
//        sozluk.put("Five", 5);
//        sozluk.put("Six", 6);

//        int number = sozluk.get("One");
//        System.out.println(number);

//
//        for (String map : sozluk) {
//            System.out.println(map);
//        }


    }
}
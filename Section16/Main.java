public class Main {
    public static void main(String[] args) {
        
    //      Car nissan = new Car();
    //      nissan.make = "Nissan";
    //      nissan.price = 1000;
    //      nissan.color = "red";
    //      nissan.year = 2022;
 
    //      Car nexia = new Car();
    //      nexia.color = "Blue";
    //      nexia.make = "Nexia";
    //      nexia.price = 12000;
    //      nexia.year = 2019;

    //      System.out.println("This " + nissan.make + " is worth $" + nissan.price + 
    //      ". It was built in " + nissan.year + ". It is " + nissan.color + ".\n");
    //      System.out.println("This " + nexia.make + " is worth $" + nexia.price + 
    //      ". It was built in " + nexia.year + ". It is " + nexia.color + ".\n");

    Person information = new Person("Firdavs", "Uzbekistan", "2000.08.08", 24, 28);
        information.setName("Firdavs");
        information.setNationality("Japan");
        information.setDateOfBirth("2000.09.09");

        System.out.println(information);

    //  Person infPerson = new Person();

    // Person information = new Person("Firdavs", "Uzbek", "2000.00.00", 23, 22);
    //         System.out.println(information.getName());
    //         System.out.println(information.getDateOfBirth());
    //         System.out.println(information.getNationality());

    //         System.out.println(information);
    }
  
}

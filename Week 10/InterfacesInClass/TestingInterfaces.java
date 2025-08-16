/**
 * TestingInterfaces
 * @author <a href="mailto:alexandre.d.paquette@gmail.com">Alexandre Paquette</a>
 * @version Apr 1, 2022
 */

public class TestingInterfaces{

    /**
     * Executable method to start the program
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person jim = new Person();
        Person notJim = new Person("Alex", "33 Dubeau Street", 75000, .22);
        
        System.out.println(jim);
        System.out.println(notJim);
        
        Residence jimsHouse = new Residence();
        jimsHouse.setAddress("2201 Pevensey Rd");
        jimsHouse.setPropertyAssessment(200_000);
        jimsHouse.setTaxRate(.02);
        
        CommercialBuilding theStore = new CommercialBuilding();
        theStore.setAddress("555 Main St");
        theStore.setPropertyAssessment(1_000_000);
        theStore.setTaxRate(0.3);
        
        System.out.println(jimsHouse);
        System.out.println(theStore);
    }

}

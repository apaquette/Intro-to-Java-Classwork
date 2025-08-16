/**
 *
 * @author <a href="mailto:alexandre.d.paquette@gmail.com">Alexandre Paquette</a>
 */
public class Person implements Taxable, Addressable{
    
    private String name;
    private String address;
    private double income;
    private double taxRate;

    public Person() {
        this("new person", "no address", 0, 0);
    }

    public Person(String name, String address, double income, double taxRate) {
        this.name = name;
        this.address = address;
        this.income = income;
        this.taxRate = taxRate;
        
        if(this.income < 0){
            this.income = 0;
        }
        
        if(this.taxRate < 0 || this.taxRate > .5){
            this.taxRate = 0;
        }
    }
    
    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Get the value of address
     *
     * @return the value of address
     */
    @Override
    public String getAddress() {
        return address;
    }

    /**
     * Set the value of address
     *
     * @param address new value of address
     */
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get the value of income
     *
     * @return the value of income
     */
    public double getIncome() {
        return income;
    }

    /**
     * Set the value of income
     *
     * @param income new value of income
     */
    public void setIncome(double income) {
        this.income = income;
    }
    
    /**
     * Get the value of taxRate
     *
     * @return the value of taxRate
     */
    public double getTaxRate() {
        return taxRate;
    }

    /**
     * Set the value of taxRate
     *
     * @param taxRate new value of taxRate
     */
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
    
    /**
     * Returns tax owed by person
     * 
     * @return return the tax amount
     */
    @Override
    public double getTax(){
        return taxRate * income;
    }
    
    @Override
    public String toString(){
        return String.format("Name: %s%nAddress: %s%nIncome: %s%nTaxes: %s%n", name, address, nf.format(income), nf.format(getTax()));
    }
}

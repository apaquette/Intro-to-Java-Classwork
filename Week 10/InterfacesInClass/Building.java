/**
 *
 * @author <a href="mailto:alexandre.d.paquette@gmail.com">Alexandre Paquette</a>
 */
public abstract class Building implements Taxable, Addressable{
    private String address;
    private double propertyAssessment;
    private double taxRate;
    
    public Building(){
        this("no address", 0, 0);
    }

    public Building(String address, double propertyAssessement, double taxRate) {
        this.address = address;
        this.propertyAssessment = propertyAssessement;
        this.taxRate = taxRate;
        if(this.propertyAssessment < 0){
            this.propertyAssessment = 0;
        }
        if(this.taxRate < 0 || this.taxRate > .9){
            this.taxRate = 0;
        }
    }

    public void setPropertyAssessment(double propertyAssessment) {
        this.propertyAssessment = propertyAssessment;
        if(this.propertyAssessment < 0){
            this.propertyAssessment = 0;
        }
    }

    public double getPropertyAssessment() {
        return propertyAssessment;
    }

    @Override
    public String getAddress() {
        return address;
    }
    
    @Override
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
        if(this.taxRate < 0 || this.taxRate > .9){
            this.taxRate = 0;
        }
    }

    public double getTaxRate() {
        return taxRate;
    }
    
    @Override
    public String toString(){
        return String.format("Address: %s%nAssessment: %s%n", address, nf.format(propertyAssessment));
    }
}

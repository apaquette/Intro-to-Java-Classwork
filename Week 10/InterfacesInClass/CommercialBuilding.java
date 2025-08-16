/**
 *
 * @author <a href="mailto:alexandre.d.paquette@gmail.com">Alexandre Paquette</a>
 */
public class CommercialBuilding extends Building{
    private double fee;

    public CommercialBuilding() {
        this(0, "", 0, 0);
    }
    
    

    public CommercialBuilding(double fee, String address, double propertyAssessement, double taxRate) {
        super(address, propertyAssessement, taxRate);
        this.fee = fee;
        if(this.fee < 0){
            this.fee = 0;
        }
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
        if(this.fee < 0){
            this.fee = 0;
        }
    }
    
    @Override
    public double getTax(){
        return getTaxRate() * getPropertyAssessment() + fee;
    }
    
    @Override
    public String toString(){
        return super.toString() + String.format("Taxes: %s%n", nf.format(getTax()));
    }
}

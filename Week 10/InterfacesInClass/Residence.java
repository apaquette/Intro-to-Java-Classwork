/**
 *
 * @author <a href="mailto:alexandre.d.paquette@gmail.com">Alexandre Paquette</a>
 */
public class Residence extends Building{
    @Override
    public double getTax(){
        return getTaxRate() * getPropertyAssessment();
    }
    
    @Override
    public String toString(){
        return super.toString() + String.format("Taxes: %s%n", nf.format(getTax()));
    }
}

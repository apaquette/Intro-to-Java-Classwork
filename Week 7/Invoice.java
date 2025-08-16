/**
 *
 * @author Alexandre Paquette
 */
public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;
    
    public Invoice(String partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity);
        setPrice(price);
    }
    
    public Invoice() {
        this("TBD", "TBD", 0, 0.0);
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
    
    public double getInvoiceAmount(){
        return quantity*price;
    }
    
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public final void setQuantity(int quantity) {
        if(quantity >= 0){
            this.quantity = quantity;
        }
    }
    
    public final void setPrice(double price) {
        if(price >= 0){
            this.price = price;
        }
    }
}

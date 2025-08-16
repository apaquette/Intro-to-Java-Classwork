/**
 * Interface for anything that has an address
 * @author <a href="mailto:alexandre.d.paquette@gmail.com">Alexandre Paquette</a>
 */
public interface Addressable {
    /**
     * subclass will implement this to set an address
     * @param address
     */
    public abstract void setAddress(String address);
    /**
     * subclasses will implement this to return an address
     * @return the address
     */
    public abstract String getAddress();
}

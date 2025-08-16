
import java.text.NumberFormat;

/**
 *
 * @author <a href="mailto:alexandre.d.paquette@gmail.com">Alexandre Paquette</a>
 */
public interface Taxable {
    public final NumberFormat nf = NumberFormat.getCurrencyInstance();
    public abstract double getTax();
}

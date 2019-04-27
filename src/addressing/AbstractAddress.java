package addressing;

import java.util.HashMap;

/**
 * This is the base class of all operating_system addresses.
 *
 * <p>
 *     We don't use <code>String</code> for the operating_system addresses directly because we recognize the
 *     address in operating_system to a special class in order to improve  the expansibility of system.
 * </p>
 * @author TimCatCai
 * @version 2019/04/26
 *
 */
public abstract class AbstractAddress {

    public AbstractAddress() {}
    /**
     *  A container of operating_system address content. That is when the address consists of several parts,
     *  we stored them separately. The key is the name of each part of the address type <code>String</code>,
     *  and the value is real address.
     *
     *  <p>
     *      It is initialed to 8, because it is generally no more the 8 parts of the address.
     *  </p>
     */
    protected HashMap<String, String> addressCompontents = new HashMap<>(8);

    /**
     * Gets the whole real address of the physical  operating_system address. The subclass should implement the order to
     * connect all the component in {@link #addressCompontents}.
     *
     * @return the whole real address connected by all content of  <code>addressContent</code> in specific order
     * @see #addressCompontents
     */
    public abstract String getAddress();

    /**
     * @param key the name of the component of the address
     * @param value the real value of teh component of the address
     */
    protected void addComponent(String key, String value) {
        this.addressCompontents.put(key,value);
    }

    /**
     * @param key
     * @return string of the component address
     */
    protected String getComponent(String key) {
        return addressCompontents.get(key);
    }

    protected void resizeComponentValue(String key,String newValue) {
        this.addressCompontents.replace(key, newValue);
    }

}

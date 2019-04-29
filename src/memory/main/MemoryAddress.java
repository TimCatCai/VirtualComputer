package memory.main;
import addressing.AbstractAddress;

import java.math.BigInteger;

/**
 * This represents the address of  memory.
 * @author  TimCatCai
 * @version 2019/04/27
 */

public class MemoryAddress extends AbstractAddress {

    private final String MEMORY_ADDRESS_KEY = "memoryAddress";

    /**
     *  omits the value  of the memory, so initial it to empty string
     */
    public MemoryAddress(){
        init(new BigInteger("0"));
    }

    /**
     *  assigns <code>memoryAddress</code> to the value field of the memory address
     * @param memoryAddress the value of the memory address
     */
    public MemoryAddress(BigInteger memoryAddress) {
        init(memoryAddress);
    }

    @Override
    public BigInteger getAddress() {
        return this.addressComponents.get(MEMORY_ADDRESS_KEY);
    }

    public void setMemoryAddress(BigInteger newValue){
        resizeComponentValue(MEMORY_ADDRESS_KEY,newValue);
    }
    /**
     * initials this by adding address to {@link AbstractAddress#addressComponents} container.
     * @param memoryAddress  the value of the memory address
     */
    private void init(BigInteger memoryAddress) {
        addComponent(MEMORY_ADDRESS_KEY,memoryAddress);
    }

}

package memory.main;
import addressing.AbstractAddress;

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
        init("");
    }

    /**
     *  assigns <code>memoryAddress</code> to the value field of the memory address
     * @param memoryAddress the value of the memory address
     */
    public MemoryAddress(String memoryAddress) {
        init(memoryAddress);
    }

    @Override
    public String getAddress() {
        return null;
    }

    public void setMemoryAddress(String newValue){
        resizeComponentValue(MEMORY_ADDRESS_KEY,newValue);
    }
    /**
     * initials this by adding address to {@link AbstractAddress#addressCompontents} container.
     * @param memoryAddress  the value of the memory address
     */
    private void init(String memoryAddress) {
        addComponent(MEMORY_ADDRESS_KEY,memoryAddress);
    }

}

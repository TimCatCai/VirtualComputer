package memory.main;
import memory.interfaces.*;

/**
 * Memory Hardware stores data by byte.
 * The memory addressing is byte addressing.
 *
 * @author TimcatCai
 * @version 2019/05/18
 */
public class MemoryStorageHardware implements MemoryStorageHardwareInterface {

    private final int SIZE_0F_4M_WITH_LONG = 524288;
    private final int CHIP_NUMBER = 1;
    /**
     * The number of address wires.
     */
    private final int MEMORY_ADDRESS_LENGTH = 32;

    /**
     * The Capability of per storage unit is 4M.
     * The size of long is 8B
     * 4M = 2^2 * 2^20 B = 2^22 B
     * 2^22 / 2^3 = 2^19  = 524288 long units
     *<p>
     *     Here, all units have the same size. Later you should design it to support different size and
     *     verify the parameters(in <code>read</code>method).
     *</p>
     */
    private long[][] storageUnits= new long[CHIP_NUMBER][SIZE_0F_4M_WITH_LONG];


    @Override
    public long read(int whichChip, int addressInChip) {
        return this.storageUnits[whichChip][addressInChip];
    }
}

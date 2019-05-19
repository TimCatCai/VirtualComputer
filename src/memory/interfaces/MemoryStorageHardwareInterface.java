package memory.interfaces;


/**
 * This includes the input and output interface of storage hardware in memory.In real word, for storage
 * hardware, it has two interface for input and output, but when we imitate, the parameter of method is
 * input and return value is output.
 *
 * @author TimcatCai
 * @version 2019/05/19
 */
public interface MemoryStorageHardwareInterface {
    /**
     * Gets data from storage hardware in memory by <code>whichChip</code> and <code>addressInChip</code>.
     * These two parameter are data decoded by<code>DecodingModel</code>.
     * You can consider to replace these parameters into {@link memory.main.StorageHardwareInputSignal}
     * In addiction, you can replace the return value type to a new class that represent Storage
     * hardware output.
     * @param whichChip     the chip selecting signal
     * @param addressInChip the address in the chip selected
     * @return data of memory storage word length
     */
    long read(int whichChip, int addressInChip);
}

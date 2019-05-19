package memory.main;

/**
 * signal that {@link MemoryController} passes to {@link MemoryStorageHardware} read method to get
 * specify memory block. It just wraps chip selecting <code>whichChip</code> and address in
 * chip <code>addressInChip</code> signals.
 * @author TimcatCai
 * @version 2019/05/19
 */
public class StorageHardwareInputSignal {

    private int whichChip;
    private int addressInChip;

    public StorageHardwareInputSignal(int whichChip, int addressInChip) {
        this.whichChip = whichChip;
        this.addressInChip = addressInChip;
    }

    public int getWhichChip() {
        return whichChip;
    }

    public int getAddressInChip() {
        return addressInChip;
    }
}

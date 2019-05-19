package memory.main;

import memory.interfaces.DecodingModel;
import memory.interfaces.MemoryStorageHardwareInterface;
import java.math.BigInteger;


/**
 * This  is a controller of  the memory that accepts reading and writing signals and reads and writes data.
 *
 * @author TimCatCai
 * @version 2019/04/28
 */
public class MemoryController {
    private DecodingModel<StorageHardwareInputSignal, BigInteger> decodingModel;
    private final MemoryStorageHardwareInterface storageHardware;

    /**
     * You should initialize the decode model and storage hardware interface when you initialize
     * <code>MemoryController</code>. The instance fields carrying on them are just types of interface. You
     * ought to use their implements to initialize them.
     *
     * @param decodingModel the implement of {@link DecodingModel} initializing the
     *                      <code>decodingModel</code> instance field
     * @param storageHardware the implement of {@link MemoryStorageHardwareInterface} initializing
     *                       the <code>storageHardware</code> instance field
     */
    public MemoryController(DecodingModel<StorageHardwareInputSignal, BigInteger> decodingModel,
                            MemoryStorageHardwareInterface storageHardware) {
        this.decodingModel = decodingModel;
        this.storageHardware = storageHardware;
    }

    public long readMemoryByStorageLength(MemoryAddress memoryAddress) {
        BigInteger address = memoryAddress.getAddress();
        StorageHardwareInputSignal signal = decodingModel.decode(address);

        int whichChip = signal.getWhichChip();
        int addressInChip = signal.getAddressInChip();
        long data = storageHardware.read(whichChip, addressInChip);
        return data;
    }


}

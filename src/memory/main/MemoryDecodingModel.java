package memory.main;

import memory.interfaces.DecodingModel;
import java.math.BigInteger;

/**
 * The specify decoding model for one chip
 * @author TimCatCai
 * @version 2019/05/19
 */
public class MemoryDecodingModel implements
        DecodingModel<StorageHardwareInputSignal,BigInteger> {

    @Override
    public StorageHardwareInputSignal decode(BigInteger content) {
        int whichChip = 0 ;
        int addressInChip = content.intValue();
        return new StorageHardwareInputSignal(whichChip,addressInChip);
    }
}

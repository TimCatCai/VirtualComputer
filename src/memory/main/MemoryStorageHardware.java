package memory.main;

import java.math.BigInteger;

public class MemoryStorageHardware {

    private final int SIZE_0F_4M_WITH_LONG = 524288;
    private final int MEMORY_ADDRESS_LENGTH = 32 ;
    /**
     * The Capability of per storage unit is 4M.
     * The size of long is 8B
     * 4M = 2^2 * 2^20 B = 2^22 B
     * 2^22 / 2^3 = 2^19  = 524288 long units
     */
    private long [] storageUnit1 = new long[SIZE_0F_4M_WITH_LONG];

    public long readMemoryByStorageLength (MemoryAddress memoryAddress) {
        BigInteger literalInMemoryAddress = memoryAddress.getAddress();

    }
}

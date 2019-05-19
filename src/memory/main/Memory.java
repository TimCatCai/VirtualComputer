package memory.main;

import memory.interfaces.MemoryInterfaces;

import java.math.BigInteger;

/**
 * The complete memory model of virtual computer.
 * @author TimcatCai
 * @version 2019/05/19
 */
public class Memory implements MemoryInterfaces {
    private MemoryStorageHardware storageHardware;


    @Override
    public void setAddressBus(MemoryAddress address) {

    }

    @Override
    public void setReadOrWriteWire(boolean isReading) {

    }

    @Override
    public void setDataBus(long data) {

    }

    @Override
    public long getDataBus() {
        return 0;
    }
}

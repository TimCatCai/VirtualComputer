package memory.interfaces;

import memory.main.MemoryAddress;

/**
 * all the interfaces of memory model
 * @author TimCatCai
 * @version 2019/05/19
 */
public interface MemoryInterfaces {
    /**
     * sets the address of data writing or reading
     * @param address
     */
    void setAddressBus(MemoryAddress address);

    /**
     * sets the reading-writing wire for memory to control reading or writing
     * @param isReading true for reading data from memory and false writing to memory
     */
    void setReadOrWriteWire(boolean isReading);

    /**
     * When writing data into memory, you input data by this method.
     * @param data data desired to write into memory
     */
    void setDataBus(long data);

    /**
     * when reading from memory, you can get output through this method
     * @return the data you want
     */
    long getDataBus();
}

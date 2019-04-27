package register;

import memory.main.MemoryAddress;

/**
 *
 * @author TimCatCai
 * @version 2019/04/27
 */
public class PageTableBaseAddressRegister {
    private MemoryAddress pageTableStartAddress;

    public MemoryAddress getPageTableStartAddress() {
        return pageTableStartAddress;
    }
}

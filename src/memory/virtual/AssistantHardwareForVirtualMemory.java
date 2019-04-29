package memory.virtual;

import addressing.AbstractAddress;
import bus.AddressBusChainOfResponsibility;
import memory.main.MemoryAddress;
import memory.virtual.page.VirtualTableItem;
import model.AbstractData;
import register.PageTableBaseAddressRegister;

/**
 * This is the assistant hardware to support the function of virtual memory.
 * It is made up with ? parts:
 * <ul>
 *     <li>loading module</li>
 *     <li></li>
 * </ul>
 * @author TimCatCai
 * @version 2019/04/27
 */
public class AssistantHardwareForVirtualMemory {
    private AddressBusChainOfResponsibility addressBus;
    private PageTableBaseAddressRegister register;

    public AssistantHardwareForVirtualMemory() {
        addressBus = AddressBusChainOfResponsibility.getInstance();
    }

    /**
     * Gets data from memory through <code>virtualAddress</code>
     * @param memoryAddress  memory address of data  you read from memory each time
     * @return abstractData got from memory
     */
    public AbstractData getDataFromMemory(AbstractAddress memoryAddress) {
       return addressBus.requestForData(memoryAddress);
    }

    /**
     *
     * @param startAddress
     * @param virtualAddress
     * @return
     */
    public VirtualTableItem getVirtualTableItem(MemoryAddress startAddress, VirtualAddress virtualAddress) {
            //@TODO: get virtualTableItem that virtual address points to through startAddress and
            // @TODO: virtualPageNumber in virtualAddress (TimCatCai 2019/04/27 5min)
        return null;
    }


    public AbstractData getDataFromMemoryByRealAddress() {
        // @TODO: get data from memory through real address including real page number and location in page
        // @TODO: by address transforming (TimCatCai 2019/04/27 20min)
        return null;
    }

    public RealAddress loadDataFromDishToMemory() {
        //@TODO: if memory isn't full load data from dish to memory directly(including load and add item to
        //@TODO: page table and return real address)
        //@TODO: if memory is full, exchange data between memory(move the data out of memory and resize the page table item
        //@TODO: ) and dish(load data to memory and resize page table item) including exchange algorithm,
        //@TODO: finally return the realAddress of the data (TimCatCai 2019/04/27)
        return null;
    }
    /**
     * This is called by cpu when it wants to get data from memory by virtual address.
     *
     * @param virtualAddress
     * @return
     */
    public AbstractData getDataFromMemoryByVirtualAddress(VirtualAddress virtualAddress){
        VirtualTableItem tableItem = getVirtualTableItem(this.register.getPageTableStartAddress(),virtualAddress);
        AbstractData result;
        if (tableItem.isIncluded()) {
           result =  getDataFromMemoryByRealAddress();
        } else {
            loadDataFromDishToMemory();
           result =  getDataFromMemoryByRealAddress();
        }

        return result;
    }


    public void setRegister(PageTableBaseAddressRegister register) {
        this.register = register;
    }
}

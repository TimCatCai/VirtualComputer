package memory.virtual;

import addressing.AbstractAddress;

/**
 * The virtual address of virtual memory.
 * This consist of two parts or component: virtual page number and address in page whose
 * key is specified by {@link #VIRTUAL_PAGE_NUMBER_KEY } and {@link #ADDRESS_IN_PAGE_KEY}
 * respectively.
 *
 * @author TimCatCai
 * @version  2019/04/26
 */
public class VirtualAddress extends AbstractAddress {
    private final String VIRTUAL_PAGE_NUMBER_KEY = "virtualPageNumber";
    private final String ADDRESS_IN_PAGE_KEY = "addressInPage";

    /**
     * The value of virtual page number and address in page are not conveyed in,
     * so just initial them to empty string.
     */
    public VirtualAddress(){
        init("","");
    }

    /**
     * Convey the value of virtual page number and address in page to initial this class.
     * @param virtualPageNumber string of virtualPageNumber contains virtual address
     * @param addressInPage string of addressInPage contains the location in a page
     */
    public VirtualAddress(String virtualPageNumber, String addressInPage) {
        init(virtualPageNumber,addressInPage);
    }


    @Override
    public String getAddress() {
        StringBuilder address = new StringBuilder();
        address.append(getComponent(VIRTUAL_PAGE_NUMBER_KEY));
        address.append(getComponent(ADDRESS_IN_PAGE_KEY));
        return address.toString();
    }

    public String getVirtualPageNumber() {
        return getComponent(VIRTUAL_PAGE_NUMBER_KEY);
    }

    public String getAddressInPage() {
        return getComponent(VIRTUAL_PAGE_NUMBER_KEY);
    }

    public void setVirtualPageNumber(String virtualPageNumber) {
        resizeComponentValue(VIRTUAL_PAGE_NUMBER_KEY, virtualPageNumber);
    }

    public void setAddressInPage(String addressInPage) {
        resizeComponentValue(VIRTUAL_PAGE_NUMBER_KEY, addressInPage);
    }

    /**
     * Initials this by adding all components of address to {@link AbstractAddress#addressCompontents} container.
     * @param virtualPageNumber string of virtualPageNumber contains virtual address
     * @param addressInPage string of addressInPage contains the location in a page
     */
    private void init(String virtualPageNumber, String addressInPage) {
        addComponent(VIRTUAL_PAGE_NUMBER_KEY, virtualPageNumber);
        addComponent(ADDRESS_IN_PAGE_KEY, addressInPage);
    }



}

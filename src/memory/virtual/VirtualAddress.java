package memory.virtual;

import addressing.AbstractAddress;

import java.math.BigInteger;

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
        init(new BigInteger("0"),new BigInteger(("0")));
    }

    /**
     * Convey the value of virtual page number and address in page to initial this class.
     * @param virtualPageNumber string of virtualPageNumber contains virtual address
     * @param addressInPage string of addressInPage contains the location in a page
     */
    public VirtualAddress(BigInteger virtualPageNumber, BigInteger addressInPage) {
        init(virtualPageNumber,addressInPage);
    }


    @Override
    public BigInteger getAddress() {
        StringBuilder address = new StringBuilder();
        address.append(getComponent(VIRTUAL_PAGE_NUMBER_KEY).toString());
        address.append(getComponent(ADDRESS_IN_PAGE_KEY).toString());
        return new BigInteger(address.toString());
    }

    public BigInteger getVirtualPageNumber() {
        return getComponent(VIRTUAL_PAGE_NUMBER_KEY);
    }

    public BigInteger getAddressInPage() {
        return getComponent(VIRTUAL_PAGE_NUMBER_KEY);
    }

    public void setVirtualPageNumber(BigInteger virtualPageNumber) {
        resizeComponentValue(VIRTUAL_PAGE_NUMBER_KEY, virtualPageNumber);
    }

    public void setAddressInPage(BigInteger addressInPage) {
        resizeComponentValue(VIRTUAL_PAGE_NUMBER_KEY, addressInPage);
    }

    /**
     * Initials this by adding all components of address to {@link AbstractAddress#addressComponents} container.
     * @param virtualPageNumber string of virtualPageNumber contains virtual address
     * @param addressInPage string of addressInPage contains the location in a page
     */
    private void init(BigInteger virtualPageNumber, BigInteger addressInPage) {
        addComponent(VIRTUAL_PAGE_NUMBER_KEY, virtualPageNumber);
        addComponent(ADDRESS_IN_PAGE_KEY, addressInPage);
    }



}

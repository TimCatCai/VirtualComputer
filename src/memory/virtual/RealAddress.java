package memory.virtual;

import addressing.AbstractAddress;

import java.math.BigInteger;

/**
 * The page real location in Memory
 * @author TimcatCai
 * @Version 2019/05/18
 */
public class RealAddress extends AbstractAddress {

    private final String REAL_PAGE_NUMBER_KEY = "realPageNumber";
    private final String ADDRESS_IN_PAGE_KEY = "addressInPage";

    @Override
    public BigInteger getAddress() {
        StringBuilder address = new StringBuilder();
        address.append(getRealPageNumber().toString());
        address.append(getAddressInPage().toString());
        return new BigInteger(address.toString());
    }

    public BigInteger getRealPageNumber(){
       return getComponent(this.REAL_PAGE_NUMBER_KEY);
    }

    private BigInteger getAddressInPage(){
        return getComponent(this.ADDRESS_IN_PAGE_KEY);
    }
}

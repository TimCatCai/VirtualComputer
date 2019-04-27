package bus;

import addressing.AbstractAddress;
import model.AbstractData;

/**
 *  This imitate the address bus in computer.
 *  The implementation uses chain of responsibility and single pattern.
 * @author TimCatCai
 * @version 2019/04/27
 */
public class AddressBusChainOfResponsibility {

    private static AddressBusChainOfResponsibility sAddressBus;
    //@TODO: add a request queue to deal with data request (TimcatCai 2019/04/27 15:08 30min)

    private AddressBusChainOfResponsibility(){

    }

    public static AddressBusChainOfResponsibility getInstance(){
        if(sAddressBus == null) {
            sAddressBus = new AddressBusChainOfResponsibility();
        }

        return sAddressBus;
    }

    public AbstractData requestForData(AbstractAddress address){
        //@TODO: add the request to the request queue, and return the abstractData(TimcatCai 2019/04/27 15:08 5min )
        return null;
    }
}

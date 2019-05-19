package memory.virtual.page;

/**
 * Each item in virtual page table.
 * @author TimCatCai
 * @version 2019/05/18
 */
public class VirtualTableItem {
    private String virtualPageNumber;
    private String realPageNumber;
    private boolean isIncluded;
    private String dishPageNumber;

    public VirtualTableItem(String virtualPageNumber, String realPageNumber, boolean isIncluded, String dishPageNumber) {
        this.virtualPageNumber = virtualPageNumber;
        this.realPageNumber = realPageNumber;
        this.isIncluded = isIncluded;
        this.dishPageNumber = dishPageNumber;
    }

    public String getVirtualPageNumber() {
        return virtualPageNumber;
    }

    public String getRealPageNumber() {
        return realPageNumber;
    }

    public boolean isIncluded() {
        return isIncluded;
    }

    public String getDishPageNumber() {
        return dishPageNumber;
    }

    public void setVirtualPageNumber(String virtualPageNumber) {
        this.virtualPageNumber = virtualPageNumber;
    }

    public void setRealPageNumber(String realPageNumber) {
        this.realPageNumber = realPageNumber;
    }

    public void setIncluded(boolean included) {
        isIncluded = included;
    }

    public void setDishPageNumber(String dishPageNumber) {
        this.dishPageNumber = dishPageNumber;
    }
}

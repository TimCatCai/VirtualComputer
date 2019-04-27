package memory.virtual.page;

public class VirtualTableItem {
    private String virtualPageNumber;
    private String realPageNumber;
    private boolean isIncluded;
    private String dishPageNumber;

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

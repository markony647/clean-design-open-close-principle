package task1.com.epam.cleandesign;

public abstract class Record {

    abstract String getRecordFormatted();

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

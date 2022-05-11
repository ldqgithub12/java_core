public class Serial extends Film{
    private int soTap;
    private int avgTime;

    public Serial() {
    }

    public Serial(int id, String title, String type, String author, String releaseDate, int soTap, int avgTime) {
        super(id, title, type, author, releaseDate);
        this.soTap = soTap;
        this.avgTime = avgTime;
    }

    public int getSoTap() {
        return soTap;
    }

    public void setSoTap(int soTap) {
        this.soTap = soTap;
    }

    public int getAvgTime() {
        return avgTime;
    }

    public void setAvgTime(int avgTime) {
        this.avgTime = avgTime;
    }

    @Override
    public void printInfor() {
        super.printInfor();
        System.out.printf("%-10d %-20d\n",soTap,avgTime);

    }
}

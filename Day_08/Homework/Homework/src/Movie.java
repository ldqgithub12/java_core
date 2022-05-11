public class Movie extends Film {
    private int time;

    public Movie() {
    }

    public Movie(int id, String title, String type, String author, String releaseDate, int time) {
        super(id, title, type, author, releaseDate);
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public void printInfor() {
        super.printInfor();
        System.out.printf("%-10d\n",time);
    }
}

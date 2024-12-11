public class HealthRecord {
    private int height;
    private static final int MIN_PERMITTED_HEIGHT = 50;
    private static final int MAX_PERMITTED_HEIGHT = 175;
    private static final int DEFAULT_HEIGHT = 100;
    private static int tallestHeight = MIN_PERMITTED_HEIGHT;
    private static int shortestHeight = MAX_PERMITTED_HEIGHT;
    private static int counter = 0 ;
    private static int averageHeight = 0 ;



    public HealthRecord(int height) {
        setHeight(height);
    }

    public void setHeight(int height) {
        if ( height > MIN_PERMITTED_HEIGHT && height < MAX_PERMITTED_HEIGHT )
            this.height = height;
        else {
            this.height = DEFAULT_HEIGHT;
        }
        if ( this.height > tallestHeight )
            tallestHeight = this.height ;
        if ( this.height < shortestHeight ){
            shortestHeight = this.height;
        }
        this.averageHeight = (this.averageHeight*(counter) + this.height)/(counter+1) ;
        counter ++ ;
    }
    public int getHeight() {
        return this.height;
    }
    public static int getTallestHeight() {
        return HealthRecord.tallestHeight;
    }
    public static int getShortestHeight() {
        return HealthRecord.shortestHeight;
    }
    public static int getaverageHeight() {
        return HealthRecord.averageHeight;
    }
    public void displayDetails() {
        System.out.println("Height (cm): " + getHeight());
    }
    public static void displayClassDetails() {
        System.out.println("The tallest height (cm): " + getTallestHeight());
        System.out.println("The shortest height (cm): " + getShortestHeight());
        System.out.println("averageHeight (cm): " + getaverageHeight());
    }

}

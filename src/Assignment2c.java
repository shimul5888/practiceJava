public class Assignment2c {
    public static void main(String[] args) {
        int totalTime = 0;
        int limit = 300;
        int movieDuration = 120;
        while (totalTime + movieDuration <= limit)
        {
            totalTime += movieDuration;
            System.out.println(totalTime);

        }

}}

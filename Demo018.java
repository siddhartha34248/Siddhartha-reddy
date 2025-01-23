public class Demo018 {
    public static void main(String[] args) {
        
        long minutes = 1000000;

       
        long days = minutes / (24 * 60);
        
        
        long remainingMinutes = minutes % (24 * 60);
        long hours = remainingMinutes / 60;
        
        
        long remainingMinutesAfterHours = remainingMinutes % 60;
        
        
        System.out.println(minutes + " minutes is equivalent to: ");
        System.out.println(days + " days, " + hours + " hours, and " + remainingMinutesAfterHours + " minutes.");
    }
}
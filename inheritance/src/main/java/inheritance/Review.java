package inheritance;

public class Review extends Restaurant {

    private String messageBody;
    private String author;
    private int stars;
    protected Restaurant newRestaurant;


    public Review(String messageBody, String author, int stars)
    {
        this.messageBody = messageBody;
        this.author = author;
        this.stars = stars;
    }

    @Override
    public String toString()
    {
        return String.format("%d this Restaurant is  %d Rating for this Restaurant and Feedback: %s by %s ",newRestaurant.getRestaurantName,this.stars,this.messageBody,this.author);
    }

}

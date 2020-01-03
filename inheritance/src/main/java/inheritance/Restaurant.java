package inheritance;

public class Restaurant {

    private String restaurantName;
    private int starsRating;
    private int priceCategory;
    protected Review newReview;
   public Restaurant () {};


    public Restaurant(String restaurantName, int starsRating, int priceCategory) {
        this.restaurantName = restaurantName;
        this.starsRating = starsRating;
        this.priceCategory = priceCategory;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String addReview(Review newReview)

    {
     return newReview.toString();

    }

    public String toString() {

        return String.format("%s restaurant has %d Star Rating  and spent amount per person for dinning is %d ", this.restaurantName, this.starsRating, this.priceCategory);

    }

}

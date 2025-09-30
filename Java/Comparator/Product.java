class Product{
    private String prodName;
    private double originalPrice;
    private double discountedPrice;
    private double rating;
    private String category;

    public Product(String name, double ogPrice, double discountPrice, double rating, String category){
        prodName = name;
        originalPrice = ogPrice;
        discountedPrice = discountPrice;
        this.rating=rating;
        this.category = category;
    }

    public String getProdName(){
        return prodName;
    }

    public double getOriginalPrice(){
        return originalPrice;
    }

    public double getDiscountedPrice(){
        return discountedPrice;
    }
    public double getRating(){
        return rating;
    }

    public String getCategory(){
        return category;
    }

   public double getDiscountPer(){
        double discount = ((getOriginalPrice() - getDiscountedPrice()) / getOriginalPrice()) * 100;
    return Math.round(discount * 100.0) / 100.0;
   } 
}
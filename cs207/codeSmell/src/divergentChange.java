class Product {
    private String type;

    Product(String type) {
        this.type = type;
    }
    // when we add a new type we need to change all the three methods below
    public int getBasePrice() {
        switch (this.type) {
            case "food":
                return 10;
            case "drinks":
                return 7;
            case "books":
                return 3;
            default:
                return 0;
        }
    }

    public int getTaxPercent() {
        switch (this.type) {
            case "food":
            case "drinks":
                return 24;
            case "books":
                return 8;
            default:
                return 0;
        }
    }

    public String getProductCategory(){
        switch (this.type) {
            case "food":
            case "drinks":
                return "Food and Beverages";
            case "books":
                return "Education";
            default:
                return "-";
        }
    }
}
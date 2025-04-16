class Rum extends Decorator{
    Rum(Offering offering){
        this.offering=offering;
    }
    
    String getName(){
        return offering.getNmae() + " with Rum";
    }
    
    int getPrice(){
        return offering.getPrice()+55;
    }
}
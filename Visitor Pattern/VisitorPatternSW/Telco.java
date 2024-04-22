package VisitorPatternSW;

public class Telco implements TelcoSubscription{
    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean isUnliCallText;


    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean isUnliCallText){
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.isUnliCallText = isUnliCallText;
    }


    @Override
    public String accept(UsagePromo usagePromo, double price) {
        this.promoPrice = price;
        return usagePromo.showAllowance(telcoName, price);
    }

    @Override
    public String accept(UnliCallOffer unliCallOffer, boolean isUliCallText) {
        this.isUnliCallText = isUnliCallText;
        return unliCallOffer.showUnliCallsTextOffer(telcoName, isUnliCallText);
    }

    @Override
    public String getTelcoName() {
        return telcoName;
    }

    @Override
    public double getPromoPrice() {
        return promoPrice;
    }

    @Override
    public int getDataAllowance() {
        return dataAllowance;
    }

    @Override
    public boolean getUnliCallText() {
        return isUnliCallText;
    }


}

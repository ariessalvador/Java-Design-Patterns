package VisitorPatternSW;

public interface TelcoSubscription{
    public String accept(UsagePromo usagePromo, double price);
    public String accept(UnliCallOffer unliCallOffer, boolean unliCallText);
    public String getTelcoName();
    public double getPromoPrice();
    public int getDataAllowance();
    public boolean getUnliCallText();
}
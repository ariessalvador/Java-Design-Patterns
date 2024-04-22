# Telecom Subscription Comparison and Visitor Design Pattern Implementation

Imagine you are looking for a new mobile plan for your smartphone. Three major telecommunication providers are offering enticing deals: Smart, Globe, and Ditto.

Smart: Offers a data allowance of 15 GB for ₱500 per month. However, they do not offer any free calls or texts, and you will be charged per use.
Globe: Provides a data allowance of 10 GB for ₱450 per month. This plan comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.
Ditto: Offers a data allowance of 8 GB for ₱400 per month. This plan includes unlimited calls and texts to all networks within the country.
Implement the visitor design pattern based from the given diagram.

## UML Class Diagram
![image](https://github.com/ariessalvador/Software-Engineering-Projects/assets/142958841/30f25f5e-6e1d-4ed9-8a77-f68d7921392b)


Test your codes before the given client program:
```java
public class TelcoPromo {
    public static void main(String[] args) {
        TelcoSubscription smart = new Telco(15, 500, "Smart",false);
        TelcoSubscription globe = new Telco(10, 450, "Globe",true);
        TelcoSubscription ditto = new Telco(8, 400, "Ditto",true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallOffer unli = new UnliCallTextPackage();

        System.out.println("Smart Data Usage Offer and price:" + promo.showAllowance(smart.getTelcoName(), smart.getPromoPrice()));
        System.out.println("Globe Data Usage Offer and price:" + promo.showAllowance(globe.getTelcoName(), globe.getPromoPrice()));
        System.out.println("Ditto Data Usage Offer and price:" + promo.showAllowance(ditto.getTelcoName(), ditto.getPromoPrice()));

        System.out.println("\nSmart unlimited calls and text package: " +
                unli.showUnliCallsTextOffer(smart.getTelcoName(), smart.getUnliCallText()));

        System.out.println("Globe unlimited calls and text package: " +
                unli.showUnliCallsTextOffer(globe.getTelcoName(), globe.getUnliCallText()));

        System.out.println("Ditto unlimited calls and text package: " +
                unli.showUnliCallsTextOffer(ditto.getTelcoName(), ditto.getUnliCallText()));
    }
}

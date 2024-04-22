package VisitorPatternSW;

import java.util.*;

public class UnliCallTextPackage implements UnliCallOffer{
    private static Map<String, String> unliCallTextOfferMap = new HashMap<>();

    static {
        unliCallTextOfferMap.put("Smart", "No complimentary calls or texts provided; charges apply for each usage.");
        unliCallTextOfferMap.put("Globe", "Enjoy unlimited calls and texts within their network, additional charges apply for calls and texts to other networks.");
        unliCallTextOfferMap.put("Ditto", "Experience unlimited calls and texts to all networks nationwide.");
    }
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean isUnliCallText) {
        String plan = unliCallTextOfferMap.getOrDefault(telcoName, "Unknown");
        return isUnliCallText ? "There is an unlimited call and text package available for " + telcoName + ". " + plan :
                "There is no unlimited call and text package found for " + telcoName + ". " + plan;
    }
}

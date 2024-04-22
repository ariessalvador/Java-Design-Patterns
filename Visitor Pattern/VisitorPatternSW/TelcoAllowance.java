package VisitorPatternSW;
import java.util.*;

public class TelcoAllowance implements UsagePromo{
    private static final Map<String, Double> telcoAllowanceMap = new HashMap<>();
    static {
        telcoAllowanceMap.put("Smart", 15.0);
        telcoAllowanceMap.put("Globe", 10.0);
        telcoAllowanceMap.put("Ditto", 8.0);
    }
    @Override
    public String showAllowance(String telcoName, double price) {
        double allowance = telcoAllowanceMap.getOrDefault(telcoName, 0.0);
        return telcoName + " provides a monthly data allocation of " + allowance + " GB for ₱" + price + ".";
    }
}

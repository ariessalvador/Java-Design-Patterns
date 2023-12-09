
public class CentralizedQueueSystem {
    private static CentralizedQueueSystem instance;
    private int helpDeskANum;
    private int helpDeskBNum;
    private int helpDeskCNum;

    private CentralizedQueueSystem() {
        helpDeskANum = 1;
        helpDeskBNum = 1;
        helpDeskCNum = 1;
    }

    public static synchronized CentralizedQueueSystem getInstance() {
        if (instance == null) {
            instance = new CentralizedQueueSystem();
        }
        return instance;
    }

    public synchronized void getCurrentQueueNumber(){
        System.out.println("Current Queue Number");
        System.out.println("Help Desk A : " + helpDeskANum);
        System.out.println("Help Desk B : " + helpDeskBNum);
        System.out.println("Help Desk C : " + helpDeskCNum);
    }
    public synchronized void setQueueNumber(int helpDeskNum) {
        switch (helpDeskNum) {
            case 1:
                if (helpDeskANum == 5) {
                    System.out.println("Help Desk A is currently full. Please wait for reset.");
                    resetQueueNumber(1, 1);
                } else {
                    System.out.println("Person assigned to Help Desk A with Queue Number: " + helpDeskANum);
                    helpDeskANum++;
                }
                break;
            case 2:
                if (helpDeskBNum == 5) {
                    System.out.println("Help Desk B is currently full. Please wait for reset.");
                    resetQueueNumber(2, 1);
                } else {
                    System.out.println("Person assigned to Help Desk B with Queue Number: " + helpDeskBNum);
                    helpDeskBNum++;
                }
                break;
            case 3:
                if (helpDeskCNum == 5) {
                    System.out.println("Help Desk C is currently full. Please wait for reset.");
                    resetQueueNumber(3, 1);
                } else {
                    System.out.println("Person assigned to Help Desk C with Queue Number: " + helpDeskCNum);
                    helpDeskCNum++;
                }
                break;
        }
    }
    public synchronized void resetQueueNumber(int helpDeskNum, int queueNumber){
        switch(helpDeskNum){
            case 1:
                helpDeskANum = queueNumber;
                break;
            case 2:
                helpDeskBNum =queueNumber;
                break;
            case 3:
                helpDeskCNum = queueNumber;
                break;
        }
    }
}

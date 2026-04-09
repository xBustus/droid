
package com.mycompany.droid;

/**
 *
 * @author gabri
 */
public class Droid {
    
    String droidName;
    int droidBattery;
    boolean performingATask;
    boolean statingItsBatteryLevel;
    
    public Droid(String name, int battery, boolean isWorking, boolean batterySensor){
    droidName = name;
    droidBattery = battery;
    performingATask = isWorking;
    statingItsBatteryLevel = batterySensor;
    }
    
    public void performTask(String task){
        droidBattery -= 10;
        System.out.println(droidName + " is performing task " + task);
        
    }
    
    public void energyReport(){
        System.out.println("O " + droidName + " tem " + droidBattery + " de bateria agora");
    }
    
    public void energyTransfer(Droid otherDroid) {
    // Tira 10 da bateria de quem chamou o método
    droidBattery -= 10;
    
    // Aumenta 10 na bateria do robô que está nos parênteses
    otherDroid.droidBattery += 10;
}
   
    public String toString() {
        return "Olá, eu sou o robô " + droidName + "!";
    }
    
    public static void main(String[] args) {
        Droid codey = new Droid("codey", 100, true, true);
        Droid margot = new Droid("margot", 100, true, true);
        System.out.println(codey);
        System.out.println(codey.droidName);
        codey.performTask("Dancing");
        codey.energyReport();
        margot.performTask("Levitating");
        margot.energyReport();
        margot.performTask("Levitating more");
        margot.energyReport();
        codey.energyTransfer(margot);
         margot.energyReport();
         codey.energyReport();
    }
}

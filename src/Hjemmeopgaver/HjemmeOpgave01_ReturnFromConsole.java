package Hjemmeopgaver;

public class HjemmeOpgave01_ReturnFromConsole {
    public static void main(String[] args){
        System.out.println(MissionTable01());
    }
    // This method is returning multiple String values.
    public static String MissionTable01() {

        //Calling my strings the their respective names and using \t to control how much space there is in between.
        String Mission = "Mission \t Year \t Days in Space";
        String IRISS = "IRISS \t \t 2015 \t 10";
        String Huginn = "Huginn \t \t 2023 \t 180";

        //Calling a \n string for "newline"
        String newline = "\n";

        // Using the named strings + newline to return the string values and the newlines values.
        return Mission + newline + IRISS + newline + Huginn;
    }
}

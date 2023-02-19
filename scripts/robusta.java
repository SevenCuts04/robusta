package scripts;
import java.io.IOException;
import java.util.*;

public class robusta{
    
    static robusta obj = new robusta();

    //Bot running functions
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String psw;
        System.out.println("Welcome to robusta!");
        System.out.println("Enter Key to turn Bot online:");
        psw = sc.nextLine();
        switch(psw){
            case "$botOnl": obj.botOnline(); break;
            default: obj.scriptRun(psw);
        }
    }

    public void botOnline(){
        String nextCMD="";
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("  ENTER COMMAND   ");
            nextCMD = sc.nextLine();
            obj.scriptRun(nextCMD);
    }
    
    //Command Handler function
      void scriptRun(String cmd){
        gramCreator cr = new gramCreator();
        Scanner sc = new Scanner(System.in);
        int gen;
        switch(cmd){

            case "::gen": System.out.println("ENTER PROGRAM CREATION TYPE:");
                          System.out.println("OPTIONS: [1] - Pyramid Loop generation | [2] - Series Generator");
                          gen = sc.nextInt();
                          cr.create(gen);
                          break;

            default: System.out.println("EXITING PROGRAM");
                     System.exit(0);
        }
        }
}

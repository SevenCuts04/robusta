package scripts;
import java.util.*;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;  

public class gramCreator {

    robusta obj = new robusta();
    int n;

    public void create(int g){
        Scanner sc = new Scanner(System.in);
        int inp, type;
        int i=0,j=0,p,q;
        if(g == 1){
            System.out.println("[--------- Pyramid loop ---------]");
            System.out.println("Enter the type of Pyramid:");
            System.out.println("----- OPTION [1] -----");
            System.out.println(" Ascending pyramid ");
            System.out.println("1");
            System.out.println("2 3");
            System.out.println("4 5 6");
            System.out.println("7 8 9 10");
            System.out.println("----- OPTION [2] -----");
            System.out.println(" Descending pyramid ");
            System.out.println("10 9 8 7");
            System.out.println("6 5 4");
            System.out.println("3 2");
            System.out.println("1");
            System.out.println("----- OPTION [3] -----");
            System.out.println(" Pascal's Triangle pyramid");
            inp = sc.nextInt();
            switch(inp){
                case 1: System.out.println("Would you like to: [1] Generate a pyramid | [2] Genearate a code for a pyramid");
                inp = sc.nextInt();
                    System.out.println("What kind of pattern would you like to form?");
                    System.out.println("----- OPTION [1] -----");
                    System.out.println(" General Ascending pyramid ");
                    System.out.println("1");
                    System.out.println("2 3");
                    System.out.println("4 5 6");
                    System.out.println("7 8 9 10");
                    System.out.println("----- OPTION [2] -----");
                    System.out.println(" Repeated Ascending pyramid ");
                    System.out.println("1");
                    System.out.println("2 2");
                    System.out.println("3 3 3");
                    System.out.println("4 4 4 4");
                    type = sc.nextInt();
                    System.out.println("What are the number of rows?");
                    n = sc.nextInt();
                    if(inp == 1){
                        if(type == 1){
                            System.out.println("[---OUTPUT---]");
                            int k = 1;
                            for(i=0;i<n;i++){
                                for(j=0;j<=i;j++){
                                    System.out.print(k+" ");
                                    k++;
                                }
                                System.out.println();
                            }
                        }else if(type == 2){
                            System.out.println("[---OUTPUT---]");
                            for(i=0;i<n;i++){
                                for(j=0;j<=i;j++){
                                    System.out.print((i+1)+" ");
                                }
                                System.out.println();
                            }
                        }else{
                            System.out.println("INVALID TYPE!");
                        }
                       }else if(inp == 2){
                        //TODO
                       }else{
                        System.out.println("INVALID INPUT!");
                       }
            
                break;
                case 2: 
                System.out.println("Would you like to: [1] Generate a pyramid | [2] Genearate a code for a pyramid");
                inp = sc.nextInt();
                System.out.println("What are the number of rows?");
                n = sc.nextInt();
                System.out.println("What kind of pattern would you like to form?");
                System.out.println("----- OPTION [1] -----");
                System.out.println(" General Descending pyramid ");
                System.out.println("10 9 8 7");
                System.out.println("6 5 4");
                System.out.println("3 2");
                System.out.println("1");
                System.out.println("----- OPTION [2] -----");
                System.out.println(" Repeated Descending pyramid ");
                System.out.println("4 4 4 4");
                System.out.println("3 3 3");
                System.out.println("2 2");
                System.out.println("1");
                type = sc.nextInt();
               if(inp == 1){
                if(type == 1){
                    System.out.println("What are the number of rows you would like?");
                    i = sc.nextInt();

                }else if(type == 2){

                }else{
                    System.out.println("INVALID TYPE!");
                }
               }else if(inp == 2){
                //TODO
               }else{
                System.out.println("INVALID INPUT!");
               }
               break;
               case 3: System.out.println("Would you like to: [1] Generate a pyramid | [2] Genearate a code for a pyramid");
               inp = sc.nextInt();
               if(inp == 1){
                System.out.println("What are the number of rows?");
                n = sc.nextInt();
                for (int line = 1; line <= n; line++) {
                    for (j = 0; j <= n - line; j++) {
         
                        // for left spacing
                        System.out.print(" ");
                    }
         
                    // used to represent C(line, i)
                    int C = 1;
                    for (i = 1; i <= line; i++) {
         
                        // The first value in a line is always 1
                        System.out.print(C + " ");
                        C = C * (line - i) / i;
                    }
                    System.out.println();
                }
                System.out.println();
                System.out.println("Would you like to generate the code for this output? [Y/N]");
                char c = sc.next().charAt(0);
                if(c == 'Y'){
                System.out.println("Enter a UNIQUE file name for this pattern.");
                String fname = sc.next();
                    try {
                        File myObj = new File(fname);
                        if (myObj.createNewFile()) {
                          System.out.println("[DELETE AFTER USE IMMEDIATELY] File created: " + myObj.getName());
                          try {
                            FileWriter myWriter = new FileWriter(fname);
                            myWriter.write("[IN THE MAIN FUNCTION]\rfor (int line = 1; line <= "+n+"; line++) {\r\tfor (int j = 0; j <= "+n+" - line; j++) {\r\t\tSystem.out.print(' ');\r\t}\r\tint C = 1;\r\tfor (int i = 1; i <= line; i++) {\r\t\tSystem.out.print(C + ' ');\r\t\tC = C * (line - i) / i;\r\t}\r\tSystem.out.println();\r}");
                            myWriter.close();
                            System.out.println("Successfully wrote to the file.");
                          } catch (IOException e) {
                            System.out.println("An error occurred.");
                            e.printStackTrace();
                          }
                        } else {
                          System.out.println("File already exists.");
                        }
                        
                      } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                      }
                }else{
                    System.out.println("INVALID INPUT!");
                }
               }else if(inp == 2){
                System.out.println("Enter a UNIQUE file name for this pattern.");
                String fname = sc.next();
                System.out.println("What are the number of rows?");
                n = sc.nextInt();
                try {
                    File myObj = new File(fname);
                    if (myObj.createNewFile()) {
                      System.out.println("[DELETE AFTER USE IMMEDIATELY] File created: " + myObj.getName());
                      try {
                        FileWriter myWriter = new FileWriter(fname);
                        myWriter.write("[IN THE MAIN FUNCTION]\rfor (int line = 1; line <= "+n+"; line++) {\r\tfor (int j = 0; j <= "+n+" - line; j++) {\r\t\tSystem.out.print(' ');\r\t}\r\tint C = 1;\r\tfor (int i = 1; i <= line; i++) {\r\t\tSystem.out.print(C + ' ');\r\t\tC = C * (line - i) / i;\r\t}\r\tSystem.out.println();\r}");
                        myWriter.close();
                        System.out.println("Successfully wrote to the file.");
                      } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                      }
                    } else {
                      System.out.println("File already exists.");
                    }
                    
                  } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                  }

               }else{
                System.out.println("INVALID INPUT!");
               }
            }

            obj.botOnline();
        }else if(g == 2){
            System.out.println("Series loop");
            obj.botOnline();
        }
    }

    void codeCreator(){
        
    }
}


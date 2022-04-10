package application;
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class App extends Application {
  
    public static int field [][][]= new int[4][4][4]; 
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root =FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        primaryStage.setTitle("3D Tic Tac Toe");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    } 
        
   // checks the winning or playability of the game, it will be eddited
   // 0 means playable, 1 means player 1 wins, 2 mean player 2 wins, 3 means draw. the game should stop forall conditions except
   public static int gameCondition(int[][][] arr){
    // seeing if there is space available to play
       int counter=0;
       for (int i=0; i<4; i++){
           for (int o=0; o<4; o++){
               for (int p=0; p<4; p++){
                   if (arr[i][o][p] == 0){
                       counter++;
                   }
               }
           }
       }
       if (counter == 0){
           return 3;
       } else {
           //determining who wins
           boolean xwin = false;
           boolean owin = false;
           int xcounter=0;
           int ocounter=0;
               //looking for accross wins
           for (int i=0; i<4;i++){
               for (int o=0; o<4; o++){
                   for (int p=0;p<4;p++){
                       if (arr[p][i][o] == 1){
                           xcounter++;
                       } else if (arr[p][i][o] == 2){
                           ocounter++;
                       }
                   }
                   if (xcounter == 4){
                       xwin = true;
                       break;
                   } else if (ocounter == 4){
                       owin = true;
                       break;
                   }
                   xcounter =0;
                   ocounter =0;
               }
           }
               // forward and back wins
               for (int i=0; i<4;i++){
                   for (int o=0; o<4; o++){
                       for (int p=0;p<4;p++){
                           if (arr[o][i][p] == 1){
                               xcounter++;
                           } else if (arr[o][i][p] == 2){
                               ocounter++;
                           }
                       }
                       if (xcounter == 4){
                           xwin = true;
                           break;
                       } else if (ocounter == 4){
                           owin = true;
                           break;
                       }
                       xcounter =0;
                       ocounter =0;
                   }
               }
 
                   //verticle wins
               for (int i=0; i<4;i++){
                   for (int o=0; o<4; o++){
                       for (int p=0;p<4;p++){
                           if (arr[o][p][i] == 1){
                               xcounter++;
                           } else if (arr[o][p][i] == 2){
                               ocounter++;
                           }
                       }
                       if (xcounter == 4){
                           xwin = true;
                           break;
                       } else if (ocounter == 4){
                           owin = true;
                           break;
                       }
                       xcounter =0;
                       ocounter =0;
                   }
               }
                   // diagonal lines on the same height
               for (int o=0; o<4; o++){
                   for (int p=0;p<4;p++){
                       if (arr[p][o][p] == 1){
                           xcounter++;
                       } else if (arr[p][o][p] == 2){
                           ocounter++;
                       }
                   }
                   if (xcounter == 4){
                       xwin = true;
                       break;
                   } else if (ocounter == 4){
                       owin = true;
                       break;
                   }
                   xcounter =0;
                   ocounter =0;
                   for (int p=0;p<4;p++){
                       if (arr[3-p][o][p] == 1){
                           xcounter++;
                       } else if (arr[3-p][o][p] == 2){
                           ocounter++;
                       }
                   }
                   if (xcounter == 4){
                       xwin = true;
                       break;
                   } else if (ocounter == 4){
                       owin = true;
                       break;
                   }
                   xcounter =0;
                   ocounter =0;
               }
 
               // diagonal lines on facing the screen
           for (int o=0; o<4; o++){
               for (int p=0;p<4;p++){
                   if (arr[o][p][p] == 1){
                       xcounter++;
                   } else if (arr[o][p][p] == 2){
                       ocounter++;
                   }
               }
               if (xcounter == 4){
                   xwin = true;
                   break;
               } else if (ocounter == 4){
                   owin = true;
                   break;
               }
               xcounter =0;
               ocounter =0;
               for (int p=0;p<4;p++){
                   if (arr[3-o][p][p] == 1){
                       xcounter++;
                   } else if (arr[3-o][p][p] == 2){
                       ocounter++;
                   }
               }
               if (xcounter == 4){
                   xwin = true;
                   break;
               } else if (ocounter == 4){
                   owin = true;
                   break;
               }
               xcounter =0;
               ocounter =0;
           }
               // diagonal lines facing side ways
           for (int o=0; o<4; o++){
               for (int p=0;p<4;p++){
                   if (arr[p][p][o] == 1){
                       xcounter++;
                   } else if (arr[p][p][o] == 2){
                       ocounter++;
                   }
               }
               if (xcounter == 4){
                   xwin = true;
                   break;
               } else if (ocounter == 4){
                   owin = true;
                   break;
               }
               xcounter =0;
               ocounter =0;
               for (int p=0;p<4;p++){
                   if (arr[3-p][p][o] == 1){
                       xcounter++;
                   } else if (arr[3-p][p][o] == 2){
                       ocounter++;
                   }
               }
 
               if (xcounter == 4){
                   xwin = true;
                   break;
               } else if (ocounter == 4){
                   owin = true;
                   break;
               }
               xcounter =0;
               ocounter =0;
           }
               //4 diaogonals not bound to any plan
                   for (int p=0;p<4;p++){
                       if (arr[p][p][p] == 1){
                           xcounter++;
                       } else if (arr[p][p][p] == 2){
                           ocounter++;
                       }
                   }
                   if (xcounter == 4){
                       xwin = true;
                   } else if (ocounter == 4){
                       owin = true;
                   }
                   xcounter =0;
                   ocounter =0;
                   for (int p=0;p<4;p++){
                       if (arr[3-p][p][p] == 1){
                           xcounter++;
                       } else if (arr[3-p][p][p] == 2){
                           ocounter++;
                       }
                   }
  
                   if (xcounter == 4){
                       xwin = true;
                   } else if (ocounter == 4){
                       owin = true;
                   }
                   xcounter =0;
                   ocounter =0;
 
                   for (int p=0;p<4;p++){
                       if (arr[3-p][3-p][p] == 1){
                           xcounter++;
                       } else if (arr[3-p][3-p][p] == 2){
                           ocounter++;
                       }
                   }
  
                   if (xcounter == 4){
                       xwin = true;
                   } else if (ocounter == 4){
                       owin = true;
                   }
                   xcounter =0;
                   ocounter =0;
 
                   for (int p=0;p<4;p++){
                       if (arr[p][3-p][p] == 1){
                           xcounter++;
                       } else if (arr[p][3-p][p] == 2){
                           ocounter++;
                       }
                   }
  
                   if (xcounter == 4){
                       xwin = true;
                   } else if (ocounter == 4){
                       owin = true;
                   }
                   xcounter =0;
                   ocounter =0;
            //determining part
           if (xwin == true){
               return 1;
           } else if (owin == true){
               return 2;
           } else {
               return 0;
           }
          
       }
   }

    // display current table with 4 windows from the top down perspective
   public static void displayTable (int [][][]arr){
       for (int o = 0; o<4; o++){
           for (int i = 0; i<14; i++){
               System.out.print("_");
           }
           if (o<3){
               System.out.print("     ");
           }     
       } 
       System.out.println("");
       for (int p = 0; p<4; p++){
           for (int i = 0; i<4; i++) {
               System.out.print("|");
               for (int o = 0; o<4; o++){
                   if (arr [o][i][p]==0){
                       System.out.print("[ ]");
                   } else if (arr [o][i][p]== 1){
                       System.out.print("[X]");
                   } else {
                       System.out.print("[O]");
                   }
               }
               System.out.print("|");
               if (i<3) {
                   System.out.print("     ");
               }
           }
           System.out.println("");
       }
       for (int o = 0; o<4; o++){
           for (int i = 0; i<14; i++){
               System.out.print("¯");
           }
           if (o<3){
               System.out.print("     ");
           }     
       } 
       System.out.println("");
   }

   // creating array table, 0 is empty, 1 is x, 2 is 0
   public static void resetField(){
        for (int i = 0; i<4; i++){
        for (int o = 0; o<4; o++){
            for (int p = 0; p<4; p++){
                field[i][o][p] = 0;
            }
        }
    }
    
    }

 public static void main(String[] args) {
    launch(args);
    }
}
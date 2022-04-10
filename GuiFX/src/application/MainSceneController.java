package application;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class MainSceneController extends Application {
    private Stage stage;
    private Scene scene;
    private Parent root;
    public int testrun;
    public int testwins;
    public static Boolean bots = false;
    public static int botone;
    public static int bottwo;
    public static int turn;
    public static String gamemode = "";
    public static int [] dayprogress = new int [28];
    public static int [][] progress = new int [28][14];
    

    @FXML
    private Label testdenom;

    @FXML
    private Label testend;

    @FXML
    private Label testnum;

    @FXML
    private Button nxtround;

    @FXML
    private Button freeplaybtn;

    @FXML
    private Button progressbtn;

    @FXML
    private Button testmebtn;

    @FXML
    private Button tutorialbtn;

    @FXML
    private Button tutorialbackbtn;

    @FXML
    private Button hum1hum2;

    @FXML
    private Button hum1rob2;

    @FXML
    private Button rob1hum2;

    @FXML
    private Button rob1rob2;

    @FXML
    private Button bot1diff;

    @FXML
    private Button bot1easy;

    @FXML
    private Button bot1hard;

    @FXML
    private Button bot1imp;

    
    @FXML
    private Button bot2diff;

    @FXML
    private Button bot2easy;

    @FXML
    private Button bot2hard;

    @FXML
    private Button bot2imp;

    @FXML
    private Button turndisplay;


// so its between here and the next //
// initialising buttons for the game board
@FXML  private  Button square111; @FXML private  Button square112; @FXML private  Button square113; @FXML private  Button square114; @FXML private  Button square121; @FXML  private  Button square122; @FXML  private  Button square123; @FXML  private  Button square124; @FXML  private  Button square131; @FXML  private  Button square132; @FXML  private  Button square133; @FXML  private  Button square134; @FXML  private  Button square141; @FXML  private  Button square142; @FXML  private  Button square143; @FXML  private  Button square144; @FXML  private  Button square211; @FXML  private  Button square212; @FXML  private  Button square213; @FXML  private  Button square214; @FXML  private  Button square221; @FXML  private  Button square222; @FXML  private  Button square223; @FXML  private  Button square224; @FXML  private  Button square231; @FXML  private  Button square232; @FXML  private  Button square233; @FXML  private  Button square234; @FXML  private  Button square241; @FXML  private  Button square242; @FXML  private  Button square243; @FXML  private  Button square244; @FXML  private  Button square311; @FXML  private  Button square312; @FXML  private  Button square313; @FXML  private  Button square314; @FXML  private  Button square321; @FXML  private  Button square322; @FXML  private  Button square323; @FXML  private  Button square324; @FXML  private  Button square331; @FXML  private  Button square332; @FXML  private  Button square333; @FXML  private  Button square334; @FXML  private  Button square341; @FXML  private  Button square342; @FXML  private  Button square343; @FXML  private  Button square344; @FXML  private  Button square411; @FXML  private  Button square412; @FXML  private  Button square413; @FXML  private  Button square414; @FXML  private  Button square421; @FXML  private  Button square422; @FXML  private  Button square423; @FXML  private  Button square424; @FXML  private  Button square431; @FXML  private  Button square432; @FXML  private  Button square433; @FXML  private  Button square434; @FXML  private  Button square441; @FXML  private  Button square442; @FXML  private  Button square443; @FXML  private  Button square444;

    @FXML void square111Click(ActionEvent event) {square111.setText(btnToArray(1, 1, 1, turn));}
    @FXML void square112Click(ActionEvent event) {square112.setText(btnToArray(1, 1, 2, turn));}
    @FXML void square113Click(ActionEvent event) {square113.setText(btnToArray(1, 1, 3, turn));}
    @FXML void square114Click(ActionEvent event) {square114.setText(btnToArray(1, 1, 4, turn));}
    @FXML void square121Click(ActionEvent event) {square121.setText(btnToArray(1, 2, 1, turn));}
    @FXML void square122Click(ActionEvent event) {square122.setText(btnToArray(1, 2, 2, turn));}
    @FXML void square123Click(ActionEvent event) {square123.setText(btnToArray(1, 2, 3, turn));}
    @FXML void square124Click(ActionEvent event) {square124.setText(btnToArray(1, 2, 4, turn));}
    @FXML void square131Click(ActionEvent event) {square131.setText(btnToArray(1, 3, 1, turn));}
    @FXML void square132Click(ActionEvent event) {square132.setText(btnToArray(1, 3, 2, turn));}
    @FXML void square133Click(ActionEvent event) {square133.setText(btnToArray(1, 3, 3, turn));}
    @FXML void square134Click(ActionEvent event) {square134.setText(btnToArray(1, 3, 4, turn));}
    @FXML void square141Click(ActionEvent event) {square141.setText(btnToArray(1, 4, 1, turn));}
    @FXML void square142Click(ActionEvent event) {square142.setText(btnToArray(1, 4, 2, turn));}
    @FXML void square143Click(ActionEvent event) {square143.setText(btnToArray(1, 4, 3, turn));}
    @FXML void square144Click(ActionEvent event) {square144.setText(btnToArray(1, 4, 4, turn));}
    @FXML void square211Click(ActionEvent event) {square211.setText(btnToArray(2, 1, 1, turn));}
    @FXML void square212Click(ActionEvent event) {square212.setText(btnToArray(2, 1, 2, turn));}
    @FXML void square213Click(ActionEvent event) {square213.setText(btnToArray(2, 1, 3, turn));}
    @FXML void square214Click(ActionEvent event) {square214.setText(btnToArray(2, 1, 4, turn));}
    @FXML void square221Click(ActionEvent event) {square221.setText(btnToArray(2, 2, 1, turn));}
    @FXML void square222Click(ActionEvent event) {square222.setText(btnToArray(2, 2, 2, turn));}
    @FXML void square223Click(ActionEvent event) {square223.setText(btnToArray(2, 2, 3, turn));}
    @FXML void square224Clcik(ActionEvent event) {square224.setText(btnToArray(2, 2, 4, turn));}
    @FXML void square231Click(ActionEvent event) {square231.setText(btnToArray(2, 3, 1, turn));}
    @FXML void square232Click(ActionEvent event) {square232.setText(btnToArray(2, 3, 2, turn));}
    @FXML void square233Click(ActionEvent event) {square233.setText(btnToArray(2, 3, 3, turn));}
    @FXML void square234Click(ActionEvent event) {square234.setText(btnToArray(2, 3, 4, turn));}
    @FXML void square241Click(ActionEvent event) {square241.setText(btnToArray(2, 4, 1, turn));}
    @FXML void square242Click(ActionEvent event) {square242.setText(btnToArray(2, 4, 2, turn));}
    @FXML void square243Click(ActionEvent event) {square243.setText(btnToArray(2, 4, 3, turn));}
    @FXML void square244Click(ActionEvent event) {square244.setText(btnToArray(2, 4, 4, turn));}
    @FXML void square311Click(ActionEvent event) {square311.setText(btnToArray(3, 1, 1, turn));}
    @FXML void square312Click(ActionEvent event) {square312.setText(btnToArray(3, 1, 2, turn));}
    @FXML void square313Click(ActionEvent event) {square313.setText(btnToArray(3, 1, 3, turn));}
    @FXML void square314Click(ActionEvent event) {square314.setText(btnToArray(3, 1, 4, turn));}
    @FXML void square321Click(ActionEvent event) {square321.setText(btnToArray(3, 2, 1, turn));}
    @FXML void square322Click(ActionEvent event) {square322.setText(btnToArray(3, 2, 2, turn));}
    @FXML void square323Click(ActionEvent event) {square323.setText(btnToArray(3, 2, 3, turn));}
    @FXML void square324Click(ActionEvent event) {square324.setText(btnToArray(3, 2, 4, turn));}
    @FXML void square331Click(ActionEvent event) {square331.setText(btnToArray(3, 3, 1, turn));}
    @FXML void square332Click(ActionEvent event) {square332.setText(btnToArray(3, 3, 2, turn));}
    @FXML void square333Click(ActionEvent event) {square333.setText(btnToArray(3, 3, 3, turn));}
    @FXML void square334Click(ActionEvent event) {square334.setText(btnToArray(3, 3, 4, turn));}
    @FXML void square341Click(ActionEvent event) {square341.setText(btnToArray(3, 4, 1, turn));}
    @FXML void square342Click(ActionEvent event) {square342.setText(btnToArray(3, 4, 2, turn));}
    @FXML void square343Click(ActionEvent event) {square343.setText(btnToArray(3, 4, 3, turn));}
    @FXML void square344Click(ActionEvent event) {square344.setText(btnToArray(3, 4, 4, turn));}
    @FXML void square411Click(ActionEvent event) {square411.setText(btnToArray(4, 1, 1, turn));}
    @FXML void square412Click(ActionEvent event) {square412.setText(btnToArray(4, 1, 2, turn));}
    @FXML void square413Click(ActionEvent event) {square413.setText(btnToArray(4, 1, 3, turn));}
    @FXML void square414Click(ActionEvent event) {square414.setText(btnToArray(4, 1, 4, turn));}
    @FXML void square421Click(ActionEvent event) {square421.setText(btnToArray(4, 2, 1, turn));}
    @FXML void square422Click(ActionEvent event) {square422.setText(btnToArray(4, 2, 2, turn));}
    @FXML void square423Click(ActionEvent event) {square423.setText(btnToArray(4, 2, 3, turn));}
    @FXML void square424Click(ActionEvent event) {square424.setText(btnToArray(4, 2, 4, turn));}
    @FXML void square431Click(ActionEvent event) {square431.setText(btnToArray(4, 3, 1, turn));}
    @FXML void square432Click(ActionEvent event) {square432.setText(btnToArray(4, 3, 2, turn));}
    @FXML void square433Click(ActionEvent event) {square433.setText(btnToArray(4, 3, 3, turn));}
    @FXML void square434Click(ActionEvent event) {square434.setText(btnToArray(4, 3, 4, turn));}
    @FXML void square441Click(ActionEvent event) {square441.setText(btnToArray(4, 4, 1, turn));}
    @FXML void square442Click(ActionEvent event) {square442.setText(btnToArray(4, 4, 2, turn));}
    @FXML void square443Click(ActionEvent event) {square443.setText(btnToArray(4, 4, 3, turn));}
    @FXML void square444Click(ActionEvent event) {square444.setText(btnToArray(4, 4, 4, turn));}

    public static String numToString(int in){
        String output = "";
        if (in == 1){
            output = "X";
        } else if (in==2){
            output ="O";
        }
        return output;
    }
 public void refreshBtns(){
    square111.setText(numToString(App.field[0][0][0]));
    square112.setText(numToString(App.field[0][0][1]));
    square113.setText(numToString(App.field[0][0][2]));
    square114.setText(numToString(App.field[0][0][3]));
    square121.setText(numToString(App.field[0][1][0]));
    square122.setText(numToString(App.field[0][1][1]));
    square123.setText(numToString(App.field[0][1][2]));
    square124.setText(numToString(App.field[0][1][3]));
    square131.setText(numToString(App.field[0][2][0]));
    square132.setText(numToString(App.field[0][2][1]));
    square133.setText(numToString(App.field[0][2][2]));
    square134.setText(numToString(App.field[0][2][3]));
    square141.setText(numToString(App.field[0][3][0]));
    square142.setText(numToString(App.field[0][3][1]));
    square143.setText(numToString(App.field[0][3][2]));
    square144.setText(numToString(App.field[0][3][3]));
    square211.setText(numToString(App.field[1][0][0]));
    square212.setText(numToString(App.field[1][0][1]));
    square213.setText(numToString(App.field[1][0][2]));
    square214.setText(numToString(App.field[1][0][3]));
    square221.setText(numToString(App.field[1][1][0]));
    square222.setText(numToString(App.field[1][1][1]));
    square223.setText(numToString(App.field[1][1][2]));
    square224.setText(numToString(App.field[1][1][3]));
    square231.setText(numToString(App.field[1][2][0]));
    square232.setText(numToString(App.field[1][2][1]));
    square233.setText(numToString(App.field[1][2][2]));
    square234.setText(numToString(App.field[1][2][3]));
    square241.setText(numToString(App.field[1][3][0]));
    square242.setText(numToString(App.field[1][3][1]));
    square243.setText(numToString(App.field[1][3][2]));
    square244.setText(numToString(App.field[1][3][3]));
    square311.setText(numToString(App.field[2][0][0]));
    square312.setText(numToString(App.field[2][0][1]));
    square313.setText(numToString(App.field[2][0][2]));
    square314.setText(numToString(App.field[2][0][3]));
    square321.setText(numToString(App.field[2][1][0]));
    square322.setText(numToString(App.field[2][1][1]));
    square323.setText(numToString(App.field[2][1][2]));
    square324.setText(numToString(App.field[2][1][3]));
    square331.setText(numToString(App.field[2][2][0]));
    square332.setText(numToString(App.field[2][2][1]));
    square333.setText(numToString(App.field[2][2][2]));
    square334.setText(numToString(App.field[2][2][3]));
    square341.setText(numToString(App.field[2][3][0]));
    square342.setText(numToString(App.field[2][3][1]));
    square343.setText(numToString(App.field[2][3][2]));
    square344.setText(numToString(App.field[2][3][3]));
    square411.setText(numToString(App.field[3][0][0]));
    square412.setText(numToString(App.field[3][0][1]));
    square413.setText(numToString(App.field[3][0][2]));
    square414.setText(numToString(App.field[3][0][3]));
    square421.setText(numToString(App.field[3][1][0]));
    square422.setText(numToString(App.field[3][1][1]));
    square423.setText(numToString(App.field[3][1][2]));
    square424.setText(numToString(App.field[3][1][3]));
    square431.setText(numToString(App.field[3][2][0]));
    square432.setText(numToString(App.field[3][2][1]));
    square433.setText(numToString(App.field[3][2][2]));
    square434.setText(numToString(App.field[3][2][3]));
    square441.setText(numToString(App.field[3][3][0]));
    square442.setText(numToString(App.field[3][3][1]));
    square443.setText(numToString(App.field[3][3][2]));
    square444.setText(numToString(App.field[3][3][3]));
 } 
 
     @FXML 
     void nxtRound(ActionEvent event){
        

        App.resetField();
        refreshBtns();
         if (botone >0){
             turn = 2;
             nextTurn();
         } else {
             turn =1;
         }
         nxtround.setVisible(false);
         testnum.setVisible(false);
         testdenom.setVisible(false);
     }

    @FXML
    void bot2Diff(ActionEvent event) throws IOException {
        bottwo = 3; 
        root = FXMLLoader.load(getClass().getResource("GameBoard.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show(); 
    }

    @FXML
    void bot2Easy(ActionEvent event) throws IOException {
        bottwo = 1;
        root = FXMLLoader.load(getClass().getResource("GameBoard.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }

    @FXML
    void bot2Hard(ActionEvent event) throws IOException {
        bottwo = 2;
        root = FXMLLoader.load(getClass().getResource("GameBoard.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }

    @FXML
    void bot2Imp(ActionEvent event) throws IOException {
        bottwo =4;
        root = FXMLLoader.load(getClass().getResource("GameBoard.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }
    
    @FXML
    void bot1Hard(ActionEvent event) throws IOException {
       botone = 2;
        if (bots == true){
            root = FXMLLoader.load(getClass().getResource("PlayerTwoBot.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show(); 
        } else { 
            root = FXMLLoader.load(getClass().getResource("GameBoard.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

    @FXML
    void bot1Diff(ActionEvent event) throws IOException {
        botone = 3;
        if (bots == true){
            root = FXMLLoader.load(getClass().getResource("PlayerTwoBot.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show(); 
        } else {
            root = FXMLLoader.load(getClass().getResource("GameBoard.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

    @FXML
    void bot1Easy(ActionEvent event) throws IOException {
        botone = 1;
        if (bots == true){
            root = FXMLLoader.load(getClass().getResource("PlayerTwoBot.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show(); 
        } else {
            root = FXMLLoader.load(getClass().getResource("GameBoard.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show(); 
        }
    }

    @FXML
    void bot1Imp(ActionEvent event) throws IOException {
        botone = 4;
        if (bots == true){
            root = FXMLLoader.load(getClass().getResource("PlayerTwoBot.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show(); 
        } else{
            root = FXMLLoader.load(getClass().getResource("GameBoard.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
    }

    @FXML
    void humanVsHuman(ActionEvent event) throws IOException {
        botone=0;
        bottwo=0;
            gamedefault();
            root = FXMLLoader.load(getClass().getResource("GameBoard.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show(); 
            nextTurn();

    }

    @FXML
    void humanVsRobot(ActionEvent event) throws IOException {
        gamedefault();
        root = FXMLLoader.load(getClass().getResource("PlayerTwoBot.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show(); 


    }

    @FXML
    void robotVsHuman(ActionEvent event) throws IOException {
        gamedefault();
        root = FXMLLoader.load(getClass().getResource("PlayerOneBot.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show(); 
    }

    @FXML
    void robotVsRobot(ActionEvent event) throws IOException {
        gamedefault();
        root = FXMLLoader.load(getClass().getResource("PlayerOneBot.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show(); 
        bots=true;
    }

    @FXML
    void mainMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show(); 


    }
    
    public void gamedefault(){
        App.resetField();
        bots = false;
        turn = 1;
        testrun = 0;
        testwins=0;
        botone=0;
        bottwo=0;
    }

    @FXML
    public void playSelect(ActionEvent event) throws IOException{
        gamedefault();
        gamemode = "Free play";
        root = FXMLLoader.load(getClass().getResource("PlayDemoScene.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show(); 
    }
    @FXML
    public void testMe(ActionEvent event) throws IOException {
        gamedefault();
        gamemode = "Test me";
        root = FXMLLoader.load(getClass().getResource("TestMe.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show(); 
        
    }
    @FXML
    public void testresults(){
        testend.setText("Test Results!");
        testend.setVisible(true);
        testnum.setVisible(true);
        testdenom.setVisible(true);
        if (testwins > dayprogress[27]){
            dayprogress [27] = testwins;
        }
  
    }

    @FXML
    public void progressPage(ActionEvent event) {

    }

    @FXML
    public void tutorial(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("TutorialScene.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show(); 

    }

    @Override
    public void start(Stage arg0) throws Exception {
        // TODO Auto-generated method stub
        
    }

/**************************************    AI code stuff  ************************************************************ */
/**************************************    AI code stuff  ************************************************************ */
/**************************************    AI code stuff  ************************************************************ */
/**************************************    AI code stuff  ************************************************************ */
            // easy opponent, AI that plays randomly
   public void roboTurnEasy(int [][][] arr, int side){
       Random random = new Random();
       boolean taken = true;
       int x=0;
       int y=0;
       int z=0;
       while (taken == true){
           x = random.nextInt(4)+1;
           y = random.nextInt(4)+1;
           z = random.nextInt(4)+1;
           if (arr[x-1][(y-1)][z-1] == 0){
               taken = false;
           }
       }
       botTurn(arr, side, (x), (y), (z));
   }
  
       // all the code for the difficult AI 
   // sub routine that is repeated alot in the below
   public int pointRookieAssignment (int sidecount, int notcount){
       Random random = new Random();
       int points = 0;
       if (sidecount >0){
           switch (notcount){
               case 0:
               switch (sidecount){
                   case 1:
                   points = points + random.nextInt(1500);
                   break;
                   case 2:
                   points = points + random.nextInt(1500);
                   break;
                   case 3:
                   points = points + random.nextInt(1500);
                   break;
                   case 4:
                   points = points + random.nextInt(1500);
               }
               break;
               case 1:
               if (sidecount==1){
                  points = points + random.nextInt(1200);
               }
               break;
               case 2:
              
               if (sidecount==1){
                  points = points + random.nextInt(1200);
               }
               break;
               case 3:
              
               if (sidecount==1){
                  points = points + random.nextInt(1200);
               }
               break;
 
           }
       }
       return points;
   }
 
   //difficult opponent, AI not so hard mode >:^)
  public void roboTurnRookie (int [][][] arr, int side){
      Random random = new Random();
      int x = 0; int y= 0; int z =0;
      int [] line = new int [4];
      int score=0; int point =0;
      int sidecount =0;
      int notcount =0;
      int [] observer = new int [256];
      int counter = -1;
      int holder;
      int not;
      if (side ==1){
          not =2;
      } else{
          not = 1;
      }
  
 
      for (int i=0; i<4; i++){
          for (int o=0;o<4;o++){
              for (int p=0; p<4;p++){
                  counter ++;
                  holder = arr [i][o][p];
                  if (arr[i][o][p]==0){
                      arr [i][o][p] = side;
                      for ( int j=0; j<4;j++){
                          for (int k = 0; k<4;k++){
           // straight lines
                   // across lines
                               {
                               sidecount =0;
                               notcount =0;
                              for (int b=0;b<4; b++){
                                  line[b] = arr[b][j][k];
                                  if (line [b] == side){
                                      sidecount++;
                                  } else if (line [b] == not) {
                                      notcount++;
                                  }
                              }
                              // point assignment
                              point = pointRookieAssignment(sidecount, notcount) + point;
                             }
                   // up and down lines
                               {
                                   sidecount =0;
                                   notcount =0;
                                   for (int b=0;b<4; b++){
                                       line[b] = arr[j][b][k];
                                       if (line [b] == side){
                                           sidecount++;
                                       } else if (line [b] == not) {
                                           notcount++;
                                       }
                                   }
                                   // point assignment
                                   point = pointRookieAssignment(sidecount, notcount) + point;
                               }
                   // forward and back lines
                               {
                                   sidecount =0;
                                   notcount =0;
                                   for (int b=0;b<4; b++){
                                       line[b] = arr[j][k][b];
                                       if (line [b] == side){
                                           sidecount++;
                                       } else if (line [b] == not) {
                                           notcount++;
                                       }
                                   }
                                   // point assignment
                                   point = pointRookieAssignment(sidecount, notcount) + point;
                               }
           // diagonals
                   // across x forward lines
                               {
                                   sidecount =0;
                                   notcount =0;
                                   for (int b=0;b<4; b++){
                                       line[b] = arr[b][k][b];
                                       if (line [b] == side){
                                           sidecount++;
                                       } else if (line [b] == not) {
                                           notcount++;
                                       }
                                   }
                                   // point assignment
                                   point = pointRookieAssignment(sidecount, notcount) + point;
 
                                   sidecount =0;
                                   notcount =0;
                                   for (int b=0;b<4; b++){
                                       line[b] = arr[b][k][b];
                                       if (line [b] == side){
                                           sidecount++;
                                       } else if (line [b] == not) {
                                           notcount++;
                                       }
                                   }
                                   // point assignment
                                   point = pointRookieAssignment(sidecount, notcount) + point;
                              
                               }
                   // across x upward lines
                               {
                                   sidecount =0;
                                   notcount =0;
                                   for (int b=0;b<4; b++){
                                       line[b] = arr[b][b][k];
                                       if (line [b] == side){
                                           sidecount++;
                                       } else if (line [b] == not) {
                                           notcount++;
                                       }
                                   }
                                   // point assignment
                                   point = pointRookieAssignment(sidecount, notcount) + point;
                                                          
                                   sidecount =0;
                                   notcount =0;
                                   for (int b=0;b<4; b++){
                                       line[b] = arr[b][b][k];
                                       if (line [b] == side){
                                           sidecount++;
                                       } else if (line [b] == not) {
                                           notcount++;
                                       }
                                   }
                                   // point assignment
                                   point = pointRookieAssignment(sidecount, notcount) + point;
                              
                               }
                   // forwad lines x upward lines
                               {
                                   sidecount =0;
                                   notcount =0;
                                   for (int b=0;b<4; b++){
                                       line[b] = arr[k][b][b];
                                       if (line [b] == side){
                                           sidecount++;
                                       } else if (line [b] == not) {
                                           notcount++;
                                       }
                                   }
                                   // point assignment
                                   point = pointRookieAssignment(sidecount, notcount) + point;
      
                                   sidecount =0;
                                   notcount =0;
                                   for (int b=0;b<4; b++){
                                       line[b] = arr[k][b][b];
                                       if (line [b] == side){
                                           sidecount++;
                                       } else if (line [b] == not) {
                                           notcount++;
                                       }
                                   }
                                   // point assignment
                                   point = pointRookieAssignment(sidecount, notcount) + point;
                              
                               }
           //complete diagonals (corner to corner)
                               {
                                   if ( i == (o) && p ==o){
                                           sidecount =0;
                                       notcount =0;
                                       for (int b=0;b<4; b++){
                                           line[b] = arr[b][b][b];
                                           if (line [b] == side){
                                               sidecount++;
                                           } else if (line [b] == not) {
                                               notcount++;
                                           }
                                       }
                                       // point assignment
                                       point = pointRookieAssignment(sidecount, notcount) + point;
 
                                   }
                                   if ( (i) == (o) && p ==o){
                                           sidecount =0;
                                       notcount =0;
                                       for (int b=0;b<4; b++){
                                           line[b] = arr[b][b][b];
                                           if (line [b] == side){
                                               sidecount++;
                                           } else if (line [b] == not) {
                                               notcount++;
                                           }
                                       }
                                       // point assignment
                                       point = pointRookieAssignment(sidecount, notcount) + point;
 
                                   }
                                   if ( (i) == (o) && p ==(o)){
                                           sidecount =0;
                                       notcount =0;
                                       for (int b=0;b<4; b++){
                                           line[b] = arr[b][b][b];
                                           if (line [b] == side){
                                               sidecount++;
                                           } else if (line [b] == not) {
                                               notcount++;
                                           }
                                       }
                                       // point assignment
                                       point = pointRookieAssignment(sidecount, notcount) + point;
 
                                   }
                                   if ( (i) == (o) && p ==(o)){
                                       sidecount =0;
                                   notcount =0;
                                   for (int b=0;b<4; b++){
                                       line[b] = arr[b][b][b];
                                       if (line [b] == side){
                                           sidecount++;
                                       } else if (line [b] == not) {
                                           notcount++;
                                       }
                                   }
                                   // point assignment
                                   point = pointRookieAssignment(sidecount, notcount) + point;
 
                               }
                               }
                          }
                      }
                  }
                       observer [(counter*4)] = i+1;
                       observer [(counter*4) +1] = o+1;
                       observer [(counter*4) +2] = p+1;
                       observer [(counter*4) +3] = point;
                  
                   if (point>score){
                       score = point;
                       x = i+1;
                       y = (o)+1;
                       z = p+1;
                   } else if (point == score){
                       if ((random.nextInt(2)+1) == 2 ){
                           score = point;
                           x = i+1;
                           y = (o)+1;
                           z = p+1;
                       }
                   }
                   point = 0;
                   arr [i][o][p] = holder;
              }
          }
      }

      botTurn(arr, side, x, y, z);
  }
  
// all the code for the difficult AI 
   // sub routine that is repeated alot in the below
   public int pointDifficultAssignment (int sidecount, int notcount){
       Random random = new Random();
       int points = 0;
       if (sidecount >0){
           switch (notcount){
               case 0:
               switch (sidecount){
                   case 1:
                   points = points + random.nextInt(20)+10;
                   break;
                   case 2:
                   points = points + random.nextInt(100)+50;
                   break;
                   case 3:
                   points = points + random.nextInt(750)+375;
                   break;
                   case 4:
                   points = points + random.nextInt(20000)+10000;
               }
               break;
               case 1:
               if (sidecount==1){
                  points = points + random.nextInt(10)+5;
               }
               break;
               case 2:
              
               if (sidecount==1){
                  points = points + random.nextInt(75)+37;
               }
               break;
               case 3:
              
               if (sidecount==1){
                  points = points + random.nextInt(3000) +1500;
               }
               break;
 
           }
       }
       return points;
   }
 
   //difficult opponent, AI not so hard mode >:^)
  public void roboTurnDifficult (int [][][] arr, int side){
      Random random = new Random();
      int x = 0; int y= 0; int z =0;
      int [] line = new int [4];
      int score=0; int point =0;
      int sidecount =0;
      int notcount =0;
      int [] observer = new int [256];
      int counter = -1;
      int holder;
      int not;
      if (side ==1){
          not =2;
      } else{
          not = 1;
      }
  
 
      for (int i=0; i<4; i++){
          for (int o=0;o<4;o++){
              for (int p=0; p<4;p++){
                  counter ++;
                  holder = arr [i][o][p];
                  if (arr[i][o][p]==0){
                      arr [i][o][p] = side;
                      for ( int j=0; j<4;j++){
                          for (int k = 0; k<4;k++){
           // straight lines
                   // across lines
                               {
                               sidecount =0;
                               notcount =0;
                              for (int b=0;b<4; b++){
                                  line[b] = arr[b][j][k];
                                  if (line [b] == side){
                                      sidecount++;
                                  } else if (line [b] == not) {
                                      notcount++;
                                  }
                              }
                              // point assignment
                              point = pointDifficultAssignment(sidecount, notcount) + point;
                             }
                   // up and down lines
                               {
                                   sidecount =0;
                                   notcount =0;
                                   for (int b=0;b<4; b++){
                                       line[b] = arr[j][b][k];
                                       if (line [b] == side){
                                           sidecount++;
                                       } else if (line [b] == not) {
                                           notcount++;
                                       }
                                   }
                                   // point assignment
                                   point = pointDifficultAssignment(sidecount, notcount) + point;
                               }
                   // forward and back lines
                               {
                                   sidecount =0;
                                   notcount =0;
                                   for (int b=0;b<4; b++){
                                       line[b] = arr[j][k][b];
                                       if (line [b] == side){
                                           sidecount++;
                                       } else if (line [b] == not) {
                                           notcount++;
                                       }
                                   }
                                   // point assignment
                                   point = pointDifficultAssignment(sidecount, notcount) + point;
                               }
           // diagonals
                   // across x forward lines
                               {
                                   sidecount =0;
                                   notcount =0;
                                   for (int b=0;b<4; b++){
                                       line[b] = arr[b][k][b];
                                       if (line [b] == side){
                                           sidecount++;
                                       } else if (line [b] == not) {
                                           notcount++;
                                       }
                                   }
                                   // point assignment
                                   point = pointDifficultAssignment(sidecount, notcount) + point;
 
                                   sidecount =0;
                                   notcount =0;
                                   for (int b=0;b<4; b++){
                                       line[b] = arr[b][k][b];
                                       if (line [b] == side){
                                           sidecount++;
                                       } else if (line [b] == not) {
                                           notcount++;
                                       }
                                   }
                                   // point assignment
                                   point = pointDifficultAssignment(sidecount, notcount) + point;
                              
                               }
                   // across x upward lines
                               {
                                   sidecount =0;
                                   notcount =0;
                                   for (int b=0;b<4; b++){
                                       line[b] = arr[b][b][k];
                                       if (line [b] == side){
                                           sidecount++;
                                       } else if (line [b] == not) {
                                           notcount++;
                                       }
                                   }
                                   // point assignment
                                   point = pointDifficultAssignment(sidecount, notcount) + point;
                                                          
                                   sidecount =0;
                                   notcount =0;
                                   for (int b=0;b<4; b++){
                                       line[b] = arr[b][b][k];
                                       if (line [b] == side){
                                           sidecount++;
                                       } else if (line [b] == not) {
                                           notcount++;
                                       }
                                   }
                                   // point assignment
                                   point = pointDifficultAssignment(sidecount, notcount) + point;
                              
                               }
                   // forwad lines x upward lines
                               {
                                   sidecount =0;
                                   notcount =0;
                                   for (int b=0;b<4; b++){
                                       line[b] = arr[k][b][b];
                                       if (line [b] == side){
                                           sidecount++;
                                       } else if (line [b] == not) {
                                           notcount++;
                                       }
                                   }
                                   // point assignment
                                   point = pointDifficultAssignment(sidecount, notcount) + point;
      
                                   sidecount =0;
                                   notcount =0;
                                   for (int b=0;b<4; b++){
                                       line[b] = arr[k][b][b];
                                       if (line [b] == side){
                                           sidecount++;
                                       } else if (line [b] == not) {
                                           notcount++;
                                       }
                                   }
                                   // point assignment
                                   point = pointDifficultAssignment(sidecount, notcount) + point;
                              
                               }
           //complete diagonals (corner to corner)
                               {
                                   if ( i == (o) && p ==o){
                                           sidecount =0;
                                       notcount =0;
                                       for (int b=0;b<4; b++){
                                           line[b] = arr[b][b][b];
                                           if (line [b] == side){
                                               sidecount++;
                                           } else if (line [b] == not) {
                                               notcount++;
                                           }
                                       }
                                       // point assignment
                                       point = pointDifficultAssignment(sidecount, notcount) + point;
 
                                   }
                                   if ( (i) == (o) && p ==o){
                                           sidecount =0;
                                       notcount =0;
                                       for (int b=0;b<4; b++){
                                           line[b] = arr[b][b][b];
                                           if (line [b] == side){
                                               sidecount++;
                                           } else if (line [b] == not) {
                                               notcount++;
                                           }
                                       }
                                       // point assignment
                                       point = pointDifficultAssignment(sidecount, notcount) + point;
 
                                   }
                                   if ( (i) == (o) && p ==(o)){
                                           sidecount =0;
                                       notcount =0;
                                       for (int b=0;b<4; b++){
                                           line[b] = arr[b][b][b];
                                           if (line [b] == side){
                                               sidecount++;
                                           } else if (line [b] == not) {
                                               notcount++;
                                           }
                                       }
                                       // point assignment
                                       point = pointDifficultAssignment(sidecount, notcount) + point;
 
                                   }
                                   if ( (i) == (o) && p ==(o)){
                                       sidecount =0;
                                   notcount =0;
                                   for (int b=0;b<4; b++){
                                       line[b] = arr[b][b][b];
                                       if (line [b] == side){
                                           sidecount++;
                                       } else if (line [b] == not) {
                                           notcount++;
                                       }
                                   }
                                   // point assignment
                                   point = pointDifficultAssignment(sidecount, notcount) + point;
 
                               }
                               }
                          }
                      }
                  }
                       observer [(counter*4)] = i+1;
                       observer [(counter*4) +1] = o+1;
                       observer [(counter*4) +2] = p+1;
                       observer [(counter*4) +3] = point;
                  
                   if (point>score){
                       score = point;
                       x = i+1;
                       y = (o)+1;
                       z = p+1;
                   } else if (point == score){
                       if ((random.nextInt(2)+1) == 2 ){
                           score = point;
                           x = i+1;
                           y = (o)+1;
                           z = p+1;
                       }
                   }
                   point = 0;
                   arr [i][o][p] = holder;
              }
          }
      }

      botTurn(arr, side, x, y, z);
  }
  
   //all code required for hard mode AI 
   // sub routine that is repeated alot in the below
   public int pointAssignment (int sidecount, int notcount){
       int points = 0;
       if (sidecount >0){
           switch (notcount){
               case 0:
               switch (sidecount){
                   case 1:
                   points = points + 20;
                   break;
                   case 2:
                   points = points + 100;
                   break;
                   case 3:
                   points = points + 750;
                   break;
                   case 4:
                   points = points + 20000;
               }
               break;
               case 1:
               if (sidecount==1){
                  points = points + 10;
               }
               break;
               case 2:
              
               if (sidecount==1){
                  points = points + 75;
               }
               break;
               case 3:
              
               if (sidecount==1){
                  points = points + 3000;
               }
               break;
 
           }
       }
       return points;
   }
 
   //difficult opponent, AI HARD MODE >:]
  public void roboTurnHard (int [][][] arr, int side){
      Random random = new Random();
      int x = 0; int y= 0; int z =0;
      int [] line = new int [4];
      int score=0; int point =0;
      int sidecount =0;
      int notcount =0;
      //int [] observer = new int [256];
      int counter = -1;
      int holder;
      int not;
      if (side ==1){
          not =2;
      } else{
          not = 1;
      }
  
 
      for (int i=0; i<4; i++){
          for (int o=0;o<4;o++){
              for (int p=0; p<4;p++){
                  counter ++;
                  holder = arr [i][o][p];
                  if (arr[i][o][p]==0){
                      arr [i][o][p] = side;
                      for ( int j=0; j<4;j++){
                          for (int k = 0; k<4;k++){
           // straight lines
                   // across lines
                               {
                               sidecount =0;
                               notcount =0;
                              for (int b=0;b<4; b++){
                                  line[b] = arr[b][j][k];
                                  if (line [b] == side){
                                      sidecount++;
                                  } else if (line [b] == not) {
                                      notcount++;
                                  }
                              }
                              // point assignment
                              point = pointAssignment(sidecount, notcount) + point;
                             }
                   // up and down lines
                               {
                                   sidecount =0;
                                   notcount =0;
                                   for (int b=0;b<4; b++){
                                       line[b] = arr[j][b][k];
                                       if (line [b] == side){
                                           sidecount++;
                                       } else if (line [b] == not) {
                                           notcount++;
                                       }
                                   }
                                   // point assignment
                                   point = pointAssignment(sidecount, notcount) + point;
                               }
                   // forward and back lines
                               {
                                   sidecount =0;
                                   notcount =0;
                                   for (int b=0;b<4; b++){
                                       line[b] = arr[j][k][b];
                                       if (line [b] == side){
                                           sidecount++;
                                       } else if (line [b] == not) {
                                           notcount++;
                                       }
                                   }
                                   // point assignment
                                   point = pointAssignment(sidecount, notcount) + point;
                               }
           // diagonals
                   // across x forward lines
                               {
                                   sidecount =0;
                                   notcount =0;
                                   for (int b=0;b<4; b++){
                                       line[b] = arr[b][k][b];
                                       if (line [b] == side){
                                           sidecount++;
                                       } else if (line [b] == not) {
                                           notcount++;
                                       }
                                   }
                                   // point assignment
                                   point = pointAssignment(sidecount, notcount) + point;
 
                                   sidecount =0;
                                   notcount =0;
                                   for (int b=0;b<4; b++){
                                       line[b] = arr[b][k][b];
                                       if (line [b] == side){
                                           sidecount++;
                                       } else if (line [b] == not) {
                                           notcount++;
                                       }
                                   }
                                   // point assignment
                                   point = pointAssignment(sidecount, notcount) + point;
                              
                               }
                   // across x upward lines
                               {
                                   sidecount =0;
                                   notcount =0;
                                   for (int b=0;b<4; b++){
                                       line[b] = arr[b][b][k];
                                       if (line [b] == side){
                                           sidecount++;
                                       } else if (line [b] == not) {
                                           notcount++;
                                       }
                                   }
                                   // point assignment
                                   point = pointAssignment(sidecount, notcount) + point;
                                                          
                                   sidecount =0;
                                   notcount =0;
                                   for (int b=0;b<4; b++){
                                       line[b] = arr[b][b][k];
                                       if (line [b] == side){
                                           sidecount++;
                                       } else if (line [b] == not) {
                                           notcount++;
                                       }
                                   }
                                   // point assignment
                                   point = pointAssignment(sidecount, notcount) + point;
                              
                               }
                   // forwad lines x upward lines
                               {
                                   sidecount =0;
                                   notcount =0;
                                   for (int b=0;b<4; b++){
                                       line[b] = arr[k][b][b];
                                       if (line [b] == side){
                                           sidecount++;
                                       } else if (line [b] == not) {
                                           notcount++;
                                       }
                                   }
                                   // point assignment
                                   point = pointAssignment(sidecount, notcount) + point;
      
                                   sidecount =0;
                                   notcount =0;
                                   for (int b=0;b<4; b++){
                                       line[b] = arr[k][b][b];
                                       if (line [b] == side){
                                           sidecount++;
                                       } else if (line [b] == not) {
                                           notcount++;
                                       }
                                   }
                                   // point assignment
                                   point = pointAssignment(sidecount, notcount) + point;
                              
                               }
           //complete diagonals (corner to corner)
                               {
                                   if ( i == (o) && p ==o){
                                           sidecount =0;
                                       notcount =0;
                                       for (int b=0;b<4; b++){
                                           line[b] = arr[b][b][b];
                                           if (line [b] == side){
                                               sidecount++;
                                           } else if (line [b] == not) {
                                               notcount++;
                                           }
                                       }
                                       // point assignment
                                       point = pointAssignment(sidecount, notcount) + point;
 
                                   }
                                   if ( (i) == (o) && p ==o){
                                           sidecount =0;
                                       notcount =0;
                                       for (int b=0;b<4; b++){
                                           line[b] = arr[b][b][b];
                                           if (line [b] == side){
                                               sidecount++;
                                           } else if (line [b] == not) {
                                               notcount++;
                                           }
                                       }
                                       // point assignment
                                       point = pointAssignment(sidecount, notcount) + point;
 
                                   }
                                   if ( (i) == (o) && p ==(o)){
                                           sidecount =0;
                                       notcount =0;
                                       for (int b=0;b<4; b++){
                                           line[b] = arr[b][b][b];
                                           if (line [b] == side){
                                               sidecount++;
                                           } else if (line [b] == not) {
                                               notcount++;
                                           }
                                       }
                                       // point assignment
                                       point = pointAssignment(sidecount, notcount) + point;
 
                                   }
                                   if ( (i) == (o) && p ==(o)){
                                       sidecount =0;
                                   notcount =0;
                                   for (int b=0;b<4; b++){
                                       line[b] = arr[b][b][b];
                                       if (line [b] == side){
                                           sidecount++;
                                       } else if (line [b] == not) {
                                           notcount++;
                                       }
                                   }
                                   // point assignment
                                   point = pointAssignment(sidecount, notcount) + point;
 
                               }
                               }
                          }
                      }
                  }

                   if (point>score){
                       score = point;
                       x = i+1;
                       y = (o)+1;
                       z = p+1;
                   } else if (point == score){
                       if ((random.nextInt(2)+1) == 2 ){
                           score = point;
                           x = i+1;
                           y = (o)+1;
                           z = p+1;
                       }
                   }
                   point = 0;
                   arr [i][o][p] = holder;
              }
          }
      }

      botTurn(arr, side, x, y, z);
  }
     
 public void botTurn(int [][][] arr, int side, int x, int y, int z ){
     arr[x-1][y-1][z-1] = side;
     System.out.println("coordinates X: "+x+" Y:"+y+" Z:"+z);
         
     refreshBtns();
     nextTurn();
 }

   public  void botPlay(){
     if(turn==1){
       switch (botone){
          case 1:
          roboTurnEasy(App.field, 1);
          break;
          case 2:
          roboTurnRookie(App.field,1);
          break;
          case 3:
          roboTurnDifficult(App.field,1);
          break;
          case 4:
          roboTurnHard(App.field, 1);
          break;

      }
     }
     if(turn==2){
      switch (bottwo){
          case 1:
          roboTurnEasy(App.field, 2);
          break;
          case 2:
          roboTurnRookie(App.field,2);
          break;
          case 3:
          roboTurnDifficult(App.field,2);
          break;
          case 4:
          roboTurnHard(App.field, 2);
          break;
         }
    }
   }
   
/***********************************    algorithm stuff    ****************************************************** */
/***********************************    algorithm stuff    ****************************************************** */
/***********************************    algorithm stuff    ****************************************************** */
/***********************************    algorithm stuff    ****************************************************** */
 public  String btnToArray(int x, int y, int z, int side){
    String play="";
    if (App.field[x-1][y-1][z-1]==0 && App.gameCondition(App.field)==0){
        App.field [x-1][y-1][z-1] = side;
                if (turn == 1){
                play = "X";
            } else if (turn == 2){
                play="O";
            }
        nextTurn();
    }else if (App.field[x-1][y-1][z-1]==1){
        play ="X";
    } else if (App.field[x-1][y-1][z-1]==2){
        play = "O";
    }
    System.out.println(App.gameCondition(App.field));
    return play;
 }

 public void nextTurn(){
    if (bots==true){

    } 
    switch(App.gameCondition(App.field)){
         case 0:
        if (turn == 1){
            turn = 2;
            turndisplay.setText("O Player's Turn");
            if (bottwo > 0){
                botPlay();
            }
        } else if (turn == 2) {
            turn =1;
            turndisplay.setText("X Player's Turn");
                    if (botone > 0){
                botPlay();
            }
        }
        break;
        case 1:
        turndisplay.setText("X Player Wins!");
        endOfGame();
        break;
        case 2:
        turndisplay.setText("O Player Wins!");
        endOfGame();
        break;
        case 3:
        turndisplay.setText("Draw! No Winners");
        endOfGame();
        break;
     }
 }

public void endOfGame(){
   if (bots==false && ((botone > 0)||(bottwo>0))){
        switch (gamemode){
            case "Free play":
            switch (App.gameCondition(App.field)){
                case 1:
                if (botone>0){
                    dayprogress [16+bottwo]= (dayprogress [16+bottwo]+1);
                    dayprogress [20+bottwo] = (((dayprogress [12+bottwo])/(dayprogress [16+bottwo]+dayprogress [12+bottwo]))*100);
                    dayprogress [26] = ((dayprogress[21]+dayprogress[22]+dayprogress[23]+dayprogress[24])/4);
                }else if (bottwo>0){
                    dayprogress [bottwo]= (dayprogress [bottwo]+1);
                    dayprogress [8+bottwo] = (((dayprogress [bottwo])/(dayprogress [4+bottwo]+dayprogress [bottwo]))*100);
                    dayprogress [25] = ((dayprogress[9]+dayprogress[10]+dayprogress[11]+dayprogress[12])/4);
                    testwins++;
                }
                break;
                case 2:
                if (botone>0){
                    dayprogress [12+bottwo]= (dayprogress [12+bottwo]+1);
                    dayprogress [20+bottwo] = (((dayprogress [12+bottwo])/(dayprogress [16+bottwo]+dayprogress [12+bottwo]))*100);
                    dayprogress [26] = ((dayprogress[21]+dayprogress[22]+dayprogress[23]+dayprogress[24])/4);
                    testwins++;
                }else if (bottwo>0){
                    dayprogress [4+bottwo]= (dayprogress [4+bottwo]+1);
                    dayprogress [8+bottwo] = (((dayprogress [bottwo])/(dayprogress [4+bottwo]+dayprogress [bottwo]))*100);
                    dayprogress [25] = ((dayprogress[9]+dayprogress[10]+dayprogress[11]+dayprogress[12])/4);
                }
                break;
                case 3:
                if (botone>0){
                    dayprogress [16+bottwo]= (dayprogress [16+bottwo]+1);
                    dayprogress [20+bottwo] = (((dayprogress [12+bottwo])/(dayprogress [16+bottwo]+dayprogress [12+bottwo]))*100);
                    dayprogress [26] = ((dayprogress[21]+dayprogress[22]+dayprogress[23]+dayprogress[24])/4);
                }else if (bottwo>0){
                    dayprogress [4+bottwo]= (dayprogress [4+bottwo]+1);
                    dayprogress [8+bottwo] = (((dayprogress [bottwo])/(dayprogress [4+bottwo]+dayprogress [bottwo]))*100);
                    dayprogress [25] = ((dayprogress[9]+dayprogress[10]+dayprogress[11]+dayprogress[12])/4);
                }
                break;
            }
            break;
            case "Test me":
            switch (App.gameCondition(App.field)){
                case 1:
                if (botone>0){
                    dayprogress [16+bottwo]= (dayprogress [16+bottwo]+1);
                    dayprogress [20+bottwo] = (((dayprogress [12+bottwo])/(dayprogress [16+bottwo]+dayprogress [12+bottwo]))*100);
                    dayprogress [26] = ((dayprogress[21]+dayprogress[22]+dayprogress[23]+dayprogress[24])/4);
                }else if (bottwo>0){
                    dayprogress [bottwo]= (dayprogress [bottwo]+1);
                    dayprogress [8+bottwo] = (((dayprogress [bottwo])/(dayprogress [4+bottwo]+dayprogress [bottwo]))*100);
                    dayprogress [25] = ((dayprogress[9]+dayprogress[10]+dayprogress[11]+dayprogress[12])/4);
                    testwins++;
                }
                break;
                case 2:
                if (botone>0){
                    dayprogress [12+bottwo]= (dayprogress [12+bottwo]+1);
                    dayprogress [20+bottwo] = (((dayprogress [12+bottwo])/(dayprogress [16+bottwo]+dayprogress [12+bottwo]))*100);
                    dayprogress [26] = ((dayprogress[21]+dayprogress[22]+dayprogress[23]+dayprogress[24])/4);
                    testwins++;
                }else if (bottwo>0){
                    dayprogress [4+bottwo]= (dayprogress [4+bottwo]+1);
                    dayprogress [8+bottwo] = (((dayprogress [bottwo])/(dayprogress [4+bottwo]+dayprogress [bottwo]))*100);
                    dayprogress [25] = ((dayprogress[9]+dayprogress[10]+dayprogress[11]+dayprogress[12])/4);
                }
                break;
                case 3:
                if (botone>0){
                    dayprogress [16+bottwo]= (dayprogress [16+bottwo]+1);
                    dayprogress [20+bottwo] = (((dayprogress [12+bottwo])/(dayprogress [16+bottwo]+dayprogress [12+bottwo]))*100);
                    dayprogress [26] = ((dayprogress[21]+dayprogress[22]+dayprogress[23]+dayprogress[24])/4);
                }else if (bottwo>0){
                    dayprogress [4+bottwo]= (dayprogress [4+bottwo]+1);
                    dayprogress [8+bottwo] = (((dayprogress [bottwo])/(dayprogress [4+bottwo]+dayprogress [bottwo]))*100);
                    dayprogress [25] = ((dayprogress[9]+dayprogress[10]+dayprogress[11]+dayprogress[12])/4);
                }
                break;
    
            }
            testrun++;
            if(testrun >=10){
                testdenom.setText(String.valueOf(testrun));
                testnum.setText(String.valueOf(testwins));
                testresults();
            } else {
                testend.setText((10-testrun)+" More Rounds");
                nxtround.setText("Next Round");
                nxtround.setVisible(true);
                testdenom.setVisible(true);
                testnum.setVisible(true);
                testdenom.setText(String.valueOf(testrun));
                testnum.setText(String.valueOf(testwins));
            }
            break;
        }
    }
}
 

}


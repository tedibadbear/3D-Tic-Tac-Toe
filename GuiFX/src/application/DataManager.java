package application;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;

public class DataManager{
    public static int [][] stats = new int [28][14];
    public static String filepath = "storage.txt";
    public static String tempfile = "temp.txt";
    private static Scanner sc;


    public static void saveTheDay (int p1wineasy, int p1winhard, int p1windiff, int p1winimp, int p1losseasy, int p1losshard, int p1lossdiff, int p1lossimp, int p1rateeasy, int p1ratehard, int p1ratediff, int p1rateimp, int p2wineasy, int p2winhard, int p2windiff, int p2winimp, int p2losseasy, int p2losshard, int p2lossdiff, int p2lossimp, int p2rateeasy, int p2ratehard, int p2ratediff, int p2rateimp, int p1winrate, int p2winrate, int testscore ){
        File newFile = new File(tempfile);
        File oldFile = new File(filepath);
// this is will be the variables for the 28 different slots as strings, conversion will happen later
//or the "integer.parselnt();" function will be used to turn the string into an integer ( the s indicates that its a string)

        String sday =       ""; String sp1wineasy = ""; String sp1winhard = ""; String sp1windiff = ""; 
        String sp1winimp =  ""; String sp1losseasy =""; String sp1losshard =""; String sp1lossdiff =""; 
        String sp1lossimp = ""; String sp1rateeasy =""; String sp1ratehard =""; String sp1ratediff =""; 
        String sp1rateimp = ""; String sp2wineasy = ""; String sp2winhard = ""; String sp2windiff = ""; 
        String sp2winimp =  ""; String sp2losseasy =""; String sp2losshard =""; String sp2lossdiff =""; 
        String sp2lossimp = ""; String sp2rateeasy =""; String sp2ratehard =""; String sp2ratediff =""; 
        String sp2rateimp = ""; String sp1rate = ""; String sp2rate = ""; String stestscore = "";


        try{
            FileWriter fw = new FileWriter(tempfile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            sc = new Scanner(new File(filepath));
            sc.useDelimiter("[,\n]");

            for (int limiter = 1; limiter <14; limiter++) {
                sday =       "";
                sp1wineasy = sc.next();
                sp1winhard = sc.next();
                sp1windiff = sc.next();
                sp1winimp =  sc.next();
                sp1losseasy =sc.next();
                sp1losshard =sc.next();
                sp1lossdiff =sc.next();
                sp1lossimp = sc.next();
                sp1rateeasy =sc.next();
                sp1ratehard =sc.next();
                sp1ratediff =sc.next();
                sp1rateimp = sc.next();
                sp2wineasy = sc.next();
                sp2winhard = sc.next();
                sp2windiff = sc.next();
                sp2winimp =  sc.next();
                sp2losseasy =sc.next();
                sp2losshard =sc.next();
                sp2lossdiff =sc.next();
                sp2lossimp = sc.next();
                sp2rateeasy =sc.next();
                sp2ratehard =sc.next();
                sp2ratediff =sc.next();
                sp2rateimp = sc.next();
                sp1rate = sc.next();
                sp2rate = sc.next();
                stestscore = sc.next();

                if (sday.equals("1")){
                    pw.println(sday+ ","+String.valueOf(p1wineasy)+","+String.valueOf(p1winhard)+","+String.valueOf(p1windiff)+","+String.valueOf(p1winimp)+","+String.valueOf(p1losseasy)+","+String.valueOf(p1losshard)+","+String.valueOf(p1lossdiff)+","+String.valueOf(p1lossimp)+","+String.valueOf(p1rateeasy)+","+String.valueOf(p1ratehard)+","+String.valueOf(p1ratediff)+","+String.valueOf(p1rateimp)+","+String.valueOf(p2wineasy)+","+String.valueOf(p2winhard)+","+String.valueOf(p2windiff)+","+String.valueOf(p2winimp)+","+String.valueOf(p2losseasy)+","+String.valueOf(p2losshard)+","+String.valueOf(p2lossdiff)+","+String.valueOf(p2lossimp)+","+String.valueOf(p2rateeasy)+","+String.valueOf(p2ratehard)+","+String.valueOf(p2ratediff)+","+String.valueOf(p2rateimp)+","+String.valueOf(p1winrate)+","+String.valueOf(p2winrate)+","+String.valueOf(testscore)+",");
                }
                pw.println(limiter+ ","+(sp1wineasy)+","+(sp1winhard)+","+(sp1windiff)+","+(sp1winimp)+","+(sp1losseasy)+","+(sp1losshard)+","+(sp1lossdiff)+","+(sp1lossimp)+","+(sp1rateeasy)+","+(sp1ratehard)+","+(sp1ratediff)+","+(sp1rateimp)+","+(sp2wineasy)+","+(sp2winhard)+","+(sp2windiff)+","+(sp2winimp)+","+(sp2losseasy)+","+(sp2losshard)+","+(sp2lossdiff)+","+(sp2lossimp)+","+(sp2rateeasy)+","+(sp2ratehard)+","+(sp2ratediff)+","+(sp2rateimp)+","+(sp1rate)+","+(sp2rate)+","+(stestscore)+",");
            }
            sc.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File storage = new File(filepath);
            newFile.renameTo(storage);
    
        } catch (Exception e){System.out.println("Error with saving file");}

    }

     // run this if the storage file is delted to quickly set up the format
      public static void blankStorage(){
        try {
            FileWriter output = new FileWriter(filepath);
            output.write(dayToRow(0)+"\r\n");
            output.close();
            for (int weeks = 0; weeks < 13; weeks++){
            output = new FileWriter(filepath, true);
            output.write(dayToRow(weeks)+"\r\n");
            output.close();
            }
        } catch (IOException ex){
            System.out.println("with creating first storage");
        }
    }
        public static String dayToRow(int day){
        String dayswork = "";
        String adding = "";
        for (int i =0; i <28;i++){
            adding = String.valueOf(stats[i][day])+",";
            dayswork = dayswork.concat(adding);
        }
        return dayswork;
    }

}

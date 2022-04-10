package application;
import java.io.FileReader;
import java.io.IOException;

public class LoadData {
/***********************************    loading stats    ****************************************************** */
/***********************************    loading stats    ****************************************************** */
/***********************************    loading stats    ****************************************************** */
/***********************************    loading stats    ****************************************************** */

    public static void main(String[] args){
        char [] data = new char [100];

        try{
        FileReader input = new FileReader(DataManager.filepath);
        input.read(data);
        System.out.println("data retrieved");
        System.out.println(data);
        input.close();
        }catch (IOException ex) {
            System.out.println("Cant find file ;(");
        }
    }

/***********************************    loading gameboards    ****************************************************** */
/***********************************    loading gameboards    ****************************************************** */
/***********************************    loading gameboards    ****************************************************** */
/***********************************    loading gameboards    ****************************************************** */

}

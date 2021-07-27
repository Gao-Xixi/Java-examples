import java.io.*;
public class Pond implements Serializable{
    private Duck duck = new Duck();

    public static void main(String[] args) {
        Pond myPond = new Pond();
        try{
            FileOutputStream fs = new FileOutputStream("foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(myPond);
            os.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

/**
 * instance valuable,object should implements Serializable
 * or catch Exception
 */
class Duck{

}
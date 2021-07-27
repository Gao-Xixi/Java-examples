import java.io.*;
public class ReadAFile {
    public static void main(String[] args) {

        try{
            File myfile = new File("Foo.txt");
            FileReader fileReader = new FileReader(myfile);

            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;

            while((line = reader.readLine())!= null){
                System.out.println(line);
            }
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

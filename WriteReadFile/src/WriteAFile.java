import java.io.*;
public class WriteAFile {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("Foo.txt");
            writer.write("Hello foo!");
            writer.close();
        }catch(IOException e){
            e.printStackTrace();

        }
//        File f = new File("Mycode.txt");
//        f.mkdir();
//        if (f.isDirectory()) {
//            String[] dirContents = f.list();
//            for (int i = 0; i < dirContents.length; i++) {
//                System.out.println(dirContents[i]); }
//
//            System.out.println(f.getAbsolutePath());
//            boolean isDeleted = f.delete();
    }
}

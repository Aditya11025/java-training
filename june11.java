import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class june11 {
    public static void main(String[] args) {
        try{
            File file= new File("new txt");
            if(file.createNewFile()){
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
               }
               catch(IOException e){
                System.out.println("An error occurred while creating the file.");
             }
    try{
    FileWriter writer=new FileWriter("new txt");
     writer.write("Hello, this is a test file.");
     writer.close();
       }
    catch(IOException e){
        System.out.println("An error occurred while writing to the file.");
    }
    try{
        File file=new File("new txt");
        Scanner scanner=new Scanner(file);
        while(scanner.hasNextLine()){
            String line=scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();

    }
    catch(IOException e){
        System.out.println("An error occurred while reading the file.");
    }
    try{
        File file=new File("new txt");
        if(file.delete()){
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
    catch(Exception e){
        System.out.println("An error occurred while deleting the file.");
    }
}
}

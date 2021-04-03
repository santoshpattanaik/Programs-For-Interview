package allprogram.Strings;

import java.io.*;

public class AppendStringToExistingTextFile {
    public static void main(String[] args) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter("test.txt"));
        out.write("Mine.Alfa.Hello World\n");
        out.close();

//
//        BufferedReader in = new BufferedReader(new FileReader("test.txt"));
//        while (in.readLine() != null){
//            System.out.println(in.readLine());
//        }
//        in.close();

        BufferedWriter outAppend = new BufferedWriter(new FileWriter("test.txt",true));
        outAppend.write(" France\n");
        outAppend.close();


        BufferedReader inAppend = new BufferedReader(new FileReader("test.txt"));
        while (inAppend.readLine() != null){
            System.out.println(inAppend.readLine());
        }
        inAppend.close();

    }
}

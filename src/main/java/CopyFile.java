import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        //create a copy of a file
        copyFile();
    }
    private static void copyFile() {
        File ipFile = new File("C:/Users/prnkg/Downloads/java-maven-starter-kit");
        File opFile = new File("C:/Users/prnkg/Downloads/DoReMiSubscription");

        /*File[] arr = ipFile.listFiles();

        for(File f: arr) {
            System.out.println(f.getName());
        }*/

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(ipFile);
            fos = new FileOutputStream(opFile);
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(fis.available());
        } catch(IOException e) {
            e.printStackTrace();
        }

        int i=0;
        try {
            while((i=fis.read()) != -1) {
                fos.write(i);
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fis != null)
                    fis.close();
                if(fos != null)
                    fos.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}

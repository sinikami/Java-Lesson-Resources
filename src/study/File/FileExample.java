package study.File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.GregorianCalendar;

/**
 * Created by ikocos on 04/03/2017.
 */
public class FileExample {
    public static void main(String[] args) {
        File arr[] = new File(".").listFiles();

        for (File f : arr) {
            String name = f.getName();
            if (f.isFile()) {
                System.out.printf("%-25s %7d ", name, f.length());

            } else {
                System.out.printf("%-25s   <DIR> ", name);
            }
            long time = f.lastModified();
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(time);
            System.out.printf("%1$tF %1$tT %n", gregorianCalendar);
        }


        FileWriter fileWriter = null;
        try

        {
            File file = File.createTempFile("tmp_", "txt");
            //file.deleteOnExit();
            fileWriter = new FileWriter(file);
            fileWriter.write('J');
            fileWriter.write('A');
            fileWriter.write('V');
            fileWriter.write('A');
        } catch (
                IOException e)

        {
            System.out.println(e.getMessage());
        } finally

        {

            try {
                fileWriter.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}

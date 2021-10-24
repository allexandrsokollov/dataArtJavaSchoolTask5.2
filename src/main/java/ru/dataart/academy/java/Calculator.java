package ru.dataart.academy.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Calculator {
    /**
     * @param zipFilePath -  path to zip archive with text files
     * @param character   - character to find
     * @return - how many times character is in files
     */
    public Integer getNumberOfChar(String zipFilePath, char character) {

        ArrayList<StringBuilder> strings = new ArrayList<>(getStringArrListFromZip(zipFilePath));

        int counter = 0;
        char tmp;
        for (StringBuilder str: strings) {
            for (int i = 0; i < str.length(); i++) {
                 tmp = str.charAt(i);

                 if(tmp == character) {
                     counter++;
                 }
            }
        }

        return counter;
    }

    private static ArrayList<StringBuilder> getStringArrListFromZip(String filePath) {

        ArrayList<StringBuilder> dataToReturn = new ArrayList<>();

        try(ZipInputStream zin = new ZipInputStream(new FileInputStream(filePath))) {

            ZipEntry entry;
            StringBuilder temp = new StringBuilder();

            while ((entry = zin.getNextEntry()) != null) {

                int size = (int) entry.getSize();
                byte[] bytes = new byte[size];

                while (zin.read(bytes, 0, bytes.length) != -1) {
                    temp.append(new String(bytes, Charset.defaultCharset()));
                    System.out.println(temp);

                }

                dataToReturn.add(new StringBuilder(temp));
                temp.delete(0, temp.length());
            }

            zin.closeEntry();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataToReturn;
    }

    /**
     * @param zipFilePath - path to zip archive with text files
     * @return - max length
     */

    public Integer getMaxWordLength(String zipFilePath) {
        //Task implementation
        return 0;
    }

}

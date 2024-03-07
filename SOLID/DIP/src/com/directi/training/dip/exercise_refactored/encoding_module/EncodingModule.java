package com.directi.training.dip.exercise_refactored.encoding_module;



import com.directi.training.dip.exercise_refactored.encoding_module_client.IEncodeClient;

import java.io.*;
import java.net.URL;
import java.util.Base64;

public class EncodingModule implements IEncodeClient
{

    public void encodeWithFiles(String inputFile,String outputFile) throws IOException
    {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(
                    new FileReader(inputFile));
            writer = new BufferedWriter(
                    new FileWriter(outputFile));
            String aLine;
            while ((aLine = reader.readLine()) != null) {
                String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
                writer.append(encodedLine);
            }
        } finally {
            if (writer != null) {
                writer.close();
            }
            if (reader != null) {
                reader.close();
            }
        }
    }

    public void encodeBasedOnNetworkAndDatabase(IDatabase database,String protocol,String file,String host) throws IOException
    {
        URL url;
        url = new URL(protocol, host, file);
        InputStream in;
        in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString1 = new StringBuilder();
        int c;
        c = reader.read();
        while (c != -1) {
            inputString1.append((char) c);
            c = reader.read();
        }
        String inputString = inputString1.toString();
        String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
        database.write(encodedString);
    }
}
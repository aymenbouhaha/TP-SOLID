package com.directi.training.dip.exercise_refactored.encoding_module_client;

import com.directi.training.dip.exercise_refactored.encoding_module.IDatabase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public interface IEncodeClient {

    public void encodeWithFiles(String inputFile,String outputFile) throws IOException;



    public void encodeBasedOnNetworkAndDatabase(IDatabase database, String protocol, String file, String host) throws IOException;



}

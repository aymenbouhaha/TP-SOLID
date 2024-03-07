package com.directi.training.dip.exercise_refactored.encoding_module_client;


import com.directi.training.dip.exercise_refactored.database_module.MyDatabase;
import com.directi.training.dip.exercise_refactored.encoding_module.EncodingModule;

import java.io.IOException;

public class EncodingModuleClient {

    public static void main(String[] args) throws IOException
    {
        IEncodeClient encodingModule = new EncodingModule();
        encodingModule.encodeWithFiles("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt","DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        encodingModule.encodeBasedOnNetworkAndDatabase(
                new MyDatabase(),
                "http",
                "/index.html",
                "myfirstappwith.appspot.com"
        );
    }
}

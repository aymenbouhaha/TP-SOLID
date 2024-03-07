package com.directi.training.dip.exercise_refactored.database_module;

import com.directi.training.dip.exercise_refactored.encoding_module.IDatabase;

import java.util.HashMap;
import java.util.Map;

public class MyDatabase implements IDatabase
{
    private static Map<Integer, String> _data = new HashMap<>();
    private static int _count = 0;

    @Override
    public int write(String inputString)
    {
        _data.put(++_count, inputString);
        return _count;
    }
}
package com.epam.tat.encryptor.datasource.impl;


import com.epam.tat.encryptor.datasource.IDataSource;

import java.util.List;

public class FileDataSource implements IDataSource {

    private final String inputEndpoint;
    private final String outputEndpoint;

    public FileDataSource(String inputEndpoint, String outputEndpoint) {
        this.inputEndpoint = inputEndpoint;
        this.outputEndpoint = outputEndpoint;
    }

    @Override
    public void writeData(List<String> data) {
        throw new UnsupportedOperationException("You need to implement this method");
    }

    @Override
    public List<String> readData() {
        return readData(inputEndpoint);
    }

    @Override
    public List<String> readData(String path) {
        throw new UnsupportedOperationException("You need to implement this method");
    }
}

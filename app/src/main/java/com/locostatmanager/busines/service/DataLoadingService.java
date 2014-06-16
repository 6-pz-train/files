package com.locostatmanager.busines.service;

/**
 *
 * @author dmitry
 */
public interface DataLoadingService {
    
    void loadData(String fileName, byte[] file, String type, String locoId) throws Exception;
}
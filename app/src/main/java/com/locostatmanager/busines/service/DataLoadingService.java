package com.locostatmanager.busines.service;

/**
 *
 * @author dmitry
 */
public interface DataLoadingService {
    
    void loadData(byte[] file) throws Exception;
}
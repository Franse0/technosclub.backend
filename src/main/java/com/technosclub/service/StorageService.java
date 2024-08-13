package com.technosclub.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface StorageService {
    void init() throws IOException;

    String storage(MultipartFile file);
    Resource loadResource(String filname);
    void delete(String filename) throws IOException;

}

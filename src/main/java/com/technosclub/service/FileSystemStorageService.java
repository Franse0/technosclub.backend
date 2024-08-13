package com.technosclub.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

@Service
public class FileSystemStorageService implements  StorageService{
    @Value("${media.location}")
    private String mediaLocation;

    private Path rootLocation;

    @PostConstruct
    @Override
    public void init() throws IOException {
        rootLocation = Paths.get(mediaLocation);
        Files.createDirectories(rootLocation);
    }

    @Override
    public String storage(MultipartFile file) {
        try {
            if (file.isEmpty()){
                throw  new RuntimeException("Fail to storage");
            }
            String filename = file.getOriginalFilename();
            Path destinationFile = rootLocation.resolve(Paths.get(filename))
                    .normalize().toAbsolutePath();
            try (InputStream inputStream = file.getInputStream()) {
                Files.copy(inputStream, destinationFile, StandardCopyOption.REPLACE_EXISTING);

            }
            return  filename;
        } catch (IOException e){
            throw  new RuntimeException("Algo salio mal", e);
        }
    }

    @Override
    public Resource loadResource(String filname) {
        try {
            Path file = rootLocation.resolve(filname);
            Resource resource = new UrlResource((file.toUri()));
            if (resource.exists() || resource.isReadable()){
                return resource;
            } else {
                throw  new RuntimeException("no se encontro el archivo "+ filname);
            }
        } catch (MalformedURLException e){
            throw new RuntimeException("No se puede leer el archivo "+ filname);
        }
    }
    @Override
    public void delete(String filename) throws IOException {
        Path file = rootLocation.resolve(filename);
        Files.deleteIfExists(file);
    }
}

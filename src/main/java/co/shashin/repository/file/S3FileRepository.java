package co.shashin.repository.file;

import co.shashin.repository.contract.FileRepository;

import java.util.UUID;

public class S3FileRepository implements FileRepository {

    public boolean post(UUID uuid, String base64EncodedFileContents){
        return true;
    }

    public String get(UUID uuid){
        return "";
    }

}
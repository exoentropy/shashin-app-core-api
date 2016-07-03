package co.shashin.service.contract;

import co.shashin.model.ShashinFile;

import java.util.UUID;

public interface FileService {

    ShashinFile getFile(UUID uuid);
    UUID createFile(String base64EncodedStringContents);

}

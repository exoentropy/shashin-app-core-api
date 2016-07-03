package co.shashin.repository.contract;

import java.util.UUID;

public interface FileRepository {

    boolean post(UUID uuid, String base64EncodedFileContents);
    String get(UUID uuid);

}

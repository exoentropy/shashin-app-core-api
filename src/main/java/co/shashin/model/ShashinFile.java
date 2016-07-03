package co.shashin.model;

import java.util.UUID;

public class ShashinFile {

    public UUID uuid;
    public String base64EncodedFileContents;

    public ShashinFile(UUID uuid, String base64EncodedFileContents) {
        this.uuid = uuid;
        this.base64EncodedFileContents = base64EncodedFileContents;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getBase64EncodedFileContents() {
        return base64EncodedFileContents;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setBase64EncodedFileContents(String base64EncodedFileContents) {
        this.base64EncodedFileContents = base64EncodedFileContents;
    }

}

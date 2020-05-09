package narif.poc.cloudnative.model;

import java.time.LocalDateTime;

public class CommonAuditEntries {

    private final LocalDateTime createdOn;
    private final String createdBy;
    private final LocalDateTime lastUpdatedOn;
    private final String lastUpdatedBy;

    public CommonAuditEntries(String userEmail) {
        this.createdOn = LocalDateTime.now();
        this.createdBy = userEmail;
        this.lastUpdatedOn = LocalDateTime.now();
        this.lastUpdatedBy = userEmail;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public LocalDateTime getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }
}
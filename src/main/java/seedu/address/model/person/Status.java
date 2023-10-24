package seedu.address.model.person;

import java.util.Arrays;
import java.util.List;

import seedu.address.commons.util.StringUtil;

/**
 * Represents a Status in the Person class
 */
public class Status {
    public static final String MESSAGE_CONSTRAINTS = "Status should be either one of the following: 'Preliminary',"
            + "'Interviewed', 'Offered', 'Rejected'";
    public String value;
    private StatusTypes statusType;


    public Status() {
        this.statusType = StatusTypes.PRELIMINARY;
        this.value = "Preliminary";
    }

    public Status(String value) {
        this.value = value;
        switch (value.toLowerCase()) {
        case "offered":
                this.statusType = StatusTypes.OFFERED;
                break;
        case "rejected":
                this.statusType = StatusTypes.REJECTED;
                break;
        case "interviewed":
            this.statusType = StatusTypes.INTERVIEWED;
            break;
            case "preliminary":
                this.statusType = StatusTypes.PRELIMINARY;
                break;
            default:
                break;
        }
    }

    public Status(StatusTypes statusType){
        this.value = statusType.toString();
        this.statusType = statusType;
    }

    public StatusTypes getStatusType() {
        return this.statusType;
    }

    public void setStatusType(StatusTypes newStatus) {
        this.statusType = newStatus;
        this.value = newStatus.toString();
    }

    /**
     * Checks if the provided status is a valid status.
     *
     * @param status The status to be checked for validity.
     * @return {@code true} if the status is valid, {@code false} otherwise.
     */
    public static boolean isValidStatus(String status) {
        List<String> validStatus = Arrays.asList("Preliminary", "Interviewed", "Rejected", "Offered");
        return validStatus.stream()
                .anyMatch(keyword -> StringUtil.containsWordIgnoreCase(status, keyword));
    }

    @Override
    public String toString() {
        return statusType.toString();
    }
}

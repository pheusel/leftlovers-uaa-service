package dhbw.leftlovers.service.uaa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UsernameTakenException extends RuntimeException {

    public UsernameTakenException(String userId) {
        super("username " + userId + " is already assigned.");
    }
}
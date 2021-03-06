package fm.pattern.valex;

import javax.validation.ConstraintValidatorContext;

public class ValidatorSupport {

    public boolean validationFailure(ConstraintValidatorContext constraint, String message) {
        constraint.disableDefaultConstraintViolation();
        constraint.buildConstraintViolationWithTemplate(message).addConstraintViolation();
        return false;
    }

}

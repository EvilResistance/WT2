package by.bsuir.Yaskevich.Service.Validator;

/**
 * CriteriaValidator interface.
 * @author Yaskevich Anton
 */
public interface FeatureValidator {

    /**
     * Validate value of a search criteria
     *
     * @param value - value to validate
     * @return true, if value is valid. Otherwise, false.
     */
    boolean isCriteriaValid(Object value);
}

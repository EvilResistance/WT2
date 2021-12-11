package by.bsuir.Yaskevich.Service.Validator.impl;

import by.bsuir.Yaskevich.Service.Validator.FeatureValidator;

/**
 * IntValidator class.
 * @author Yaskevich Anton
 */
public class IntValidator implements FeatureValidator {

    /**
     * Method that checks valid of int.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Integer) {
            return (Integer) value > 0;
        } else {
            return false;
        }
    }

}

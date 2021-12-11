package by.bsuir.Yaskevich.Service.Validator.impl;

import by.bsuir.Yaskevich.Service.Validator.FeatureValidator;

/**
 * DoubleValidator class.
 * @author Yaskevich Anton
 */
public class DoubleValidator implements FeatureValidator {

    /**
     * Method that checks valid of double.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            return (Double) value > 0;
        } else {
            return false;
        }
    }

}

package by.bsuir.Yaskevich.Service.Validator.impl;

import by.bsuir.Yaskevich.Entity.Enums.Color;
import by.bsuir.Yaskevich.Service.Validator.FeatureValidator;

/**
 * ColorValidator class.
 * @author Yaskevich Anton
 */
public class ColorValidator implements FeatureValidator {

    /**
     * Method that checks valid of color.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            Color.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}

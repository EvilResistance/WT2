package by.bsuir.Yaskevich.Service.Validator.impl;

import by.bsuir.Yaskevich.Entity.Enums.OS;
import by.bsuir.Yaskevich.Service.Validator.FeatureValidator;

/**
 * OSValidator class.
 * @author Yaskevich Anton
 */
public class OSValidator implements FeatureValidator {

    /**
     * Method that checks valid of os.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            OS.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}

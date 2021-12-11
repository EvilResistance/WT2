package by.bsuir.Yaskevich.Service.Validator.impl;

import by.bsuir.Yaskevich.Entity.Enums.CPU;
import by.bsuir.Yaskevich.Service.Validator.FeatureValidator;

/**
 * CPUValidator class.
 * @author Yaskevich Anton
 */
public class CPUValidator implements FeatureValidator {

    /**
     * Method that checks valid of cpu.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            CPU.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}

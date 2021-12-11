package by.bsuir.Yaskevich.Service.Validator.impl;

import by.bsuir.Yaskevich.Entity.Enums.Company;
import by.bsuir.Yaskevich.Service.Validator.FeatureValidator;

/**
 * ColorValidator class.
 * @author Yaskevich Anton
 */
public class CompanyValidator implements FeatureValidator {

    /**
     * Method that checks valid of company.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            Company.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
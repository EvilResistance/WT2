package by.bsuir.Yaskevich.DAO.Factory;

import by.bsuir.Yaskevich.Common.ApplianceNameConstant;
import by.bsuir.Yaskevich.DAO.Factory.impl.LaptopFactory;
import by.bsuir.Yaskevich.DAO.Factory.impl.FridgeFactory;
import by.bsuir.Yaskevich.DAO.Factory.impl.TeapotFactory;
import by.bsuir.Yaskevich.Entity.Appliance;
import by.bsuir.Yaskevich.DAO.ExceptionMessageConstant;
import org.w3c.dom.NodeList;

/**
 * ApplianceFactory abstract class.
 *
 * @author Yaskevich Anton
 */
public abstract class ApplianceFactory {

    /**
     * Create appliance appliance.
     *
     * @param nodeList the node list
     * @return the appliance
     */
    public abstract Appliance createAppliance(NodeList nodeList);

    /**
     * Gets appliance factory.
     *
     * @param applianceName the appliance name
     * @return the appliance factory
     */
    public static ApplianceFactory getApplianceFactory(String applianceName) {
        switch (applianceName) {
            case ApplianceNameConstant.LAPTOP:
                return new LaptopFactory();
            case ApplianceNameConstant.TEAPOT:
                return new TeapotFactory();
            case ApplianceNameConstant.FRIDGE:
                return new FridgeFactory();
            default:
                throw new IllegalArgumentException(ExceptionMessageConstant.ILLEGAL_ARGUMENT_FACTORY_EXCEPTION_MSG);
        }
    }

}

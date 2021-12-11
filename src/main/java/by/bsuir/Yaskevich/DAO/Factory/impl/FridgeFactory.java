package by.bsuir.Yaskevich.DAO.Factory.impl;

import by.bsuir.Yaskevich.Entity.Appliance;
import by.bsuir.Yaskevich.Entity.Fridge;
import by.bsuir.Yaskevich.Entity.Enums.Color;
import by.bsuir.Yaskevich.Entity.Enums.Company;
import by.bsuir.Yaskevich.Entity.Feature.SearchFeature;
import by.bsuir.Yaskevich.DAO.ExceptionMessageConstant;
import by.bsuir.Yaskevich.DAO.Factory.ApplianceFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * TabletPCFactory class.
 * @author Yaskevich Anton
 */
public class FridgeFactory extends ApplianceFactory {
    /**
     * The Price field.
     */
    int price;
    /**
     * The Color field.
     */
    Color color;
    /**
     * The Company field.
     */
    Company company;


    /**
     * Method for create appliance
     *
     * @param nodeList the node list
     * @return appliance {@link Appliance}
     */
    @Override
    public Appliance createAppliance(NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodeList.item(i).getTextContent();

                SearchFeature.Fridge tabletPCSearchCriteria = SearchFeature.Fridge.valueOf(nodeList.item(i).getNodeName().toUpperCase());

                switch (tabletPCSearchCriteria) {
                    case PRICE:
                        price = Integer.parseInt(value);
                        break;
                    case COLOR:
                        color = Color.valueOf(value);
                        break;
                    case COMPANY:
                        company = Company.valueOf(value);
                        break;
                    default:
                        throw new IllegalArgumentException(ExceptionMessageConstant.ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG);
                }
            }
        }
        return new Fridge(price, color, company);
    }

}

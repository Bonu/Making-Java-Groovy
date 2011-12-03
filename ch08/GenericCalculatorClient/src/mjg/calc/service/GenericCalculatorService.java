
package mjg.calc.service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.4-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "GenericCalculatorService", targetNamespace = "http://service.calc.mjg/", wsdlLocation = "http://localhost:1234/calc?wsdl")
public class GenericCalculatorService
    extends Service
{

    private final static URL GENERICCALCULATORSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(mjg.calc.service.GenericCalculatorService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = mjg.calc.service.GenericCalculatorService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:1234/calc?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:1234/calc?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        GENERICCALCULATORSERVICE_WSDL_LOCATION = url;
    }

    public GenericCalculatorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GenericCalculatorService() {
        super(GENERICCALCULATORSERVICE_WSDL_LOCATION, new QName("http://service.calc.mjg/", "GenericCalculatorService"));
    }

    /**
     * 
     * @return
     *     returns Calculator
     */
    @WebEndpoint(name = "GenericCalculatorPort")
    public Calculator getGenericCalculatorPort() {
        return super.getPort(new QName("http://service.calc.mjg/", "GenericCalculatorPort"), Calculator.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Calculator
     */
    @WebEndpoint(name = "GenericCalculatorPort")
    public Calculator getGenericCalculatorPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.calc.mjg/", "GenericCalculatorPort"), Calculator.class, features);
    }

}
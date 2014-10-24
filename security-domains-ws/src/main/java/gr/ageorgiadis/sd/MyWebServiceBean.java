package gr.ageorgiadis.sd;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
@Stateless
public class MyWebServiceBean implements MyWebService {

    @WebMethod
    @Override
    public int operate(int a, int b) {
        return a % b;
    }
}

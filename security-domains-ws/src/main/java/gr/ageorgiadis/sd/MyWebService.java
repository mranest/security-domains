package gr.ageorgiadis.sd;

import javax.ejb.Local;

@Local
public interface MyWebService {

    int operate(int a, int b);

}

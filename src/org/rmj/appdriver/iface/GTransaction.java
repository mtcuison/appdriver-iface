/*
 * Object Name : GMasterDetailTrans
 * Author      : Marlon A. Sayson
 * Date Created: 2009-11-27
 * Purpose     : Interface class for all Transaction Type Classes
 * Modification History
 *  2009.11.27 11:04am Kalyptus
 *      Started creating this object.
 */

package org.rmj.appdriver.iface;

import java.util.ArrayList;

public interface GTransaction{
    Object newTransaction();
    Object loadTransaction(String fsTransNox);
    Object saveUpdate(Object foEntity, String fsTransNox);
    boolean deleteTransaction(String fsTransNox);
    boolean closeTransaction(String fsTransNox);
    boolean postTransaction(String fsTransNox);
    boolean voidTransaction(String fsTransNox);
    boolean cancelTransaction(String fsTransNox);

//    ArrayList searchTransaction(String fsField, String fsValue, boolean fbIsExact);
//    ArrayList searchMaster(String fsField, String fsValue, boolean fbIsExact);
//    ArrayList searchWithCondition(String fsCondition);

    String getMessage();
    void setMessage(String fsMessage);

    String getErrMsg();
    void setErrMsg(String fsErrMsg);

    void setBranch(String foBranchCD);
    void setWithParent(boolean fbWithParent);
    String getSQ_Master();
}



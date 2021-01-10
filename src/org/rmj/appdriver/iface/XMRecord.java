/*
 * Object Name : GMasterDetailTrans
 * Author      : Marlon A. Sayson
 * Date Created: 2009-11-27
 * Purpose     : Interface class for all Record/Parameter Type Classes
 * Modification History
 *  2009.11.27 11:04am Kalyptus
 *      Started creating this object.
*/

package org.rmj.appdriver.iface;

/**
 * Interface class for all Record/Parameter Type Classes
 * 
 * @author kalyptus
 */

public interface XMRecord {
    void setMaster(int fnCol, Object foData);
    void setMaster(String fsCol, Object foData);
    Object getMaster(int fnCol);
    Object getMaster(String fsCol);

    boolean newRecord();
    boolean openRecord(String fstransNox);
    boolean updateRecord();
    boolean saveRecord();
    boolean deleteRecord(String fsTransNox);
    boolean deactivateRecord(String fsTransNox);
    boolean activateRecord(String fsTransNox);

//    ArrayList searchRecord(String fsFieldNm, String fsValue, boolean fbIsExact);
//    ArrayList searchMaster(String fsFieldNm, String fsValue, boolean fbIsExact);
//    ArrayList searchWithCondition(String fsCondition);

    void setBranch(String foBranchCD);
    int getEditMode();
}

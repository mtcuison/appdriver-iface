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

public interface GRecord {
   Object newRecord();
   Object openRecord(String fstransNox);
   Object saveRecord(Object foEntity, String fsTransNox);
   boolean deleteRecord(String fsTransNox);
   boolean deactivateRecord(String fsTransNox);
   boolean activateRecord(String fsTransNox);

//    ArrayList searchRecord(String fsFieldNm, String fsValue, boolean fbIsExact);
//    ArrayList searchMaster(String fsFieldNm, String fsValue, boolean fbIsExact);
//    ArrayList searchWithCondition(String fsCondition);

   String getMessage();
   void setMessage(String fsMessage);

   String getErrMsg();
   void setErrMsg(String fsErrMsg);

   void setBranch(String foBranchCD);
   void setWithParent(boolean fbWithParent);
   String getSQ_Master();
}

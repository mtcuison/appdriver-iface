/*
 * Object Name : GMasterDetailTrans
 * Author      : Marlon A. Sayson
 * Date Created: 2009-11-27
 * Purpose     : Interface class for all Master/Detail Record Type Classes
 * Modification History
 *  2009.11.27 11:04am Kalyptus
 *      Started creating this object.
*/

package org.rmj.appdriver.iface;

public interface GMasterDetailRec extends GRecord{
    boolean addDetail();
    boolean deleteDetail(int fnEntryNox);
}

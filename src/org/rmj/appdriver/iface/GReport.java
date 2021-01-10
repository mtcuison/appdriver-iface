/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.rmj.appdriver.iface;

/**
 *
 * @author kalyptus
 */
public interface GReport {
   void setGRider(Object foRider);  //
   void hasPreview(boolean show);
   boolean getParam();              //1  
   boolean processReport();         //1
   void list();
}



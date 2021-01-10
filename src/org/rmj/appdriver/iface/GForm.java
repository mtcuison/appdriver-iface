/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rmj.appdriver.iface;

import org.json.simple.JSONObject;

/**
 *
 * @author sayso
 */
public interface GForm {
    boolean setData(JSONObject foJson);
    JSONObject getData();
    boolean showGUI();
    boolean isOkey();
    String getMessage();
}

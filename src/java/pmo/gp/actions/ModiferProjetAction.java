/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pmo.gp.actions;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author oualid
 */
@ManagedBean(name = "modpAction", eager = true)
@RequestScoped
public class ModiferProjetAction {
    public String t(){return "index";}
}

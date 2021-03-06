/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package database.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import dao.IUserDao;
import database.form.CheckAddressForm;

import po.Address;

/** 
 * MyEclipse Struts
 * Creation date: 04-03-2013
 * 
 * XDoclet definition:
 * @struts.action validate="true"
 */
public class CheckAddressAction extends Action {
	/*
	 * Generated Methods
	 */
	private IUserDao udao;
	
	
	public IUserDao getUdao() {
		return udao;
	}


	public void setUdao(IUserDao udao) {
		this.udao = udao;
	}


	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		CheckAddressForm checkAddressForm=(CheckAddressForm) form;
		String id=checkAddressForm.getId();
		System.out.println(id);
		Address address=udao.checkAddress(Integer.parseInt(id));
		request.getSession().setAttribute("addressid", id);
		request.getSession().setAttribute("editAddress", address);
		return new ActionForward("/updateAddress.jsp");
	}
}
/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package database.action;

import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import po.Credit;
import po.Order;

import dao.IUserDao;
import database.form.CheckOutForm;

/** 
 * MyEclipse Struts
 * Creation date: 04-04-2013
 * 
 * XDoclet definition:
 * @struts.action validate="true"
 */
public class CheckOutAction extends Action {
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
		CheckOutForm checkOutForm=(CheckOutForm) form;
		long cardnumber=Long.parseLong(checkOutForm.getCardnumber());
		int cvv2=Integer.parseInt(checkOutForm.getCvv2());
		Credit credit=udao.checkCredit(cardnumber);
		ArrayList orders=(ArrayList) request.getSession().getAttribute("shoppingcart");
		Iterator p=orders.iterator();
		System.out.println(orders.size());
		if(cvv2==credit.getCaredCVV2()){
			while(p.hasNext()){
				Order or=(Order)p.next();
				udao.addNewOrder(or);
				int quantity=or.getQuantity();
				int sku=or.getSku();
				udao.updateBook(sku, quantity);
			}
			request.setAttribute("failed", 0);
			return new ActionForward("/main.jsp");
		}else{
			request.setAttribute("choose", 1);
			request.setAttribute("failed", 1);
			return mapping.getInputForward();
		}
	}
}
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

/** 
 * MyEclipse Struts
 * Creation date: 04-03-2013
 * 
 * XDoclet definition:
 * @struts.action validate="true"
 */
public class DeleteCreditAction extends Action {
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
		
		String cid=request.getParameter("cid");
		System.out.println(cid);
		boolean flag=udao.deleteCredit(Long.parseLong(cid));
		if(flag!=false){
			request.setAttribute("noCredit", 1);
		}else{
			request.setAttribute("noCredit", 0);
		}
		return new ActionForward("/manageCredit.do");
	}
}
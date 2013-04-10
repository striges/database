/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package database.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import po.Book;
import po.Review;

import dao.IUserDao;

/** 
 * MyEclipse Struts
 * Creation date: 04-01-2013
 * 
 * XDoclet definition:
 * @struts.action validate="true"
 */
public class BookInformationAction extends Action {
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
		String value=request.getParameter("is");
		System.out.println(request.getParameter("is"));
		Book book=new Book();
		book=udao.queryBook(value);
		int sku=book.getBooksku();
		ArrayList review=udao.getReviewForOneBook(sku);
		request.setAttribute("search",1);
    	request.getSession().setAttribute("searchBook", book);
    	request.setAttribute("reviews",review);
		return new ActionForward("/bookInformation.jsp");
	}
}
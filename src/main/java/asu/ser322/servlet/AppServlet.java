package asu.ser322.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import asu.ser322.bo.AppBO;
import asu.ser322.model.Student;
import asu.ser322.util.AppConst;
import asu.ser322.util.AppExceptionUtil;

/**
 * Servlet implementation class AppServlet
 */
public class AppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AppServlet() {
		super();
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			// model generation from UI START
			Student stuObj = new Student();
			stuObj.setsNm(request.getParameter(AppConst.SNM));
			// model generation from UI END

			// Calling BO START
			AppBO appBo = new AppBO();
			List<Student> retStuObj = appBo.searchStu(stuObj);
			request.setAttribute(AppConst.SERCHED_STU, retStuObj);
			// Calling BO END

		} catch (AppExceptionUtil ae) {
			ae.printStackTrace();
			request.setAttribute(AppConst.APP_MSG, AppConst.SEARCH_ERR_MSG);
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute(AppConst.APP_MSG, AppConst.SEARCH_ERR_MSG);
		}
		request.getRequestDispatcher(AppConst.INDX_PG).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

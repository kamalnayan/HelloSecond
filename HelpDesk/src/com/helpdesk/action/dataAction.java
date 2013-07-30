package com.helpdesk.action;
import com.helpdesk.form.dataForm;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class dataAction extends DispatchAction {

	String target;

	public ActionForward delete(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		dataForm dform = (dataForm) form;

		int id = Integer.parseInt(request.getParameter("id"));

		String method = dform.getMethod();

		if (id <= 0)
			target = "cancel";

		else if (method.equals(""))
			target = "cancel";
		
		else {
			
			
			DataSource ds = getDataSource(request);
			
			Connection con = ds.getConnection();
			Statement st = con.createStatement();
			st.executeUpdate("delete from  emp where id='" + id + "'");
			target = "ok";
		}

		return mapping.findForward(target);
	}

	public ActionForward update(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		dataForm dform = (dataForm) form;
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");

		String method = dform.getMethod();

		if (id <= 0)
			target = "cancel";

		else if (name == "")
			target = "cancel";

		else if (method.equals(""))
			target = "cancel";
		else {
			DataSource ds = getDataSource(request);
			Connection con = ds.getConnection();
			Statement st = con.createStatement();
			st.executeUpdate("update  emp set name='" + name + "' where id="
					+ id + "");
			target = "ok";
		}

		return mapping.findForward(target);
	}

	public ActionForward insert(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		dataForm dform = (dataForm) form;
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");

		String method = dform.getMethod();

		if (id <= 0)
			target = "cancel";

		else if (name == "")
			target = "cancel";

		else if (method.equals(""))
			target = "cancel";
		else {
			DataSource ds = getDataSource(request);
			Connection con = ds.getConnection();
			Statement st = con.createStatement();
			st.executeUpdate("insert into emp values(" + id + ",'" + name
					+ "')");
			target = "ok";
		}

		return mapping.findForward(target);
	}

}

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.33
 * Generated at: 2017-08-03 07:10:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.display;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productEditAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/display/links.jsp", Long.valueOf(1501483402324L));
    _jspx_dependants.put("jar:file:/C:/Workspace-DT15-Project2/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/cars/WEB-INF/lib/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098691290000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.9.RELEASE.jar", Long.valueOf(1499962801273L));
    _jspx_dependants.put("/WEB-INF/display/adminNavBar.jsp", Long.valueOf(1501309174680L));
    _jspx_dependants.put("jar:file:/C:/Workspace-DT15-Project2/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/cars/WEB-INF/lib/spring-webmvc-4.3.9.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1496842942000L));
    _jspx_dependants.put("/WEB-INF/lib/standard-1.1.2.jar", Long.valueOf(1499962778404L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxyz_005fform_0026_005fcommandName_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxyz_005fhidden_0026_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxyz_005finput_0026_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxyz_005fradiobutton_0026_005fvalue_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxyz_005fbutton;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fxyz_005fform_0026_005fcommandName_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fxyz_005fhidden_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fxyz_005finput_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fxyz_005fradiobutton_0026_005fvalue_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fxyz_005fbutton = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxyz_005fform_0026_005fcommandName_005faction.release();
    _005fjspx_005ftagPool_005fxyz_005fhidden_0026_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fxyz_005finput_0026_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fxyz_005fradiobutton_0026_005fvalue_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fxyz_005fbutton.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("     \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("   <script src=\"https://code.jquery.com/jquery-2.2.1.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdn.datatables.net/1.10.10/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("  <link href=\"https://cdn.datatables.net/1.10.10/css/jquery.dataTables.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  \r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"container navbar navbar-inverse  navbar-fixed-top\" style=\"border-radius:10px;margin-bottom:0;padding-bottom:0px\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t<ul class=\"nav navbar-nav\" >\r\n");
      out.write("\t\t\t<li><img src=\"resources/images/users/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(".jpg\" height=\"50\"\r\n");
      out.write("\t\t\t\twidth=\"60\" class=\"img-circle\" /></li>\r\n");
      out.write("\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\tdata-toggle=\"dropdown\" href=\"#\"> Welcome ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<span\r\n");
      out.write("\t\t\t\t\tclass=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t<ul class=\"dropdown-menu\" style=\"vertical-align: middle\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Edit Profile</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Change Password</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Logout</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\tdata-toggle=\"dropdown\" href=\"#\">Products<span class=\"caret\"\r\n");
      out.write("\t\t\t\t\tstyle=\"vertical-align: middle\"></span></a>\r\n");
      out.write("\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"reqDisplayProdcutsAdmin\"><span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-list\"></span> Display All products</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"reqProductForm\">Add Product</a></li>\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\tdata-toggle=\"dropdown\" href=\"#\">Suppliers<span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"reqDisplaySuppliers\"><span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-list\"></span>Display All suppliers</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"reqAddSupplierForm\">Add Supplier</a></li>\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\tdata-toggle=\"dropdown\" href=\"#\">ProductSupplier<span\r\n");
      out.write("\t\t\t\t\tclass=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"reqDisplayXps\">Display All ProductSuppliers</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"reqAddProdSuppForm\">Add ProductSupplier</a></li>\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\tdata-toggle=\"dropdown\" href=\"#\">Users<span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"reqDisplayUsers\">Display Users</a></li>\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\t\t</ul>\t\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("<br><br><br>\r\n");
      out.write("Edit Product Page \r\n");
      if (_jspx_meth_xyz_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_xyz_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xyz:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_xyz_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fxyz_005fform_0026_005fcommandName_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_xyz_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_xyz_005fform_005f0.setParent(null);
    // /WEB-INF/display/productEditAdmin.jsp(15,0) name = commandName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xyz_005fform_005f0.setCommandName("product");
    // /WEB-INF/display/productEditAdmin.jsp(15,0) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xyz_005fform_005f0.setAction("reqSendUpdatedProductToDB");
    int[] _jspx_push_body_count_xyz_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_xyz_005fform_005f0 = _jspx_th_xyz_005fform_005f0.doStartTag();
      if (_jspx_eval_xyz_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          if (_jspx_meth_xyz_005fhidden_005f0(_jspx_th_xyz_005fform_005f0, _jspx_page_context, _jspx_push_body_count_xyz_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("<br>Product Name ");
          if (_jspx_meth_xyz_005finput_005f0(_jspx_th_xyz_005fform_005f0, _jspx_page_context, _jspx_push_body_count_xyz_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("<br>Product Description ");
          if (_jspx_meth_xyz_005finput_005f1(_jspx_th_xyz_005fform_005f0, _jspx_page_context, _jspx_push_body_count_xyz_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("<br>Product Available  True \r\n");
          if (_jspx_meth_xyz_005fradiobutton_005f0(_jspx_th_xyz_005fform_005f0, _jspx_page_context, _jspx_push_body_count_xyz_005fform_005f0))
            return true;
          out.write("  \r\n");
          out.write(" False ");
          if (_jspx_meth_xyz_005fradiobutton_005f1(_jspx_th_xyz_005fform_005f0, _jspx_page_context, _jspx_push_body_count_xyz_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("<br> ");
          if (_jspx_meth_xyz_005fbutton_005f0(_jspx_th_xyz_005fform_005f0, _jspx_page_context, _jspx_push_body_count_xyz_005fform_005f0))
            return true;
          out.write(" \r\n");
          out.write("\r\n");
          out.write("\r\n");
          int evalDoAfterBody = _jspx_th_xyz_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_xyz_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_xyz_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_xyz_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_xyz_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fxyz_005fform_0026_005fcommandName_005faction.reuse(_jspx_th_xyz_005fform_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_xyz_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_xyz_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_xyz_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xyz:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_xyz_005fhidden_005f0 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _005fjspx_005ftagPool_005fxyz_005fhidden_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_xyz_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_xyz_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_xyz_005fform_005f0);
    // /WEB-INF/display/productEditAdmin.jsp(16,0) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xyz_005fhidden_005f0.setPath("productid");
    int[] _jspx_push_body_count_xyz_005fhidden_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_xyz_005fhidden_005f0 = _jspx_th_xyz_005fhidden_005f0.doStartTag();
      if (_jspx_th_xyz_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_xyz_005fhidden_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_xyz_005fhidden_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_xyz_005fhidden_005f0.doFinally();
      _005fjspx_005ftagPool_005fxyz_005fhidden_0026_005fpath_005fnobody.reuse(_jspx_th_xyz_005fhidden_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_xyz_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_xyz_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_xyz_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xyz:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_xyz_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fxyz_005finput_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_xyz_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_xyz_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_xyz_005fform_005f0);
    // /WEB-INF/display/productEditAdmin.jsp(17,17) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xyz_005finput_005f0.setPath("productname");
    int[] _jspx_push_body_count_xyz_005finput_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_xyz_005finput_005f0 = _jspx_th_xyz_005finput_005f0.doStartTag();
      if (_jspx_th_xyz_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_xyz_005finput_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_xyz_005finput_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_xyz_005finput_005f0.doFinally();
      _005fjspx_005ftagPool_005fxyz_005finput_0026_005fpath_005fnobody.reuse(_jspx_th_xyz_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_xyz_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_xyz_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_xyz_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xyz:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_xyz_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fxyz_005finput_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_xyz_005finput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_xyz_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_xyz_005fform_005f0);
    // /WEB-INF/display/productEditAdmin.jsp(18,24) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xyz_005finput_005f1.setPath("productdesc");
    int[] _jspx_push_body_count_xyz_005finput_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_xyz_005finput_005f1 = _jspx_th_xyz_005finput_005f1.doStartTag();
      if (_jspx_th_xyz_005finput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_xyz_005finput_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_xyz_005finput_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_xyz_005finput_005f1.doFinally();
      _005fjspx_005ftagPool_005fxyz_005finput_0026_005fpath_005fnobody.reuse(_jspx_th_xyz_005finput_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_xyz_005fradiobutton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_xyz_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_xyz_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xyz:radiobutton
    org.springframework.web.servlet.tags.form.RadioButtonTag _jspx_th_xyz_005fradiobutton_005f0 = (org.springframework.web.servlet.tags.form.RadioButtonTag) _005fjspx_005ftagPool_005fxyz_005fradiobutton_0026_005fvalue_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.RadioButtonTag.class);
    _jspx_th_xyz_005fradiobutton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_xyz_005fradiobutton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_xyz_005fform_005f0);
    // /WEB-INF/display/productEditAdmin.jsp(20,0) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xyz_005fradiobutton_005f0.setPath("productavailable");
    // /WEB-INF/display/productEditAdmin.jsp(20,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xyz_005fradiobutton_005f0.setValue("true");
    int[] _jspx_push_body_count_xyz_005fradiobutton_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_xyz_005fradiobutton_005f0 = _jspx_th_xyz_005fradiobutton_005f0.doStartTag();
      if (_jspx_th_xyz_005fradiobutton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_xyz_005fradiobutton_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_xyz_005fradiobutton_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_xyz_005fradiobutton_005f0.doFinally();
      _005fjspx_005ftagPool_005fxyz_005fradiobutton_0026_005fvalue_005fpath_005fnobody.reuse(_jspx_th_xyz_005fradiobutton_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_xyz_005fradiobutton_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_xyz_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_xyz_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xyz:radiobutton
    org.springframework.web.servlet.tags.form.RadioButtonTag _jspx_th_xyz_005fradiobutton_005f1 = (org.springframework.web.servlet.tags.form.RadioButtonTag) _005fjspx_005ftagPool_005fxyz_005fradiobutton_0026_005fvalue_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.RadioButtonTag.class);
    _jspx_th_xyz_005fradiobutton_005f1.setPageContext(_jspx_page_context);
    _jspx_th_xyz_005fradiobutton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_xyz_005fform_005f0);
    // /WEB-INF/display/productEditAdmin.jsp(21,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xyz_005fradiobutton_005f1.setPath("productavailable");
    // /WEB-INF/display/productEditAdmin.jsp(21,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xyz_005fradiobutton_005f1.setValue("false");
    int[] _jspx_push_body_count_xyz_005fradiobutton_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_xyz_005fradiobutton_005f1 = _jspx_th_xyz_005fradiobutton_005f1.doStartTag();
      if (_jspx_th_xyz_005fradiobutton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_xyz_005fradiobutton_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_xyz_005fradiobutton_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_xyz_005fradiobutton_005f1.doFinally();
      _005fjspx_005ftagPool_005fxyz_005fradiobutton_0026_005fvalue_005fpath_005fnobody.reuse(_jspx_th_xyz_005fradiobutton_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_xyz_005fbutton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_xyz_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_xyz_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xyz:button
    org.springframework.web.servlet.tags.form.ButtonTag _jspx_th_xyz_005fbutton_005f0 = (org.springframework.web.servlet.tags.form.ButtonTag) _005fjspx_005ftagPool_005fxyz_005fbutton.get(org.springframework.web.servlet.tags.form.ButtonTag.class);
    _jspx_th_xyz_005fbutton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_xyz_005fbutton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_xyz_005fform_005f0);
    int[] _jspx_push_body_count_xyz_005fbutton_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_xyz_005fbutton_005f0 = _jspx_th_xyz_005fbutton_005f0.doStartTag();
      if (_jspx_eval_xyz_005fbutton_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Update Product");
          int evalDoAfterBody = _jspx_th_xyz_005fbutton_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_xyz_005fbutton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_xyz_005fbutton_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_xyz_005fbutton_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_xyz_005fbutton_005f0.doFinally();
      _005fjspx_005ftagPool_005fxyz_005fbutton.reuse(_jspx_th_xyz_005fbutton_005f0);
    }
    return false;
  }
}

package servlets;

import resources.ResourceServer;
import resources.TestResource;
import sax.ReadXMLFileSAX;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResourcesServlet extends HttpServlet {
    private ResourceServer resourceServer;

    public ResourcesServlet(ResourceServer resourceServer) {
        this.resourceServer = resourceServer;
    }
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) {
        String path = request.getParameter("path");
        TestResource testResource = (TestResource) ReadXMLFileSAX.readXML(path);
        resourceServer.setTestResource(testResource);
    }
}

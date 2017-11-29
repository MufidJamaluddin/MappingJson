/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polban.jtk.mufid.Controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mufidjamaluddin
 */
@WebServlet(name = "json", urlPatterns = {"/json"}) /* URL Controllernya */
public class JsonController extends HttpServlet
{
    
    @Override
    public void init()
    {

    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    {
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    {
      
    }
    
}


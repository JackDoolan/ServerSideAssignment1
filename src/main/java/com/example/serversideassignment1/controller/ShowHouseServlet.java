package com.example.serversideassignment1.controller;
import com.example.serversideassignment1.dao.HouseDAO;
import com.example.serversideassignment1.model.House;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ShowHouseServlet", value = "/ShowHouseServlet")
public class ShowHouseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
House h = new House(request.getParameter("address"),request.getParameter("owner"),request.getParameter("noOfBedrooms"));

    try{
        HouseDAO houseDAO = new HouseDAO() ;
        String owner = request.getParameter("owner");
        String address = request.getParameter("address");
        String numberOfBedrooms = request.getParameter("numberOfBedrooms");
        House h5 = new House(owner, address, numberOfBedrooms);
        houseDAO.houses.add(h5);


        ArrayList<House> house = HouseDAO.instance.getList();


        request.setAttribute("houses",house);
    }catch (Exception e){
        e.printStackTrace();
    }
    request.getRequestDispatcher("ListHouse.jsp").forward(request,response);
    }
}

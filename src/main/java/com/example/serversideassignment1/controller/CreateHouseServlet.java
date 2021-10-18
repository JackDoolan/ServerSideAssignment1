package com.example.serversideassignment1.controller;

import com.example.serversideassignment1.model.House;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CreateHouseServlet")
public class CreateHouseServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateHouseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }



    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        House house = new House(request.getParameter("houseOwner"), request.getParameter("houseAddress"),request.getParameter("houseNoOfBedrooms"));
        request.setAttribute("House", house);
        request.getRequestDispatcher("ShowHouse.jsp").forward(request, response);
    }

}

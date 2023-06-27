/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.leyvaraunt.controllers;

import com.leyvaraunt.models.CategoriesModel;
import com.leyvaraunt.config.Constants;
import com.leyvaraunt.entities.Categories;
import com.leyvaraunt.interfaces.EntitieInterface;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Cristhian
 */
public class CategoriesController extends ControllerAbstract {

  public CategoriesController() {
    this.setModel(new CategoriesModel());
  }

  @Override
  public void view(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Cookie[] cookies = request.getCookies();
    if (!this.isLogued(cookies)) {
      response.sendRedirect(request.getContextPath() + "/login");
      return;
    }
    try {
      ArrayList<EntitieInterface> categories = this.getModel().getAll();
      request.setAttribute("categories", categories);
      request.getRequestDispatcher("views/categories/categories.jsp").forward(request, response);
    } catch (SQLException e) {
      System.out.println("Ocurrio un error en CategoriesController: " + e.getMessage());
    }
  }

  @Override
  public void viewById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'viewById'");
  }

  @Override
  public void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Cookie[] cookies = request.getCookies();
    if (!this.isLogued(cookies)) {
      response.sendRedirect(request.getContextPath() + "/login");
      return;
    }
    Categories newCategory = new Categories();
    String errorMessage = null;
    try {
      newCategory.setName(request.getParameter("name"));
      if (this.getModel().insert(newCategory)) {
        response.sendRedirect(request.getContextPath() + "/categories");
        return;
      }
    } catch (SQLIntegrityConstraintViolationException e) {
      System.out.println("Error: " + e.getMessage());
      errorMessage = e.getMessage();
    } catch (SQLException e) {
      System.out.println(e);
      errorMessage = e.getMessage();
    }
    request.setAttribute(Constants.KEYNAME_ERROR_MESSAJE, errorMessage);
    request.setAttribute("category", newCategory);
    request.getRequestDispatcher("views/categories/newCategory.jsp").forward(request, response);
  }

  @Override
  public void createView(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    Cookie[] cookies = request.getCookies();
    if (!this.isLogued(cookies)) {
      response.sendRedirect(request.getContextPath() + "/login");
      return;
    }
    request.getRequestDispatcher("views/categories/newCategory.jsp").forward(request, response);
  }

  @Override
  public void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'update'");
  }

  @Override
  public void updateView(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'updateView'");
  }

  @Override
  public void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
  }
}

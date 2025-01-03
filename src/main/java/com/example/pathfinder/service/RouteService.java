package com.example.pathfinder.service;

import com.example.pathfinder.model.entity.Route;
import com.example.pathfinder.model.service.AddRouteServiceModel;
import com.example.pathfinder.model.service.RouteDetailsServiceModel;
import com.example.pathfinder.model.view.RouteViewModel;
import java.util.List;
import java.util.Optional;

public interface RouteService {
  List<RouteViewModel> findAllRoutes();

  Optional<Route> findRouteById(Long id);

  RouteDetailsServiceModel findRouteByIdWithCanModifyProperty(String email, Long id);

  Long addNewRoute(AddRouteServiceModel routeServiceModel);

  boolean findRouteByName(String name);

  boolean isOwner(String authorEmail, Long routeId);

  List<RouteViewModel> findAllByCategory(String category);

  RouteDetailsServiceModel findMostCommentedRoute();
}

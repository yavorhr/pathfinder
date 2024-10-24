package com.example.pathfinder.service.impl;

import com.example.pathfinder.model.service.AddRouteServiceModel;
import com.example.pathfinder.model.view.RouteDetailsViewModel;
import com.example.pathfinder.model.view.RouteViewModel;
import com.example.pathfinder.repository.RouteRepository;
import com.example.pathfinder.service.RouteService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RouteServiceImpl implements RouteService {
  private final RouteRepository routeRepository;
  private final ModelMapper modelMapper;

  public RouteServiceImpl(RouteRepository repository, ModelMapper modelMapper) {
    this.routeRepository = repository;
    this.modelMapper = modelMapper;
  }

  @Override
  public List<RouteViewModel> findAllRoutes() {
    return this.routeRepository.findAll()
            .stream()
            .map(e -> {
              RouteViewModel viewModel = this.modelMapper.map(e, RouteViewModel.class);

              viewModel.setPictureUrl(e.getPictures().isEmpty() ? "/images/pic4" : e.getPictures().stream().findAny().get().getUrl());

              return viewModel;
            })
            .collect(Collectors.toList());
  }

  @Override
  public RouteDetailsViewModel findById(Long id) {
    return routeRepository
            .findById(id)
            .map(route -> modelMapper.map(route,RouteDetailsViewModel.class))
            .orElse(null);
  }

  @Override
  public Long addNewRoute(AddRouteServiceModel routeServiceModel) {
    return null;
  }

  @Override
  public boolean findRouteByName(String name) {
    return this.routeRepository.findByName(name).isEmpty();
  }
}

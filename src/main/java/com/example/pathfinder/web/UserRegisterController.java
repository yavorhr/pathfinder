package com.example.pathfinder.web;

import com.example.pathfinder.model.binding.UserRegisterBindingModel;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/users")
public class UserRegisterController {

  @ModelAttribute
  public UserRegisterBindingModel userRegisterBindingModel() {
    return new UserRegisterBindingModel();
  }

  @GetMapping("/register")
  public String registerPage() {
    return "register";
  }

  @PostMapping("/register")
  public String registerPage(@Valid UserRegisterBindingModel userRegisterBindingModel,
                             BindingResult bindingResult,
                             RedirectAttributes redirectAttributes) {

    if (bindingResult.hasErrors() ||
    !userRegisterBindingModel.getPassword().equals(userRegisterBindingModel.getConfirmPassword())) {
      redirectAttributes
              .addFlashAttribute("userRegisterBindingModel", userRegisterBindingModel)
              .addFlashAttribute("org.springframework.validation.userRegisterBindingModel", bindingResult);

      return "redirect:/register";
    }

    return "redirect:login";
  }
}
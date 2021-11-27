package tn.essat.crudthymleaf.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import tn.essat.crudthymleaf.entity.Users;
import tn.essat.crudthymleaf.service.UserService;

import java.util.List;

@Controller
public class UserController {

    @Autowired private UserService userService;
    @GetMapping("/users")
    public String showListUser(Model m){
        List usersList=userService.getAll();
        m.addAttribute("usersList",usersList);
        return "users";
    }
    @GetMapping("/users/new")
    public String showNewForm(Model m){
        m.addAttribute("user",new Users());
        return "user_form";
    }
    @PostMapping("/users/save")
    public String saveUser(Users user, RedirectAttributes ra){
        userService.save(user);
        ra.addFlashAttribute("msg","Inserer successfult");
        return "redirect:/users";
    }

    @GetMapping("/users/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model m,RedirectAttributes ra){

         Users u=userService.getByID(id);
         m.addAttribute("user",u);
         userService.update(u);
          return "user_form";
    }

    @GetMapping("/users/delete/{id}")
    public String delete(@PathVariable("id") Long id, Model m,RedirectAttributes ra){

            userService.delete(id);
            m.addAttribute("msg","User with ID"+id+"deleted");
            return "redirect:/users";


    }


}

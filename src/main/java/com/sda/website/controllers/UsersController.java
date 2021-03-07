package com.sda.website.controllers;

import com.sda.website.services.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsersController {
    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String hello() {
        return "index.jsp";
    }

    // @RequestMapping(value = "/registration", method = RequestMethod.POST)
    // public String registerUser(@ModelAttribute("user") User user, HttpSession session) {
    //     userService.registerUser(user);
    //     session.setAttribute("user_id", user.getId());
    //     return "redirect:/tasks";
    // }

    // @RequestMapping(value = "/login", method = RequestMethod.POST)
    // public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model,
    //         HttpSession session) {
    //     boolean auth = userService.authenticateUser(email, password);
    //     if (auth) {
    //         User user = userService.findByEmail(email);
    //         session.setAttribute("user_id", user.getId());
    //         return "redirect:/tasks";
    //     } else {
    //         model.addAttribute("error", "there is an error!");
    //         return "registrationPage.jsp";
    //     }
    // }

    // @RequestMapping("/tasks")
    // public String home(@ModelAttribute("task") Task task, HttpSession session, Model model) {
    //     if (session.getAttribute("user_id") == null) {
    //         return "redirect:/";
    //     } else {
    //         Long user_id = (Long) session.getAttribute("user_id");
    //         User user = userService.findUserById(user_id);
    //         List<Task> tasks = taskService.getTasks();
    //         model.addAttribute("tasks", tasks);
    //         model.addAttribute("user", user);
    //         return "homePage.jsp";
    //     }
    // }
    
    // @RequestMapping("/tasks/new")
    // public String newtask(Model model, HttpSession session) {
    //     if (session.getAttribute("user_id") == null) {
    //         return "redirect:/";
    //     } else {
    //     List<User> users = userService.findAllUsers();
    //     model.addAttribute("users", users);
    //     return "new.jsp";
    //     }
    // }

    // @RequestMapping(value = "/create", method = RequestMethod.POST)
    // public String createn(
    // @RequestParam(value="name") String name,
    // @RequestParam(value="assignee") String assignee,
    // @RequestParam(value="priority") String priority,
    // HttpSession session) {
    //     Long user_id = (Long) session.getAttribute("user_id");
    //     User creator = userService.findUserById(user_id);
    //     taskService.createTask(name, priority, assignee, creator);
    //     return "redirect:/tasks";
    // }
    
    // @RequestMapping("/tasks/{id}")
    // public String displaytask(@PathVariable("id") Long id, Model model,HttpSession session){
    //     if (session.getAttribute("user_id") == null) {
    //         return "redirect:/";
    //     } else {
    //     Task task = taskService.findTaskById(id);
    //     Long user_id = (Long) session.getAttribute("user_id");
    //     User user = userService.findUserById(user_id);
    //     model.addAttribute("task", task);
    //     model.addAttribute("user", user);
    //     return "display.jsp";
    //     }
    // }

    // // @RequestMapping("/join/{id}")
    // // public String join(@PathVariable("id") Long id, HttpSession session) {
    // //     Long user_id = (Long) session.getAttribute("user_id");
    // //     User user = userService.findUserById(user_id);
    // //     Task event = taskService.findEventById(id);
    // //     taskService.createeventusers(event, user);
	// // 	return "redirect:/events";
	// // }
        
    // // @RequestMapping("/unjoin/{id}")
    // // public String unjoin(@PathVariable("id") Long id, HttpSession session) {
    // //     Long user_id = (Long) session.getAttribute("user_id");
    // //     User user = userService.findUserById(user_id);
    // //     Task event = taskService.findEventById(id);
    // //     taskService.removeeventusers(event, user);
	// // 	return "redirect:/events";
	// // }

    // @RequestMapping("/task/edit/{id}")
    // public String edit(@PathVariable("id") Long id, Model model,HttpSession session) {
    //     Task thisTask = taskService.findTaskById(id);
    //     if (session.getAttribute("user_id") == null) {
    //         return "redirect:/";
    //     }
    //     else if(session.getAttribute("user_id") != thisTask.getCreator().getId()){
    //         return "redirect:/tasks";
    //     }
    //     else {
    //     Task task = taskService.findTaskById(id);
    //     List<User> users = userService.findAllUsers();
    //     model.addAttribute("users", users);
    //     model.addAttribute("task", task);
    //     return "edit.jsp";
    //     }
    // }

    // @RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT)
    // public String update(@PathVariable("id") Long id,
    // @RequestParam(value="name") String name,
    // @RequestParam(value="assignee") String assignee,
    // @RequestParam(value="priority") String priority,
    // HttpSession session) {
    //     Long user_id = (Long) session.getAttribute("user_id");
    //     User user = userService.findUserById(user_id);
    //     taskService.updateTask(id,name,priority,assignee,user);
    //         return "redirect:/tasks";
    //     }

    // @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    // public String destroy(@PathVariable("id") Long id) {
    //     taskService.deleteTask(id);
    //     return "redirect:/tasks";
    // }

    // @RequestMapping("/logout")
    // public String logout(HttpSession session) {
    //     // invalidate session
    //     session.invalidate();
    //     // redirect to login page
    //     return "redirect:/";
    // }
}
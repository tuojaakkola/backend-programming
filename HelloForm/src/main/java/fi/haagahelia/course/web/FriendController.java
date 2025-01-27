package fi.haagahelia.course.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fi.haagahelia.course.domain.Friend;

@Controller
public class FriendController {

    static List<Friend> friendList = new ArrayList<>();

   
    static {
        Friend F1 = new Friend();
        F1.setFirstName("Minna");
        F1.setLastName("Pellikka");

        Friend F2 = new Friend();
        F2.setFirstName("Tanja");
        F2.setLastName("Bergius");

        Friend F3 = new Friend();
        F3.setFirstName("Jukka");
        F3.setLastName("Juslin");

        friendList.add(F1);
        friendList.add(F2);
        friendList.add(F3);
    }

    
    @GetMapping("/")
    public String showFriendList(Model model) {
        model.addAttribute("friends", friendList);
        return "MyFriends"; 
    }

    
    @GetMapping("/add")
    public String showAddFriendPage() {
        return "AddNewFriend"; 
    }

   
    @PostMapping("/add")
    public String saveNewFriend(@RequestParam String firstName, @RequestParam String lastName) {
        Friend newFriend = new Friend();
        newFriend.setFirstName(firstName);
        newFriend.setLastName(lastName);
        
        friendList.add(newFriend);  

        return "redirect:/";  
    }
}


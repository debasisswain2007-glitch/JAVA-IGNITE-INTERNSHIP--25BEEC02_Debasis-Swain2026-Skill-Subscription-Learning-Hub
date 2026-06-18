package com.skills.hub.controller;

import com.skills.hub.model.User;
import com.skills.hub.service.SubscriptionService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SubscriptionController {

    private final SubscriptionService subscriptionService;

    public SubscriptionController(SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    /**
     * Subscribe the logged-in user to a pack.
     * Example:
     * /subscribe?packId=1
     */
    @GetMapping("/subscribe")
    public String subscribe(@RequestParam Long packId,
                            HttpSession session) {

        User user = (User) session.getAttribute("loggedInUser");

        if (user == null) {
            return "redirect:/login";
        }

        subscriptionService.subscribe(user.getId(), packId);

        return "redirect:/subscriptions/" + user.getId();
    }

    /**
     * Display all subscriptions of a user.
     * Example:
     * /subscriptions/1
     */
    @GetMapping("/subscriptions/{userId}")
    public String viewSubscriptions(@PathVariable Long userId,
                                    Model model) {

        var subscriptions = subscriptionService.getUserSubscriptions(userId);

        model.addAttribute("subs", subscriptions);
        model.addAttribute("count", subscriptions.size());

        return "subscriptions";
    }

    public SubscriptionService getSubscriptionService() {
        return subscriptionService;
    }
}

   
        

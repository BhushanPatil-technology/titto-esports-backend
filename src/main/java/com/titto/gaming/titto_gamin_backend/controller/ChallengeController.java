
package com.titto.gaming.titto_gamin_backend.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@CrossOrigin(origins = "*") // Allow all origins
@RestController
@RequestMapping("/api")
public class ChallengeController {

    @GetMapping("/welcome")
    public Map<String, Object> getWelcomeContent() {
        Map<String, Object> response = new HashMap<>();
        response.put("TITTO GAMING", "Welcome to Titto Gaming!");
        response.put("description", "Ready to unleash your inner warrior? For just ₹6, you can join our Solo showdown on the Erangel map and stand a chance to win 80 times your entry fee! That is Rs.500+.");

        Map<String, String> challengeDetails = new HashMap<>();
        challengeDetails.put("type", "Solo Match");
        challengeDetails.put("fee", "₹6 Per Person");
        challengeDetails.put("map", "Erangel");
        response.put("challenge", challengeDetails);

        response.put("schedule", "Every Sunday at 12 PM. Stay tuned to our website for the latest updates. Additionally, we'll send reminders and updates directly to your WhatsApp.");
        response.put("registrationLink", "https://forms.gle/your-google-form-link");

        Map<String, String> socialMediaLinks = new HashMap<>();
        socialMediaLinks.put("youtube", "https://youtube.com/yourchannel");
        socialMediaLinks.put("instagram", "https://instagram.com/yourpage");
        socialMediaLinks.put("email", "mailto:your-email@example.com");
        socialMediaLinks.put("phone", "+91 7619138513");
        response.put("socialMedia", socialMediaLinks);

        return response;
    }

    @GetMapping("/challenge-info")
    public Map<String, String> getChallengeInfo() {
        Map<String, String> challengeInfo = new HashMap<>();
        challengeInfo.put("game", "BGMI");
        challengeInfo.put("mode", "Solo Multiplayer");
        challengeInfo.put("prize", "Win exciting rewards!");
        return challengeInfo;
    }

    @GetMapping("/social-media")
    public Map<String, String> getSocialMediaLinks() {
        Map<String, String> socialLinks = new HashMap<>();
        socialLinks.put("instagram", "https://instagram.com/yourpage");
        socialLinks.put("email", "mailto:your-email@example.com");
        socialLinks.put("phone", "+91 7619138513");
        return socialLinks;
    }
}

// package com.titto.gaming.titto_gamin_backend.controller;

// import org.springframework.web.bind.annotation.CrossOrigin;
// //import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// import java.util.Map;

// @CrossOrigin(origins = "*") // Allow all origins (temporary solution)
// @RestController
// @RequestMapping("/api")
// public class ChallengeController {
//     @GetMapping("/welcome")
//     public Map<String, Object> getWelcomeContent() {
//         return Map.of(
//             "TITTO GAMING", "Welcome to Titto Gaming!",
//             "description", "Ready to unleash your inner warrior? For just ₹6, you can join our Solo showdown on the Erangel map and stand a chance to win 80 times your entry fee! That is Rs.500+.",
//             "challenge", Map.of(
//                 "type"," "+ " Solo Match",//" "+ addedd of spacing have look on it othewise delete it
//                 "fee", " "+" ₹6 Per Person",
//                 "map", " "+" Erangel"
//             ),
//             "schedule", "Every Sunday at 12 PM. Stay tuned to our website for the latest updates. Additionally, we'll send reminders and updates directly to your WhatsApp.",
//             "registrationLink", "https://forms.gle/your-google-form-link",//add links  here
//             "socialMedia", Map.of(
//                 "youtube", "https://youtube.com/yourchannel",//channle link
//                 "instagram", "https://instagram.com/yourpage",//insta 
//                 "email", "mailto:your-email@example.com",//email
//                 "phone", "+91 7619138513"
//             )
//         );
//     }

//     @GetMapping("/challenge-info")
//     public Map<String, String> getChallengeInfo() {
//         return Map.of(
//                 "game", "BGMI",
//                 "mode", "Solo Multiplayer",
//                 "prize", "Win exciting rewards!"
//         );
//     }

//     @GetMapping("/social-media")
//     public Map<String, String> getSocialMediaLinks() {
//         return Map.of(
//                 "instagram", "https://instagram.com/yourpage",
//                 "email", "mailto:your-email@example.com",
//                 "phone", "+91 7619138513"
//         );
//     }
// }

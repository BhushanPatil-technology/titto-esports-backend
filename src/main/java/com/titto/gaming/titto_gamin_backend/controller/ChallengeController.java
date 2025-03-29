package com.titto.gaming.titto_gamin_backend.controller;

//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api")
//@CrossOrigin("*")
public class ChallengeController {
    @GetMapping("/welcome")
    public Map<String, Object> getWelcomeContent() {
        return Map.of(
            "TITTO GAMING", "Welcome to Titto Gaming!",
            "description", "Ready to unleash your inner warrior? For just ₹6, you can join our Solo showdown on the Erangel map and stand a chance to win 80 times your entry fee! That is Rs.500+.",
            "challenge", Map.of(
                "type"," "+ " Solo Match",//" "+ addedd of spacing have look on it othewise delete it
                "fee", " "+" ₹6 Per Person",
                "map", " "+" Erangel"
            ),
            "schedule", "Every Sunday at 12 PM. Stay tuned to our website for the latest updates. Additionally, we'll send reminders and updates directly to your WhatsApp.",
            "registrationLink", "https://forms.gle/your-google-form-link",//add links  here
            "socialMedia", Map.of(
                "youtube", "https://youtube.com/yourchannel",//channle link
                "instagram", "https://instagram.com/yourpage",//insta 
                "email", "mailto:your-email@example.com",//email
                "phone", "+91 7619138513"
            )
        );
    }

    @GetMapping("/challenge-info")
    public Map<String, String> getChallengeInfo() {
        return Map.of(
                "game", "BGMI",
                "mode", "Solo Multiplayer",
                "prize", "Win exciting rewards!"
        );
    }

    @GetMapping("/social-media")
    public Map<String, String> getSocialMediaLinks() {
        return Map.of(
                "instagram", "https://instagram.com/yourpage",
                "email", "mailto:your-email@example.com",
                "phone", "+91 7619138513"
        );
    }
}

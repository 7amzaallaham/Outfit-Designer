package BACKEND.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/garderobe")
@CrossOrigin(origins = "*")
public class GarderobeController {

    @GetMapping("/tshirts")
    public List<String> getTshirts() {
        return List.of(
                "assets/images/t-shirt1.jpg",
                "assets/images/t-shirt1.jpg",
                "assets/images/t-shirt2.jpg",
                "assets/images/t-shirt4.jpg"
        );
    }

    @GetMapping("/hosen")
    public List<String> getHosen() {
        return List.of(
                "assets/images/hose4.jpg",
                "assets/images/hose2.jpg",
                "assets/images/hose3.jpg",
                "assets/images/hose4.jpg"
        );
    }

    @GetMapping("/schuhe")
    public List<String> getSchuhe() {
        return List.of(
                "assets/images/shuhe1.jpg",
                "assets/images/shuhe2.jpg",
                "assets/images/shuhe4.jpg",
                "assets/images/shuhe4.jpg"
        );
    }
}
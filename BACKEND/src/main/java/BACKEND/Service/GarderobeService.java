package BACKEND.Service;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class GarderobeService {

    public List<String> getTshirts() {
        return List.of(
                "assets/images/t-shirt1.jpg",
                "assets/images/t-shirt1.jpg",
                "assets/images/t-shirt2.jpg",
                "assets/images/t-shirt4.jpg"
        );
    }

    public List<String> getHosen() {
        return List.of(
                "assets/images/hose4.jpg",
                "assets/images/hose2.jpg",
                "assets/images/hose3.jpg",
                "assets/images/hose4.jpg"
        );
    }

    public List<String> getSchuhe() {
        return List.of(
                "assets/images/shuhe1.jpg",
                "assets/images/shuhe2.jpg",
                "assets/images/shuhe4.jpg",
                "assets/images/shuhe4.jpg"
        );
    }

    public List<List<String>> getOutfits() {
        return List.of(
                List.of(
                        "assets/images/t-shirt1.jpg",
                        "assets/images/hose2.jpg",
                        "assets/images/shuhe4.jpg"
                ),
                List.of(
                        "assets/images/t-shirt2.jpg",
                        "assets/images/hose1.jpg",
                        "assets/images/shuhe4.jpg"
                )
        );
    }
}

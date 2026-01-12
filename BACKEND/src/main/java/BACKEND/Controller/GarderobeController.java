package BACKEND.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import BACKEND.Service.GarderobeService;

@RestController
@RequestMapping("/garderobe")
@CrossOrigin(origins = "*")
public class GarderobeController {

    private final GarderobeService service;

    public GarderobeController(GarderobeService service) {
        this.service = service;
    }

    @GetMapping("/tshirts")
    public List<String> getTshirts() {
        return service.getTshirts();
    }

    @GetMapping("/hosen")
    public List<String> getHosen() {
        return service.getHosen();
    }

    @GetMapping("/schuhe")
    public List<String> getSchuhe() {
        return service.getSchuhe();
    }

    @GetMapping("/outfits")
    public List<List<String>> getOutfits() {
        return service.getOutfits();
    }
}

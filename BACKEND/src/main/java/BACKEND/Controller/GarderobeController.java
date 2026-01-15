package BACKEND.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import BACKEND.Model.Hose;
import BACKEND.Model.Outfit;
import BACKEND.Model.Schuhe;
import BACKEND.Model.Tshirt;
import BACKEND.Service.GarderobeService;

@RestController
@RequestMapping("/garderobe")
@CrossOrigin(origins = "*")
public class GarderobeController {

    // Service wird benutzt
    private final GarderobeService service;

    public GarderobeController(GarderobeService service) {
        this.service = service;
    }


    @GetMapping("/outfits")
    public List<Outfit> getOutfits() {
        return service.getOutfits();
    }

    @GetMapping("/tshirts")
    public List<Tshirt> getTshirts() {
        return service.getTshirts();
    }

    @GetMapping("/hosen")
    public List<Hose> getHosen() {
        return service.getHosen();
    }

    @GetMapping("/schuhe")
    public List<Schuhe> getSchuhe() {
        return service.getSchuhe();
    }
}

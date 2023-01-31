package Young_developer.Transport_licence_system.Controller;

import Young_developer.Transport_licence_system.Model.Renewal;
import Young_developer.Transport_licence_system.Repository.RenewalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class RenewalController {
    @Autowired
    private RenewalRepository renewalRepository;

    //    Get all renewals
    @GetMapping("/renewals")
    public List<Renewal> getAllRenewals() {
        return renewalRepository.findAll();
    }

    //    creteate renewal
    @PostMapping("/renewals")
    public Renewal createRenewal(@RequestBody Renewal renewal) {
        return renewalRepository.save(renewal);
    }

    //    get renewal by id
    @GetMapping("/renewals/{id}")
    public ResponseEntity<Renewal> getRenewalById(@PathVariable Long id) {
        Renewal renewal = renewalRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Renewal not exist with id :" + id));
        return ResponseEntity.ok(renewal);
    }
}

package tn.esprit.tic.se.springproject1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
        import tn.esprit.tic.se.springproject1.entities.Bloc;
import tn.esprit.tic.se.springproject1.services.IBlocService;

import java.util.List;

@RestController
@RequestMapping("/api/blocs")
public class BlocController {

    @Autowired
    private IBlocService blocService;

    // Retrieve all Blocs
    @GetMapping
    public List<Bloc> getAllBlocs() {
        return blocService.retrieveAllBlocs();
    }

    // Retrieve a Bloc by ID
    @GetMapping("/{idBloc}")
    public Bloc getBlocById(@PathVariable("idBloc") Long idBloc) {
        return blocService.retrieveBloc(idBloc);
    }

    // Add a new Bloc
    @PostMapping
    public Bloc addBloc(@RequestBody Bloc bloc) {
        return blocService.addBloc(bloc);
    }

    // Update an existing Bloc
    @PutMapping("/{idBloc}")
    public Bloc updateBloc(@PathVariable("idBloc") Long idBloc, @RequestBody Bloc bloc) {
        bloc.setIdBloc(idBloc);
        return blocService.updateBloc(bloc);
    }

    // Delete a Bloc
    @DeleteMapping("/{idBloc}")
    public void deleteBloc(@PathVariable("idBloc") Long idBloc) {
        blocService.removeBloc(idBloc);
    }
}

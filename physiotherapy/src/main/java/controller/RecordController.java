package controller;

import model.PatientRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.recordservice.IRecordService;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@CrossOrigin
public class RecordController {

    @Autowired
    private IRecordService service;

    @GetMapping("/records/find")
    public ResponseEntity<List<PatientRecord>> findByName(@RequestParam(name = "name") String name){
        List<PatientRecord> listPatient = service.findByName(name);
        if (!listPatient.isEmpty()) return ResponseEntity.ok(listPatient);
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/records")
    public ResponseEntity<PatientRecord> registerNewPatient(@RequestBody PatientRecord newPatient) throws URISyntaxException {
        PatientRecord res = service.register(newPatient);
        if (res != null){
            return ResponseEntity.created(new URI("/records/"+res.getIdRecord())).body(res);
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/records/{id}")
    public ResponseEntity<PatientRecord> findById(@PathVariable Integer id){
        PatientRecord res = service.findById(id);
        if (res != null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/allrecords")
    public ResponseEntity<PatientRecord> findAll(){
        List<PatientRecord> allPatients = service.findAll();
        if (allPatients != null) {
            return ResponseEntity.ok((PatientRecord) allPatients);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/records/{id}")
    public ResponseEntity<PatientRecord> setPatient(@RequestBody PatientRecord record, @PathVariable Integer id){
        if ((Integer)record.getIdRecord() == null){
             record.setIdRecord(id);
        }
        PatientRecord res = service.setPatient(record);
        if (res != null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/records/{id}")
    public ResponseEntity<PatientRecord> deactivate(@PathVariable Integer id){
        boolean res = service.deleteById(id);
        if (res) {
            return ResponseEntity.ok(service.findById(id));
        }
        return ResponseEntity.notFound().build();
    }
}

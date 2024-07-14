package mitra.suvankar.openshare.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mitra.suvankar.openshare.models.ResponseMessage;

@RestController
@RequestMapping("/api")
public class HeartbeatController {

    @GetMapping(path="/heartbeat", produces="application/json")
    public ResponseEntity<ResponseMessage> getHeartBeat() {
        ResponseMessage message = new ResponseMessage();
        message.setMessage("success");
        return ResponseEntity.ok().body(message);
    }
}

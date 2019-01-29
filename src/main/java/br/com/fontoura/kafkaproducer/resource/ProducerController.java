package br.com.fontoura.kafkaproducer.resource;

import static org.springframework.http.HttpStatus.OK;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fontoura.kafkaproducer.service.ProducerService;

@RestController
@RequestMapping("/producers")
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @ResponseStatus(OK)
    @GetMapping
    public void producerMessage(@PathParam("message") String message) {
        producerService.producerMessage(message);
    }


}

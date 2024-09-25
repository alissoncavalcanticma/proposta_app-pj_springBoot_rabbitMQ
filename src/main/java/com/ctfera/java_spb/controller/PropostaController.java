package com.ctfera.java_spb.controller;

import com.ctfera.java_spb.dto.PropostaRequestDTO;
import com.ctfera.java_spb.dto.PropostaResponseDTO;
import com.ctfera.java_spb.service.PropostaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor //Anotação Lombok para criar construtor em tempo de execução, substitue o @Autowired
@RestController
@RequestMapping("/proposta")
public class PropostaController {

    //@Autowired //Anotação para definir o uso da instância gerenciada pelo Spring
    //Será instanciado pelo construtor gerado em tempo de execução pela anotação AllArgsConstructor do lombok
    private PropostaService propostaService;

    @PostMapping
    public ResponseEntity<PropostaResponseDTO> criar(@RequestBody PropostaRequestDTO requestDTO){

        PropostaResponseDTO responseDTO = propostaService.criar(requestDTO);

        return ResponseEntity.ok(responseDTO);
    }
}
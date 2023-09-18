package com.example.mspedido.controller;

import com.example.mspedido.entity.Pedido;
import com.example.mspedido.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @GetMapping()
    public ResponseEntity<List<Pedido>> list() {
        return ResponseEntity.ok(pedidoService.listar());
    }

    @PostMapping()
    public ResponseEntity<Pedido> save(@RequestBody Pedido pedido) {
        return ResponseEntity.ok(pedidoService.guardar(pedido));
    }

    @PutMapping()
    public ResponseEntity<Pedido> update(@RequestBody Pedido pedido) {
        return ResponseEntity.ok(pedidoService.actualizar(pedido));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> listById(@PathVariable(required = true) Integer id) {
        System.out.println("Pedido+ " + id);
        return ResponseEntity.ok().body(pedidoService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Pedido>> deleteById(@PathVariable(required = true) Integer id) {
        pedidoService.eliminarPorId(id);
        return ResponseEntity.ok(pedidoService.listar());
    }
}

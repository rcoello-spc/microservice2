package com.prueba.microservice2.repository.entity;

import com.prueba.microservice2.model.Cliente;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cuenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String numeroCuenta;

    private Long clienteId;

    private String tipoCuenta;
    private Double saldoInicial;
    private Double saldoDisponible;
    private String estado;

    @Transient
    private Cliente cliente;

    @Transient
    private List<Movimiento> movimientos;

    // Getters
    public Long getId() {
        return id;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public Double getSaldoInicial() {
        return saldoInicial;
    }

    public Double getSaldoDisponible() {
        return saldoDisponible;
    }

    public String getEstado() {
        return estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public void setSaldoInicial(Double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public void setSaldoDisponible(Double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
}
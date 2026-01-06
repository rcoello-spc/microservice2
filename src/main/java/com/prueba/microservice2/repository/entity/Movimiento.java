package com.prueba.microservice2.repository.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Movimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroCuenta;
    private Date fecha;
    private String tipoMovimiento;
    private Double valor;
    private Double saldo;

    @Transient
    private String nombreCliente;
    @Transient
    private String tipoCuenta;
    @Transient
    private String estadoCuenta;

    // Getters
    public Long getId() {
        return id;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public Double getValor() {
        return valor;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public String getEstadoCuenta() {
        return estadoCuenta;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public void setEstadoCuenta(String estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }
}
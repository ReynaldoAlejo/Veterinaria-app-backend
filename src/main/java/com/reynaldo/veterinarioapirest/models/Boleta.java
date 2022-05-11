package com.reynaldo.veterinarioapirest.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "boletas")
public class Boleta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "create_at")
    private Date createAt;

    private String observacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    @JsonIgnoreProperties(value={"boletas","hibernateLazyInitializer","Handler"} ,allowSetters = true)
    private Cliente cliente;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "boleta_id")
    @JsonIgnoreProperties(value={"boletas","hibernateLazyInitializer","Handler"})
    private List<ItemBoleta> itemsBoleta;

    public Boleta(){
        this.itemsBoleta =new ArrayList<>();
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemBoleta> getItemsBoleta() {
        return itemsBoleta;
    }

    public void setItemsBoleta(List<ItemBoleta> itemsBoleta) {
        this.itemsBoleta = itemsBoleta;
    }

    public Double getImporteTotal(){
        Double total = 0.0;
        for (ItemBoleta items : itemsBoleta){
            total += items.getImporte();
        }
        return total;
    }
}

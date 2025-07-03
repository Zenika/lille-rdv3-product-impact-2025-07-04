package com.zenika;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "material_impacts_per_kg")
public class MaterialImpactEntity {

    @Id
    @Column(name = "material_id")
    public String materialId;

    @Column(name = "co2_kg_eq")
    public BigDecimal co2KgEquivalent;

    @Column(name = "water_use_l")
    public BigDecimal waterUseLiter;

    @Column(name = "fossil_resources_use_mj")
    public BigDecimal fossilResourcesUseMJ;
}